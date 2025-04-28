import java.util.*; //4132(브루트포스) Subset Sum
import java.io.*;

public class Main {  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int std = Integer.parseInt(st.nextToken());
    int num = Integer.parseInt(st.nextToken());
    long rlt = Long.MAX_VALUE;
    int[] arr = new int[num];
    int sum = 1 << num;

    for (int i = 0; i < num; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }
    
    for(int i = 0; i < sum; i++) {
      long tmp = 0;
      
      for(int j = 0; j < num; j++) if((i & (1 << j)) != 0) tmp += arr[j];
      if(tmp >= std) rlt = Math.min(rlt, tmp);
    }
    
    bw.write(rlt == Long.MAX_VALUE ? "IMPOSSIBLE" : String.valueOf(rlt));
    bw.close();
  }
}