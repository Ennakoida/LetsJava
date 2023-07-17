package com.kh.day16.network.exercise1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChattingServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		InputStream is = null;
		OutputStream os = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			serverSocket = new ServerSocket(4444); // 포트 번호 설정 후 연결 대기
//			serverSocket = new ServerSocket(8888); // 포트 번호 설정 후 연결 대기
			System.out.println("서버 소켓 생성");
			System.out.println("클라이언트 접속 대기중...");
			Socket socket = serverSocket.accept(); // 연결된 후 소켓 객체 생성
			System.out.println("클라이언트 접속 완료");
			
			is = socket.getInputStream(); // 프로그램 기준 들어오니까 InputStream
			os = socket.getOutputStream();
			
			while(true) {
				// 데이터 받기
				byte [] bytes = new byte[1024];
				int readByteNo = is.read(bytes); // 읽을 때는 read() 메소드 사용
				// bytes에는 읽은 데이터, readByteNo는 읽은 갯수
				// byte로 출력할 수 없어서 문자열로 만들어준다
				String msg = new String(bytes, 0, readByteNo); 
				System.out.printf("클라이언트(상대) : %s\n", msg);

				// 데이터 보내기
				System.out.print("서버(나) : ");
				msg = sc.nextLine();
				bytes = msg.getBytes();
				os.write(bytes);
				os.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



//서버 소켓 생성
//클라이언트 접속 대기중...
//클라이언트 접속 완료
//클라이언트(상대) : 하이요 일용자님
//서버(나) : 네 안녕하세요
//데이터 전송 성공!!
