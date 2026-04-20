import java.util.*; //5704(구현) 팬그램
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str, rlt;
    int[] arr;

    while(true) {
      rlt = "Y";
      arr = new int[26];
      str = br.readLine().replace(" ", "");
      
      if(str.equals("*")) break;
      for (int i = 0; i < str.length(); i++) ++arr[str.charAt(i) - 97];
      
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
          rlt = "N";
          break;
        }
      }
      
      bw.write(String.valueOf(rlt));
      bw.newLine();
    }
    
    bw.close();
  }
}