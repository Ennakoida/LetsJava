package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalculatorClient {

	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 4444;
		
		OutputStream os = null;
		DataOutputStream dos = null;
		InputStream is = null;
		DataInputStream dis = null;
		// 한 번에 import : ctrl+shift+O
		
		Scanner sc = new Scanner(System.in);
		try {
			Socket sck = new Socket(address, port);
			System.out.println("서버와 연결되었습니다.");
			
			os = sck.getOutputStream();
			is = sck.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			
			for(;;) {
				System.out.print("계산식(빈칸으로 띄어 입력, 예 24 + 42) >> ");
				String sendCal = sc.nextLine();
//				dos.writeUTF(sendCal);
//				dos.flush();
				
//				String[] calArr = sendCal.split(" ");
//				int result = 0;
//				
//				if(calArr.length <= 1) {
//					System.out.println("잘못 입력하셨습니다. 형식에 맞게 입력해주세요.");
//					continue;
//				}
//				
//				for(int i = 0; i < calArr.length; i++) {
//					if(i == 1) {
//						result = Integer.parseInt(calArr[i-1]);
//					}
//					
//					if(i % 2 != 0) {
//						switch(calArr[i]) {
//						case "+" :
//							result += Integer.parseInt(calArr[i+1]); 
//							break;
//						case "-" :
//							result -= Integer.parseInt(calArr[i+1]);
//							break;
//						case "/" :
//							result /= Integer.parseInt(calArr[i+1]);
//							break;
//						case "*" :
//							result *=  Integer.parseInt(calArr[i+1]);
//							break;
//						case "%" :
//							result %= Integer.parseInt(calArr[i+1]);
//							break;
//						}
//					}
//				}
//				System.out.println("계산 결과 : " + result);
				
//				if(dis.readUTF().equals("wrong")) {
//					System.out.println("잘못 입력하셨습니다. 형식에 맞게 입력해주세요.");
//				} else {
//					System.out.println("계산 결과 : " + dis.readUTF());
//				}
				   
				dos.writeUTF(sendCal);
				if(sendCal.equalsIgnoreCase("exit")) {
					System.out.println("종료하였습니다.");
					break;
				}
				dos.flush();
				
				String recvMsg = dis.readUTF();
				
				if(recvMsg.equalsIgnoreCase("wrong")) {
					System.out.println("잘못 입력하셨습니다. 형식에 맞게 입력해주세요.");
					continue;
				}
				
				System.out.println("계산 결과 : " + recvMsg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

// 서버와 연결되었습니다.
// 계산식(빈칸으로 띄어 입력, 예 24 + 42) >> 23
// 잘못 입력하셨습니다. 형식에 맞게 입력해주세요.
// 계산식(빈칸으로 띄어 입력, 예 24 + 42) >> 24 + 42
// 계산결과 : 66
// 계산식(빈칸으로 띄어 입력, 예 24 + 42) >> // 무한반복