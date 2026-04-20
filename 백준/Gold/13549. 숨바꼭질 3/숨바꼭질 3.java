import java.util.*; //1697(그래프) 숨바꼭질 3
import java.io.*;

public class Main {
  static int you, time;

  static void Macro(int t, int sec) {
    if (t == you) {
      if(sec < time) time = sec;
      return;
    }

    if(t < 0 || t > 100000) return;
    if (sec > time) return;
    
    if(t > you) {
      if(sec + t - you < time) time = sec + t - you;
      if(t % 2 == 0) {
        Macro(t / 2, sec);
      }else {
        Macro(t + 1, sec + 1);
        Macro(t - 1, sec + 1);
      }
    }else {
      if(sec + you - t < time) time = sec + you - t;
      return;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    you = Integer.parseInt(st.nextToken());
    int t = Integer.parseInt(st.nextToken());
    time = Math.abs(you - t);
    int sec = 0;
    br.close();

    Macro(t, sec);
    System.out.print(time);
  }
}