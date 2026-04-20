import java.util.*; //4948(수학) 베르트랑 공준
import java.io.*;

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean[] pr = new boolean[246913];
    int[] arr = new int[246913];
    pr[0] = pr[1] = true;
    int cnt = 0;

    for(int i = 2; i <= Math.sqrt(pr.length); i++) {
      if(pr[i]) continue;
      for(int j = i * i; j < pr.length; j += i) pr[j] = true;
    }
    
    for(int i = 2; i < pr.length; i++) {
      if(!pr[i]) cnt++;
      arr[i] = cnt;	
    }

    while(true) {
      int n = Integer.parseInt(br.readLine());
      
      if(n == 0) break;
      bw.write(arr[2 * n] - arr[n] + "\n");
    }
    bw.close();
  }
}