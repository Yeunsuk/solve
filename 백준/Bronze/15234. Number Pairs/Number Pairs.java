import java.util.*; //15234(수학) Number Pairs
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()), cnt = 0;
    int k = Integer.parseInt(st.nextToken());
    HashSet<Integer> set = new HashSet<>();
    int[] arr = new int[n];

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    
    for(int i = 0; i < n; i++) {
      int tmp = k - arr[i];
      if(set.contains(tmp)) cnt++;
      set.add(arr[i]);
    }

    bw.write(String.valueOf(cnt));
    bw.close();
  }
}