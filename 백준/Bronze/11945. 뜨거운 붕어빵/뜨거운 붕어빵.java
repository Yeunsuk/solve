import java.io.*; //11945 뜨거운 붕어빵
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x = Integer.parseInt(st.nextToken());
    int y = Integer.parseInt(st.nextToken());
    
    for(int i = 0; i < x; i++) {
      StringBuilder sb = new StringBuilder(br.readLine());
      bw.write(sb.reverse().toString());
      bw.newLine();
    }

    bw.close();
  }
}