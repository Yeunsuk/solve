import java.util.*; //2530(수학) 인공지능 시계
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int A = Macro(st.nextToken());
    int B = Macro(st.nextToken());
    int C = Macro(st.nextToken());
    int D = Macro(br.readLine());

    C += D;
    B += C / 60;
    C = C % 60;
    A += B / 60;
    B = B % 60;
    A = A % 24;
    
    bw.write(A + " " + B + " " + C);
    bw.close();
  }
}