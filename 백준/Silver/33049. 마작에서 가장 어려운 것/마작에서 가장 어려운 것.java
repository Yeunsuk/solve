import java.util.*; //33049(수학) 마작에서 가장 어려운 것
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int three = Integer.parseInt(st.nextToken());
    int four = Integer.parseInt(st.nextToken());
    int num = Integer.parseInt(st.nextToken());

    for(int i = 0; i <= num; i++) {
      int tmp1 = three + i, tmp2 = four + num - i;
      
      if((tmp1 % 3 == 0) && (tmp2 % 4 == 0)) {
        bw.write((tmp1 / 3) + " " + (tmp2 / 4));
        bw.close();
        return;
      }
    }
    
    bw.write("-1");
    bw.close();
  }
}