import java.util.*; //11576(수학) Base Conversion 
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    List<Integer> li = new ArrayList<>();
    int a = Macro(st.nextToken());
    int b = Macro(st.nextToken());
    int m = Macro(br.readLine());
    int std = 0, i;

    st = new StringTokenizer(br.readLine());
    for(i = m; i > 0; i--) {
      int tmp = Macro(st.nextToken());
      std += tmp * Math.pow(a, i - 1);
    }

    if(std == 0) sb.append(0);
    while(std != 0) {
      li.add(std % b);
      std /= b;
    }
    
    for(i = li.size() - 1; i > -1; i--) sb.append(li.get(i) + " ");
    bw.write(String.valueOf(sb));
    bw.close();
  }
}