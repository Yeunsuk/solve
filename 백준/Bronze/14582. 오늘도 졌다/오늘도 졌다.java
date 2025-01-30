import java.util.*; //14582(구현) 오늘도 졌다
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr1 = new int[9];
    int[] arr2 = new int[9];
    boolean std = false;
    int cnt = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < 9; i++) {
      arr1[i] = Macro(st.nextToken());
    }

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < 9; i++) {
      arr2[i] = Macro(st.nextToken());
    }

    for(int i = 0; i < 9; i++) {
      cnt += arr1[i];
      if(cnt > 0) {
        std = true;
        break;
      }
      
      cnt -= arr2[i];
    }

    bw.write(std ? "Yes" : "No");
    bw.close();
  }
}