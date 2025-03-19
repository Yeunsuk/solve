import java.util.*; //29729(구현) 가변 배열
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int ori = Integer.parseInt(st.nextToken()), sum = 0;
    int num = Integer.parseInt(st.nextToken());
    int ber = Integer.parseInt(st.nextToken());

    
    for(int i = 0; i < num + ber; i++) {
      int tmp = Integer.parseInt(br.readLine());
      if(tmp == 1) {
        sum++;
        if(sum > ori) ori *= 2;
      }else sum--;
    }
    
    bw.write(String.valueOf(ori));
    bw.close();
  }
}