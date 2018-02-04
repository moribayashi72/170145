import java.net.*;
import java.io.*;
  
  public class MyClient03 {
  	// data
  	// method
  	// main
  	public static void main (String[] args) {
  		// 変数宣言
  		Socket sock = null;
  		InputStream is = null;
      InputStreamReader isr = null;
      BufferedReader br = null;
      String ipAddr = "127.0.0.1";

  		// サーバに接続して～する
  		try {
  			// サーバに接続する
  			sock = new Socket(ipAddr,5000);
  			System.out.println("サーバに接続しました.");
  
  			is = sock.getInputStream();
        isr = new InputStreamReader(is);
        br = new BufferedReader(isr);

        String data = br.readLine();
        System.out.println(data);
  
  		} catch (IOException e) {
  			System.err.println("クライアントエラー");
  			System.exit(1);
  		}
  	}
  }