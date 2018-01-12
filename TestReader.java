import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
     
public class TestReader {
     // main
     public static void main(String[] args) {
     	try {
     		FileReader fr = new FileReader("data.txt");
     		BufferedReader br = new BufferedReader(fr);
     
     		String msg = br.readLine();
     		System.out.println("HELLO");
     		System.out.println(msg);
     	} catch(IOException e) {
     		System.out.println("file read ... failed.");
     	}
     }
}