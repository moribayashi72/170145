import java.net.*;
import java.io.*;
  
public class MyServer01 {
  	// data
  	// methoda
  	// main
  public static void main (String[] args) {
  	int portNum = 6000;
  	// 変数宣言
  	ServerSocket serv = null;
  
  	try {
  		// サーバソケットをつくる
  		serv = new ServerSocket(portNum, 30);
  	} catch (IOException e) {
  		System.err.println("サーバエラー");
  		System.exit(1);
  	}
  }
}