import java.util.*; //13913(그래프) 숨바꼭질 4
import java.io.*;

public class Main {
  static int you, time;
  static boolean[] visit = new boolean[100001];
  static List<Integer> arr = new ArrayList<>();

  static void Macro(int t, int sec, List<Integer> list) {

    list.add(t);
    if(t < 0 || t > 100000) {
      list.remove(Integer.valueOf(t));
      return;
    }
    if(sec > time) {
      list.remove(Integer.valueOf(t));
      return;
    }

    if(t == you) {
      if(sec < time) {
        arr = new ArrayList<>(list);
        time = sec;
      }
      list.remove(Integer.valueOf(t));
      return;
    }

    if(t > you) {
      if(sec + t - you < time) {
        for(int i = t - 1; i >= you; i--) list.add(i);
        time = sec + t - you;
        arr = new ArrayList<>(list);
        for(int i = t - 1; i >= you; i--) list.remove(list.size() - 1);
      }
      if(t % 2 == 0) {
        Macro(t / 2, sec + 1, list);
      }else {
        Macro(t + 1, sec + 1, list);
        Macro(t - 1, sec + 1, list);
      }
    }else {
      if(sec + you - t < time) {
        for(int i = t + 1; i <= you; i++) list.add(i);
        arr = new ArrayList<>(list);
        list.remove(Integer.valueOf(t));
        time = sec + you - t;
      }
      else {
        list.remove(Integer.valueOf(t));
        return;
      }
    }
    list.remove(Integer.valueOf(t));
    return;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();
    you = Integer.parseInt(st.nextToken());
    int t = Integer.parseInt(st.nextToken());
    List<Integer> li = new ArrayList<>();
    time = Math.abs(you - t) + 1;
    int sec = 0;
    br.close();

    Macro(t, sec, li);
    sb.append(time).append("\n");
    for(int i = arr.size() - 1; i > -1; i--) {
      sb.append(arr.get(i)).append(" ");
    }

    System.out.print(sb);
  }
}