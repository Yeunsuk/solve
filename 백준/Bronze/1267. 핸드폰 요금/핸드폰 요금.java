import java.util.*; //1267(수학) 핸드폰 요금
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());
    StringTokenizer st;
    int ymy = 0, m = 0;

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++) {
      int tmp = Macro(st.nextToken());
      ymy += ((tmp / 30) + 1) * 10;
      m += ((tmp / 60) + 1) * 15;
    }

    if(ymy == m) bw.write("Y M " + ymy); 
    else if(m < ymy) bw.write("M " + m);
    else bw.write("Y " + ymy);
    bw.flush();
  }
}