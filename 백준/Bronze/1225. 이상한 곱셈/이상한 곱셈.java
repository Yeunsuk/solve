import java.util.*; //1225(수학) 이상한 곱셈
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    String a = st.nextToken(), b = st.nextToken();
    long rlt = 0;

    for(int i = 0; i < a.length(); i++) for(int j = 0; j < b.length(); j++) rlt += (a.charAt(i) - '0') * (b.charAt(j) - '0');
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}