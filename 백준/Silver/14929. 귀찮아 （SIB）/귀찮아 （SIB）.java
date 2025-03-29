import java.util.*; //14929(수학) 귀찮아 (SIB)
import java.io.*;

public class Main {  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int[] arr = new int[num];
    long sum = 0, sq = 0;
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < num; i++) {
      int tmp = Integer.parseInt(st.nextToken());
      sq += (long) tmp * tmp;
      arr[i] = tmp;
      sum += tmp;
    }
    
    bw.write(String.valueOf((sum * sum - sq) / 2));
    bw.close();
  }
}