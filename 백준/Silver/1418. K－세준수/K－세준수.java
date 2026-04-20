import java.util.*; //1418(수학) K - 세준수
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()) + 1, cnt = 0;
    List<Integer> li = new ArrayList<>();
    boolean[] arr = new boolean[n];
    int k = Macro(br.readLine());

    for (int i = 2; i < n; i++) {
      if(arr[i]) continue;  
      for(int j = i + i; j < n; j += i) arr[j] = true;
    }
    
    for(int i = 2; i < n; i++) if(!arr[i]) li.add(i);
    arr = new boolean[n];

    for(int i = 1; i < n; i++) {
      if(i < k + 1) continue;
      else if(arr[i]) continue;
      else {
        for(int j = 0; j < li.size(); j++) {
          if(li.get(j) <= k) continue;
          if(i % li.get(j) == 0) {
            arr[i] = true;
            break;
          }
        }
      }
    }

    for(int i = 1; i < n; i++) if(!arr[i]) cnt++;
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}