import java.util.*; //10103(수학) 주사위 게임
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    int user1 = 100, user2 = 100;

    while(Test-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      
      if(a == b) continue;
      else if(a > b) user2 -= a;
      else user1 -= b;
    }
       
    bw.write(user1 + "\n" + user2);
    bw.close();
  }
}