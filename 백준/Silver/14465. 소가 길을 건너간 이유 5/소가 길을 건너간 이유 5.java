import java.util.*; //14465(누적 합) 소가 길을 건너간 이유 5
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken()) + 1, cnt = 0;
    int std = Integer.parseInt(st.nextToken()), min;
    int n = Integer.parseInt(st.nextToken());
    
    boolean[] arr = new boolean[num];
    for(int i = 0; i < n; i++) {
      arr[Integer.parseInt(br.readLine())] = true;
    }
    
    for(int i = 1; i <= std; i++) if(arr[i]) cnt++;
    min = cnt;
    
    for(int i = 2; i <= num - std; i++) {
      if(arr[i + std - 1]) cnt++;
      if(arr[i - 1]) cnt--;
      
      min = Math.min(min, cnt);
    }

    bw.write(String.valueOf(min));
    bw.close();
  }
}