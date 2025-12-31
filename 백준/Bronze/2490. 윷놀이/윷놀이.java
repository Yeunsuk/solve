import java.util.*; //2490(구현) 윷놀이
import java.io.*; 

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] arr = {"D", "C", "B", "A", "E"};
    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i < 3; i++) {
      int sum = 0;
      StringTokenizer st = new StringTokenizer(br.readLine());
      while(st.hasMoreTokens()) sum += Integer.parseInt(st.nextToken());
      sb.append(arr[sum]).append("\n");
    }
    
    System.out.print(sb);
  }
}