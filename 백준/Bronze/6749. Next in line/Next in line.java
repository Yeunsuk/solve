import java.util.*; //6749(수학) Next in line 
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Macro(br.readLine());
    int b = Macro(br.readLine()) * 2;
    
    bw.write(String.valueOf(b - a));
    bw.close();
  }
}