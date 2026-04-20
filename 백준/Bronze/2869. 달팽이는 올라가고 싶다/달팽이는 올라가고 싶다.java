import java.util.*; //2869(수학) 달팽이는 올라가고 싶다
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int pus = Macro(st.nextToken());
    int mus = Macro(st.nextToken());
    int len = Macro(st.nextToken());

    pus -= mus;
    len -= mus;
    int rlt = len / pus;
    if(len % pus != 0) rlt++;

    bw.write(String.valueOf(rlt));
    bw.close();
  }
}
