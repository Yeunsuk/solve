import java.util.*; //24315(수학) 알고리즘 수업 - 점근적 표기 3
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a1 = Integer.parseInt(st.nextToken());
    int a0 = Integer.parseInt(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    int c1 = Integer.parseInt(st.nextToken());
    int c2 = Integer.parseInt(st.nextToken());
    int n0 = Integer.parseInt(br.readLine());
    
    bw.write(String.valueOf(c1 <= a1 && a1 <= c2 && c1 * n0 <= a1 * n0 + a0 && a1 * n0 + a0 <= c2 * n0 ? 1 : 0));
    bw.close();
  }
}