import java.util.*; //25304(수학) 영수증
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int std = Integer.parseInt(br.readLine()), sum = 0;
    int num = Integer.parseInt(br.readLine());

    while(num-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
    }
    
    bw.write(std == sum ? "Yes" : "No");
    bw.close();
  }
}