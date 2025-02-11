import java.util.*; //2003(누적합) 수들의 합 2
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Macro(st.nextToken()), sum = 0, cnt = 0;
    int max = Macro(st.nextToken()), lt = 0;
    int[] arr = new int[num];

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < num; i++) {
      arr[i] = Macro(st.nextToken());
    }
    
    for(int rt = 0; rt < num; rt++) {
      sum += arr[rt];
      
      while(sum > max) sum -= arr[lt++];
      if(sum == max) cnt++;
    }
    
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}