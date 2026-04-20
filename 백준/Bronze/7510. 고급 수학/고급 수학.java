import java.util.*; //7510(기하학) 고급 수학
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()) + 1;
    int[] arr = new int[3];
    StringTokenizer st;

    for(int i = 1; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      arr[0] = Macro(st.nextToken());
      arr[1] = Macro(st.nextToken());
      arr[2] = Macro(st.nextToken());
      Arrays.sort(arr);
      
      if((arr[0] * arr[0]) + (arr[1] * arr[1]) == (arr[2] * arr[2])) bw.write("Scenario #" + i + ":\nyes\n\n");
      else bw.write("Scenario #" + i + ":\nno\n\n");
    }
    
    bw.close(); 
  }
}