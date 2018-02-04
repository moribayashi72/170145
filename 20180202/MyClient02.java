import java.net.*;
import java.io.*;
  
  public class MyClient02 {
  	// data
  	// method
  	// main
  	public static void main (String[] args) {
  		// 変数宣言
  		Socket sock = null;
  		OutputStream os = null;
  		PrintWriter pw = null;
      String ipAddr = "127.0.0.1";

  		// サーバに接続して～する
  		try {
  			// サーバに接続する
  			sock = new Socket(ipAddr,5999);
  			System.out.println("サーバに接続しました.");
  
  			// 入力ストリームを取得する
  			os = sock.getOutputStream();
  			pw =new PrintWriter(os);

  
  			pw.println("ALOHA");
        pw.flush();
  
  		} catch (IOException e) {
  			System.err.println("クライアントエラー");
  			System.exit(1);
  		}
  	}
  }