import java.util.*; //15970(정렬) 화살표 그리기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<ArrayList<Integer>> li = new ArrayList<>();
    int n = Macro(br.readLine()), cnt = 0, i;
    
    for(i = 0; i <= n; i++) li.add(new ArrayList<>());
    for(i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int idx = Macro(st.nextToken());
      int typ = Macro(st.nextToken());
      li.get(typ).add(idx);
    }
    for(i = 0; i <= n; i++) Collections.sort(li.get(i));
    
    for(i = 0; i <= n; i++) {
      List<Integer> tmp = li.get(i);
      
      for(int j = 0; j < tmp.size(); j++) {
        if(j == 0) cnt += tmp.get(j + 1) - tmp.get(j);
        else if(j == tmp.size() - 1) cnt += tmp.get(j) - tmp.get(j - 1);
        else {
          int a = tmp.get(j + 1) - tmp.get(j);
          int b = tmp.get(j) - tmp.get(j - 1);
          cnt += Math.min(a, b);
        }
      }
    }

    bw.write(cnt + "\n");
    bw.close();
  }
}