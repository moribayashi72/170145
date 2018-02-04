import java.net.*;
import java.io.*;

public class MyClient01{

	public static void main(String[] args) {
		String ipAddr = "127.0.0.1";
		int portNum = 6000;

		Socket sock = null;

		try{
			sock = new Socket(ipAddr,portNum);
			System.out.println("サーバに接続しました");
		}catch (IOException e){
			System.out.println("クライアントエラー");
			System.exit(1);

		}

	}
}