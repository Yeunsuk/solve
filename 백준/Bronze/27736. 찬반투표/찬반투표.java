import java.util.*; //27736(구현) 찬반투표
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), std = n / 2, sum = 0, cnt = 0;
    StringTokenizer st = new StringTokenizer(br.readLine());
    if(n % 2 != 0) std++;
    
    for(int i = 0; i < n; i++) {
      int tmp = Macro(st.nextToken());
      if (tmp != 0) sum += tmp;
      else cnt++;
    }
    
    if(cnt >= std) bw.write("INVALID");
    else bw.write(sum > 0 ? "APPROVED" : "REJECTED");
    bw.close();
  }
}