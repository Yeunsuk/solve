import java.util.*; //15234(수학) Number Pairs
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    HashMap<Integer, Integer> map = new HashMap<>();
    int n = Macro(st.nextToken()), cnt = 0;
    int k = Macro(st.nextToken());
    int[] arr = new int[n];

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++) {
      arr[i] = Macro(st.nextToken());
    }
    
    for (int i = 0; i < n; i++) {
      int tmp = k - arr[i]; 
      if (map.containsKey(tmp)) {
        cnt += map.get(tmp);
      }
      
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }

    bw.write(String.valueOf(cnt));
    bw.close();
  }
}