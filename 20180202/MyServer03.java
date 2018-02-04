import java.net.*;
import java.io.*;

public class MyServer03{

	public static void main(String[] args){
		ServerSocket serv = null;
		Socket clientSock = null;
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		
		
		try{
			serv= new ServerSocket(5999,30);
			while(true){
			clientSock = serv.accept();
			
			System.out.println("接続を受付ました");

				is = clientSock.getInputStream();
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);

				String data = br.readLine();
				System.out.println(data);
			}
			}catch (IOException e) {
  				System.err.println("エラー");
  				System.exit(1);
  		}
	}
}