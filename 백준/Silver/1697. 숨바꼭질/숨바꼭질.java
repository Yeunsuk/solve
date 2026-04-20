import java.util.*; //1697(DFS) 숨바꼭질
import java.io.*;

public class Main {
  static int you, time;

  static void Macro(int t, int sec) {
    if (t == you) { //도착
      if(sec < time) time = sec;
      return;
    }

    if(t < 0 || t > 100000) return; //범위
    if (sec > time) return; //시간초과
    
    if(t > you) {
      if(sec + t - you < time) time = sec + t - you; //거리계산
      if(t % 2 == 0) { //텔
        Macro(t / 2, sec + 1);
      }else { //걷기
        Macro(t + 1, sec + 1);
        Macro(t - 1, sec + 1);
      }
    }else { //너무 걸음
      if(sec + you - t < time) time = sec + you - t;
      return;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    you = Integer.parseInt(st.nextToken()); // 본인
    int t = Integer.parseInt(st.nextToken()); //도착지
    time = Math.abs(you - t); //최대시간
    int sec = 0;
    br.close();

    Macro(t, sec);
    System.out.print(time);
  }
}