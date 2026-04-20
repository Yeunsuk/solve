import java.util.*; //11050(수학) 이항 계수 1
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  static int Cul(int n) { 
    if(n <= 1)	return 1;
    return n * Cul(n - 1);
  }
  
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Macro(st.nextToken());
    int b = Macro(st.nextToken());

    bw.write(String.valueOf(Cul(a) / (Cul(a - b) * Cul(b))));
    bw.close();
  }
}