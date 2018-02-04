import java.net.*;
import java.io.*;

public class MyServer04{

	public static void main(String[] args){
		ServerSocket serv = null;
		Socket clientSock = null;
		OutputStream os = null;
  		PrintWriter pw = null;

		
		
		try{
			serv= new ServerSocket(5000,30);
			while(true){
			clientSock = serv.accept();
			
			System.out.println("接続を受付ました");

				os = clientSock.getOutputStream();
				pw =new PrintWriter(os);

  
  				pw.println("HELLO");
        		pw.flush();;
			}
			}catch (IOException e) {
  				System.err.println("エラー");
  				System.exit(1);
  		}
	}
}