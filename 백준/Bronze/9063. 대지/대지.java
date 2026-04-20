import java.util.*; //9063(기하학) 대지
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int xmn = 10000, xmx = -10000, ymn = 10000, ymx = -10000;
    int num = Macro(br.readLine());
    int[] x = new int[num];
    int[] y = new int[num];
    StringTokenizer st;
    
    for(int i = 0; i < num; i++) {
      st = new StringTokenizer(br.readLine());
      x[i] = Macro(st.nextToken());
      y[i] = Macro(st.nextToken());
      
      if(x[i] < xmn) xmn = x[i];
      if(x[i] > xmx) xmx = x[i];
      if(y[i] < ymn) ymn = y[i];
      if(y[i] > ymx) ymx = y[i];
    }
    
    bw.write(String.valueOf((xmx - xmn) * (ymx - ymn)));
    bw.close();
  }
}