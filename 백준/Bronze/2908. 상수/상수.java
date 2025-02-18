import java.util.*; //2908(수학) 상수
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    String num1 = st.nextToken();
    String num2 = st.nextToken();
    String n1 = "", n2 = "";

    for(int i = 0; i < 3; i++) {
      n1 += num1.charAt(2 - i);
      n2 += num2.charAt(2 - i);
    }

    bw.write(Integer.parseInt(n1) > Integer.parseInt(n2) ? n1 : n2);
    bw.close();
  }
}