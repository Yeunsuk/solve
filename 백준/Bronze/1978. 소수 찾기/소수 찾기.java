import java.util.*; //1978(수학) 소수 찾기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean[] arr = new boolean[1_001];
    arr[0] = arr[1] = true;

    for(int i = 4; i < 1_001; i += 2) arr[i] = true;
    for(int i = 3; i * i < 1_001; i += 2) {
      if(arr[i]) continue;
      for(int j = i * i; j < 1_001; j += i) arr[j] = true;
    }

    int num = Integer.parseInt(br.readLine()), cnt = 0;
    StringTokenizer st = new StringTokenizer(br.readLine());
    while(num-- > 0) if(!arr[Integer.parseInt(st.nextToken())]) cnt++;
    
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}