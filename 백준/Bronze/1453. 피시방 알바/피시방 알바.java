import java.io.*; //1453 피시방 알바
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    br.readLine();
    int cnt = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());

    while(st.hasMoreElements()) {
      int n = Integer.parseInt(st.nextToken());
      if(map.getOrDefault(n, false)) cnt++;
      else map.put(n, true);
    }

    System.out.print(cnt);
  }
}