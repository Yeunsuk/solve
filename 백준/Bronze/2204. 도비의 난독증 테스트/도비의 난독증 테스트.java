import java.util.*; //2204(구현) 도비의 난독증 테스트
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    while(true) {
      int n = Integer.parseInt(br.readLine());
      if(n == 0) break;
      
      String[] arr = new String[n];
      HashMap<String,String> map = new HashMap<>();
      
      for(int i = 0; i < n; i++) {
        String str = br.readLine();
        String tmp = str.toLowerCase();
        map.put(tmp, str);
        arr[i] = tmp;
      }
        
      Arrays.sort(arr);
      sb.append(map.get(arr[0])).append("\n");
    }

    System.out.print(sb);
  }
}