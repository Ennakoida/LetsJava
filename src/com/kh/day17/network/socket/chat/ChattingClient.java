package com.kh.day17.network.socket.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChattingClient {

	public static void main(String[] args) {
		String ipAddress = "127.0.0.1";
		int port = 4444; // server의 port번호와 동일
		
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null; // 보조스트림, 기본 데이터타입 입출력을 도와줌
		DataOutputStream dos = null;
		
		Scanner sc = new Scanner(System.in);		
		try {
			System.out.println("서버에 연결중입니다...");
			Socket socket = new Socket(ipAddress, port); // try catch
			System.out.println("채팅 서버에 접속하였습니다.");
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			System.out.println("서버와의 채팅을 시작합니다.");
			
			while(true) {
				// 받기 
				String recvMsg = dis.readUTF(); // writeUTF()로 보낸 것을 읽음 : readUTF()
				System.out.printf(">> 서버(상대) : %s\n", recvMsg);
				
				// 보내기
				System.out.print("클라이언트(나) : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				dos.flush();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

//
//서버에 연결중입니다.
//채팅서버에 접속하였습니다.
//서버와의 채팅을 시작합니다.
//서버(상대) : 하이
//클라이언트(나) : 네네