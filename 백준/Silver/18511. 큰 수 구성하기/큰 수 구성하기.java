import java.util.*; //18511(재귀) 큰 수 구성하기
import java.io.*;

public class Main {
  static int rlt, n, k;
  static int[] arr;
  
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  private static void Fx(int tmp) {
    if(tmp > n) return;
    if(tmp > rlt) rlt = tmp;

    for(int i = k - 1; i > -1; i--) Fx(tmp * 10 + arr[i]);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
      n = Macro(st.nextToken());
      k = Macro(st.nextToken());
      arr = new int[k];
    
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < k; i++) arr[i] = Macro(st.nextToken());
      Arrays.sort(arr);
      Fx(0);
    
      bw.write(String.valueOf(rlt));
      bw.close();
    }
}