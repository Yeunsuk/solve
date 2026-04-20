import java.io.*; //8958(구현) ox퀴즈
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    for(int i = 0; i < n; i++) {
      int sum = 0, cnt = 0;
      String input = br.readLine();
      for(int j = 0; j < input.length(); j++) {
        if(input.charAt(j) == 'O') {
          cnt++;
          sum += cnt;
        } else cnt = 0;
      }
      sb.append(sum).append("\n");
    }
    System.out.print(sb);
  }
}