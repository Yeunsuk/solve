import java.util.*; //9322(문자열) 철벽 보안 알고리즘
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

    while(Test-- > 0) {
      int num =  Macro(br.readLine());

      Map<String, Integer> map = new HashMap<>();
      String[] arr1 = br.readLine().split(" ");
      String[] arr2 = br.readLine().split(" ");
      String[] std = br.readLine().split(" ");
      String[] rlt = new String[num];
      
      for(int i = 0; i < num; i++) {
        map.put(arr1[i], i);
      }
      
      for(int i = 0; i < num; i++) {
        int tmp = map.get(arr2[i]);
        rlt[tmp] = std[i];
      }
      
      for(String str : rlt) sb.append(str).append(' ');
      sb.append('\n');
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}