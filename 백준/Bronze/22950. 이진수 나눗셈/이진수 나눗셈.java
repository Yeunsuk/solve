import java.util.*; //22950(수학) 이진수 나눗셈
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), cnt = 0;
    String str = br.readLine();
    boolean std = false;
    
    int k = Integer.parseInt(br.readLine());
    if(!str.contains("1")) std = true;
    else if(k == 0) std = true;
    else {
      for(int i = num - 1; i >= 0; i--) {
        if(str.charAt(i) == '1') break;
        cnt++;
      }
  
      std = cnt >= k;
    }
    
    bw.write(std ? "YES" : "NO");
    bw.close();
  }
}