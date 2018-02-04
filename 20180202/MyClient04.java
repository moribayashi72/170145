import java.net.*;
import java.io.*;
  
  public class MyClient04 {
  	// data
  	// method
  	// main
  	public static void main (String[] args) {
  		// 変数宣言
  		Socket sock = null;
  		OutputStream os = null;
  		PrintWriter pw = null;
      String ipAddr = "172.16.21.56";
      String data= "170145"+"\n"+"moribayashi72"+"\n"+"tst";

  		// サーバに接続して～する
  		try {
  			// サーバに接続する
  			sock = new Socket(ipAddr,4999);
  			System.out.println("サーバに接続しました.");
  
  			// 入力ストリームを取得する
  			os = sock.getOutputStream();
  			pw =new PrintWriter(os);

  			//pw.println(data);
        pw.println(data);
        pw.flush();
  
  		} catch (IOException e) {
  			System.err.println("クライアントエラー");
  			System.exit(1);
  		}
  	}
  }