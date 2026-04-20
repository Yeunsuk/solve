import java.util.*; //1037(수학) 약수
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int Test = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine()," ");
    
    while(Test-- > 0) {
      int n = Integer.parseInt(st.nextToken());
      max = n > max ? n : max;
      min = n < min ? n : min;
    }
    
    bw.write(String.valueOf(max * min));
    bw.close();
  }
}