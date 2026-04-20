import java.util.*; //23027(구현) 1번부터 문제의 상태가…?
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] arr = {"B", "C", "D", "F"};
    String[] std = {"A", "B", "C"};
    String str = br.readLine();

    for(int i = 0; i < std.length; i++) {
      if(str.contains(std[i])) {
        for(int j = i; j < arr.length; j++) str = str.replace(arr[j], std[i]);
        bw.write(str);
        bw.close();
        return;
      }
    }
    
    for(int i = 0; i < str.length(); i++) bw.write("A");
    bw.close();
  }
}