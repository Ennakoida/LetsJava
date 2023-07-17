package com.kh.day16.network.exam3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Exam_ChattingClient {

	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 4444;
		
		OutputStream os = null; // 보내기
		InputStream is = null; // 받기
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("연결 요청중...");
			Socket socket = new Socket(address, port); // try catch
			System.out.println("연결 성공!!");
			
			// ========== 1. 데이터 보내기 ===========
			os = socket.getOutputStream();
			System.out.print("Client(나) : ");
			String msg = sc.nextLine();
			byte [] buf = msg.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("데이터 전송 성공!");
			// ========== 보내기 완료 ===========
			
			// =========== 4. 데이터 받기 ============
			is = socket.getInputStream();
			int readByteNo = is.read(buf);
			msg = new String(buf, 0, readByteNo);
			System.out.printf("Server(상대) : %s\n", msg);		
			// ========== 받기 완료 ===========
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
