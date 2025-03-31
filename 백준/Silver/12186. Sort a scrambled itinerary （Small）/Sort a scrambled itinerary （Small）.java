import java.util.*; //12186(자료구조) Sort a scrambled itinerary (Small)
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int Test = Integer.parseInt(br.readLine());
    
    for(int i = 1; i <= Test; i++) {
      sb.append("Case #").append(i).append(": ");
      Map<String, String> map = new HashMap<>();
      int num = Integer.parseInt(br.readLine());
      String tmp = "";

      for(int j = 0; j < num; j++) {
        map.put(br.readLine(), br.readLine());
      }

      Set<String> set = new HashSet<>(map.values());
      for(String key : map.keySet()) {
        if(!set.contains(key)) {
          tmp = key;
          break;
        }
      }

      while(num-- > 0) {
        sb.append(tmp).append('-').append(map.get(tmp)).append(' ');
        tmp = map.get(tmp);
      }

      sb.append('\n');
    }

    bw.write(sb.toString());
    bw.close();
  }
}