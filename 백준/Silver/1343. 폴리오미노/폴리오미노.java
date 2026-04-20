import java.util.*; //1343(그리디) 폴리오미노
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    List<Integer> li = new ArrayList<>();
    String str = br.readLine();
    int cnt = 1; int now = 2;
    br.close();
    
    for(int i = 0; i < str.length(); i++) {
      if(i == 0) {
        if(str.charAt(i) == 'X') now = 1;
        else now = 0;
        continue;
      }
      if(str.charAt(i) == 'X') {
        if(now == 1) cnt++;
        else {
          li.add(cnt);
          cnt = 1;
        }
        now = 1;
      }else {
        if(now == 0) cnt++;
        else {
          li.add(cnt);
          cnt = 1;
        }
        now = 0;
      }
    }
    
    li.add(cnt);
    if(str.charAt(0) == 'X') {
      for(int i = 0; i < li.size(); i++) {
        int tmp = li.get(i);
        if(i % 2 == 0) {
          if(tmp % 2 == 1) {
            System.out.print("-1");
            System.exit(0);
          }else {
            for(int j = 0; j < tmp / 4; j++) sb.append("AAAA");
            if(tmp % 4 == 2) sb.append("BB");
          }
        }else while(tmp-- > 0) sb.append(".");
      }
    }else {
      for(int i = 0; i < li.size(); i++) {
        int tmp = li.get(i);
        if(i % 2 != 0) {
          if(tmp % 2 == 1) {
            System.out.print("-1");
            System.exit(0);
          }else {
            for(int j = 0; j < tmp / 4; j++) sb.append("AAAA");
            if(tmp % 4 == 2) sb.append("BB");
          }
        }else while(tmp-- > 0) sb.append(".");
      }
      
    }
    System.out.print(sb);
  }
}