import java.util.*; //2475(수학) 검증수
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()," ");
    int n = 0; int sum = 0;
    br.close();

    for(int i = 0; i < 5; i++) {
      n = Integer.parseInt(st.nextToken());
      sum += n * n;
    }
    System.out.print(sum % 10);
  }
}