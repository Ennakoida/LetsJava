package com.kh.day17.network.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class BaseballClient {

	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 4444;
		
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		Scanner sc = new Scanner(System.in);
		try {
			Socket socket = new Socket(address, port);
			System.out.println("클라이언트 소켓을 생성하였습니다.");
			System.out.println(address);
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			System.out.println("게임 준비 완료");
			while(true) {
				System.out.print("--> ");
				String input = sc.nextLine();
				dos.writeUTF(input);
				dos.flush();
				
				String result = dis.readUTF();
				System.out.println(result);
				
//				if(result.equals("3스트라이크 0볼")) {
				if(result.startsWith("3")) {
					System.out.println("축하합니다. 아웃입니다!");
					break;
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}


//클라이언트 소켓을 생성하였습니다.
///127.0.0.1
//게임 준비 완료
//--> 4 2 1
//0스트라이크 0볼
//--> 1 2 3
//0스트라이크 1볼
//--> 2 3 4
//1스트라이크 0볼
//--> 5 3 8
//2스트라이크 0볼
//--> 5 3 7
//1스트라이크 1볼
//--> 7 3 8
//3스트라이크 0볼
//축하합니다. 아웃입니다!

// 위치 + 숫자 일치 : 스트라이크
// 숫자만 일치 : 볼