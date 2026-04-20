import java.util.*; //11023(구현) 더하기 3
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = st.countTokens(), rlt = 0;

    for(int i = 0; i < n; i++) rlt += Macro(st.nextToken());
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}