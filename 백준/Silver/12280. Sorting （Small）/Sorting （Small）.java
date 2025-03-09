import java.util.*; //12280(구현) Sorting (Small)
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int Test = Macro(br.readLine());

    for(int i = 0; i < Test; i++) {
      sb.append("Case #").append(i + 1).append(":");
      int num = Macro(br.readLine());
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      List<Integer> even = new ArrayList<>();
      List<Integer> odd = new ArrayList<>();
      int evenidx = 0, oddidx = 0;
      int[] arr = new int[num];

      for(int j = 0; j < num; j++) {
        arr[j] = Macro(st.nextToken());
      }
      
      for(int j = 0; j < num; j++) {
        if(arr[j] % 2 == 0) even.add(arr[j]);
        else odd.add(arr[j]);
      }
      
      Collections.sort(even, Collections.reverseOrder());
      Collections.sort(odd);
      
      for(int j = 0; j < num; j++) {
        if(arr[j] % 2 == 0) sb.append(" ").append(even.get(evenidx++));
        else sb.append(" ").append(odd.get(oddidx++));
      }

      sb.append("\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}