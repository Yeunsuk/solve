import java.util.*; //2884(구현) 알람시계
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int h = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken()) - 45;
    if(m < 0) {
      m += 60;
      h--;
    }
    
    bw.write((h < 0 ? 23 : h) + " " + m);
    bw.close();
  }
}