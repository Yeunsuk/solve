import java.util.*; // 30923(기하학) 크냑과 3D 프린터
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    long rlt = 0, pre = 0;
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < num; i++) {
      long tmp = Long.parseLong(st.nextToken());
      rlt += Math.abs(tmp - pre);
      rlt += tmp * 2;
      rlt += 2;
      pre = tmp;
    }
    
    rlt += pre;
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}