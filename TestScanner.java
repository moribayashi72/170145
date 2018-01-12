import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;
    
public class TestScanner {
  // data
  // method
  // main
  public static void main(String[] args) {
    try {
      // FILEを使う準備
      FileWriter fw = new FileWriter("data.txt", true);
      BufferedWriter bw = new BufferedWriter(fw);
          
      String userData = "";
          
      // 繰り返し：ユーザがデータを入力する
      while(true) {
        // git bashでデータを入力する
        System.out.print("input msg> ");
        userData = new Scanner(System.in).nextLine();
            
        // もし、exitと入力したら、繰り返し終わり
        if(userData.equals("exit")) break;
            
        // ファイルに書き込む
        bw.write(userData+"\r\n");
      }
     // ファイルを閉じる。書き込み完了
          bw.close();
    } catch(IOException e) {
      System.out.println("file writing ... failed.");
    }
  }
}