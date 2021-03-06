package ping;

import java.net.*;
import java.io.*;

public class PingServer02 extends Thread {
	private boolean isStart;
	
	ServerSocket server;
	
	public boolean isStart() {
		
		return isStart;
	}

	public void setStart(boolean isStart) {
		this.isStart = isStart;
	}

	public PingServer02() {
		try {
			server = new ServerSocket(7777);
			while(true) {
				System.out.println("서버 접속 대기");
				
				// 클라이언트에게 접속 허용
				Socket socket = server.accept();
				String ip = socket.getInetAddress().getHostAddress();
				System.out.println("###" + ip + " ] 접속 완료");
				
				// 데이터 입출력 준비
				InputStream in = socket.getInputStream();
				OutputStream out = socket.getOutputStream();
				
				// 데이터 받고
				byte[] buff = new byte[10240];
				int len = in.read(buff);
				// 문자열 변환
				String msg = new String(buff, 0, len);
				// 출력
				System.out.println(ip + " : " + msg);
				
				// 응답
				// 데이터 만들고
				String remsg = msg + " - server";
				// 서버메세지 전송
				byte[] buff1 = remsg.getBytes();
				out.write(buff1);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} 
		System.out.println("***** 서버 프로그램 종료 *****");
	}

}
