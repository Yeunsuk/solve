import java.util.*; //25632(그리디) 소수 부르기 게임
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cnt_a = 0, cnt_b = 0, cnt_ab = 0;
    boolean[] arr = new boolean[1_001];
    arr[0] = true;
    arr[1] = true;

    for(int i = 2; i * i < 1_001; i++) {
      if(!arr[i]) {
        for(int j = i * i; j < 1_001; j += i) {
          arr[j] = true;
        }
      }
    }

    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Macro(st.nextToken());
    int b = Macro(st.nextToken());
    
    for(int i = a; i <= b; i++) {
      if(!arr[i]) cnt_a++;
    }
    
    st = new StringTokenizer(br.readLine());
    int c = Macro(st.nextToken());
    int d = Macro(st.nextToken());
    
    for(int i = c; i <= d; i++) {
      if(!arr[i]) {
        if(a <= i && i <= b) cnt_ab++;
        cnt_b++;
      }
    }

    if(cnt_ab % 2 == 0) bw.write(cnt_a > cnt_b ? "yt" : "yj");
    else bw.write(cnt_a >= cnt_b ? "yt" : "yj");
    bw.close();
  }
}