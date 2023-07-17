package com.kh.day16.network.exam2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam_DataServer {

	public static void main(String[] args) {
		InputStream is = null; // 데이터 받기
		OutputStream os = null; // 데이터 보내기
		
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(4885); // port번호 지정
			System.out.println("서버 소켓 생성 완료");
			System.out.println("클라이언트 연결 대기중 ...");
			Socket socket =	serverSocket.accept(); // 기다림
			System.out.println("연결 수락됨!");
			
			// ========== 데이터 받기 ===========
			is = socket.getInputStream();
			byte [] bytes = new byte[1024];
			int readByteNo = is.read(bytes);
			String message = new String(bytes, 0, readByteNo); // bytes to String 변환
			System.out.printf("데이터 받기 성공 : %s\n", message);
			
			// **********************************************

			// ========== 데이터 보내기 ============
			os = socket.getOutputStream();
			message = "Hello Client!"; // message 변수 같이 써도 됨
			byte [] buf = message.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("데이터 전송 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}

// Address already in use: NET_Bind 
// 서버가 이미 돌고 있는데 새로 또 돌릴 때 생성되는 error msg

// Client와 Server에서 "보내기 <> 받기" 핑퐁이 이루어져야한다.
// ㄴ 하나만 있으면 안됨! 꼭 보내기가 있으면 받기가 있어야함