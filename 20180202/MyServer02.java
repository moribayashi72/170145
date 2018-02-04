import java.net.*;
import java.io.*;

public class MyServer02{
	public static void main(String[] args) {
		int portNum = 6000; 
		
		//変数宣言
		ServerSocket servSock = null;
		Socket clientSock = null;

		try{
			//サーバーソケット
			servSock = new ServerSocket(portNum,30);

			while(true){
				//クライアントの接続を待ち受ける
				clientSock = servSock.accept();
				System.out.println("接続を受け付けました");

				//ソケットからクライアントのIPを取得する
				InetAddress iaClinet = clientSock.getInetAddress();
				String ipClient = iaClinet.toString();
				System.out.println("クライアントIP："+ipClient);
			}
		}catch(IOException e){
			System.err.println("サーバーエラー");
			System.exit(1);
		}	
	}
}