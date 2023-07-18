package com.kh.day17.network.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 4444;
		
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
				
		try {
//			System.out.println(".");
//			Thread.sleep(1000); // 딜레이 // 예외처리
//			System.out.println(".");
//			Thread.sleep(1000); 
//			System.out.println(".");
//			Thread.sleep(1000);

			System.out.println("서버 구동중입니다...");
			
			for(int i = 1; i <= 10; i++) {
				Thread.sleep(200);
//				System.out.print(i + "% ");
				System.out.print("■");
			}
			System.out.println();
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다...");
			Socket sck = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			
			is = sck.getInputStream();
			os = sck.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			while(true) {
				String readCal = dis.readUTF();
				System.out.printf("받은 메세지 : %s\n", readCal);
				
				if(readCal.equals("exit")) {
					System.out.println("클라이언트가 종료하였습니다.");
					break;
				}
				
				String[] calArr = readCal.split(" ");
				
				if(calArr.length != 3) {
					String errMsg = "wrong";
					dos.writeUTF(errMsg);
					continue;
				}
				
				int num1 = Integer.parseInt(calArr[0]);
				int num2 = Integer.parseInt(calArr[2]);
				String operator = calArr[1];
				int result = 0;
				
				switch(operator) {
				case "+" :
					result = num1 + num2;
					break;
				case "-" :
					result = num1 - num2;
					break;
				case "/" :
					result = num1 / num2;
					break;
				case "*" :
					result = num1 * num2;
					break;
				case "%" :
					result = num1 % num2;
					break;
				}

				dos.writeUTF(String.valueOf(result));
				dos.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

// 서버 구동중입니다.
// 클라이언트의 연결을 기다리고 있습니다...
// 클라이언트와 연결되었습니다.
// 받은 메세지 : 23
// 받은 메세지 : 24 + 42