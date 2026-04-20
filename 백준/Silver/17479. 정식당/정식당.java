import java.util.*; //17479(구현) 정식당
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    Map<String, Integer> price = new HashMap<>();
    Map<String, String> type = new HashMap<>();
    int a = Macro(st.nextToken()), cnt_c = 0;
    int b = Macro(st.nextToken());
    int c = Macro(st.nextToken());
    long cnt_a = 0, cnt_b = 0;
    
    for(int i = 0; i < a; i++) {
      st = new StringTokenizer(br.readLine());
      String tmp = st.nextToken();
      price.put(tmp, Macro(st.nextToken()));
      type.put(tmp, "a");
    }
    
    for(int i = 0; i < b; i++) {
      st = new StringTokenizer(br.readLine());
      String tmp = st.nextToken();
      price.put(tmp, Macro(st.nextToken()));
      type.put(tmp, "b");
    }
    
    for(int i = 0; i < c; i++) {
      String tmp = br.readLine();
      price.put(tmp, 0);
      type.put(tmp, "c");
    }
    
    int num = Macro(br.readLine());
    for(int i = 0; i < num; i++) {
      String tmp = br.readLine();
      String category = type.get(tmp);
      
      if(category.equals("a")) cnt_a += price.get(tmp);
      else if(category.equals("b")) cnt_b += price.get(tmp);
      else cnt_c++;
    }

    bw.write((cnt_b > 0 && cnt_a < 20_000) || (cnt_c > 0 && cnt_a + cnt_b < 50_000) || (cnt_c > 1) ? "No" : "Okay");
    bw.close();
  }
}