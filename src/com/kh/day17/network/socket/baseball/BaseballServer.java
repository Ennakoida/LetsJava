package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class BaseballServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 4444;
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:ms");
//		Random rand = new Random();
		
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			System.out.println("서버소켓을 생성하였습니다.");
			System.out.println(sdf.format(date));
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 접속을 기다립니다...");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			
			System.out.print("서버 숫자 -> ");
			int numArr [] = new int[3];
			for(int i = 0; i < numArr.length; i++) {
//				numArr[i] = rand.nextInt(9) + 1;
				numArr[i] = (int) (Math.random() * 9 + 1);
				
				for(int j = 0; j < i; j++) {
					if(numArr[i] == numArr[j]) {
						i--;
						break;
					}			
				}		
				
			}
			
			for(int i = 0; i < numArr.length; i++) {
				System.out.print(numArr[i] + " ");				
			}
			System.out.println();
			System.out.println("서버 준비 완료");

			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			while(true) {
				String recv = dis.readUTF();
				System.out.println("받기 : " + recv);
				
				String [] recvArr = recv.split(" ");
				
				int strike = 0;
				int ball = 0;
				
				for(int i = 0; i < 3; i++) {
//					if(numArr[i] == Integer.parseInt(recvArr[i])){
//						strike++;
//					} else {
//						for(int j = 0; j < 3; j++) {
//							if(numArr[i] == Integer.parseInt(recvArr[j])) {
//								ball++;
//							}
//						}
//					}
					
					for(int j = 0; j < 3; j++) {
						if(numArr[i] == Integer.parseInt(recvArr[j])){
							if(i == j) 	  // 값이 같은 상태에서 인덱스가 같음
								strike++; // ㄴ 스트라이크
							else 		  // 값이 같은 상태에서 인덱스가 다름
								ball++;	  // ㄴ 볼
						}
					}
				}
				
				String result = strike + "스트라이크 " + ball + "볼";
				
				System.out.println(result);
				
				dos.writeUTF(result);
				dos.flush();
				
				if(strike == 3 && ball == 0) {
					System.out.println("아웃! 게임종료");
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


//서버소켓을 생성하였습니다.
//2023-07-18 12:04:56:15
//클라이언트의 접속을 기다립니다.
//클라이언트가 접속했습니다.
//서버 숫자 -> 7 3 8
//서버 준비 완료
//받기 : 4 2 1
//0스트라이크 0볼
//받기 : 1 2 3
//0스트라이크 1볼
//받기 : 2 3 4
//1스트라이크 0볼
//받기 : 5 3 8
//2스트라이크 0볼
//받기 : 5 3 7
//1스트라이크 1볼
//받기 : 7 3 8
//3스트라이크 0볼
//아웃! 게임종료

// 랜덤한 숫자 3개 (서버숫자) 뽑아서 클라이언트 접속 대기