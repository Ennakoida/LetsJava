package com.kh.day16.network.exercise1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientServer {
	public static void main(String[] args) {
		String ipAddress = "127.0.0.1";
//		String ipAddress = "192.168.60.219";
		int port = 4444;
//		int port = 8888;
		
		OutputStream os = null;
		InputStream is = null;
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("연결 요청중...");
			Socket socket = new Socket(ipAddress, port); // 설정된 IP, Port에 연결 요청
			// 연결된 후에는 소켓 객체 생성
			System.out.println("연결 성공!!");
			
			os = socket.getOutputStream(); // 프로그램 기준 나가니까 OutputStream
			is = socket.getInputStream();
			
			while(true) {
				// 데이터 보내기
				System.out.print("클라이언트(나) : ");
				String msg = sc.nextLine();
				byte [] bytes = msg.getBytes();
				os.write(bytes); // 보낼 때는 버퍼에 씀 : write() 메소드 사용
				os.flush(); // 버퍼 비워주기 : flush()
				
				// 데이터 받기
				bytes = new byte[1024];
				int readByteNo = is.read(bytes);
				msg = new String(bytes, 0, readByteNo);
				System.out.printf("서버(상대) : %s\n", msg);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


//연결 요청중...
//연결 성공!!
//클라이언트(나) : 하이요 일용자님
//데이터 전송 성공!
//서버(상대) : 네 안녕하세요