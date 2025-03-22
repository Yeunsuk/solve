import java.util.*; //2752(구현) 세수정렬
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int[] arr = new int[3];

    StringTokenizer st = new StringTokenizer(br.readLine());
    arr[0] = Macro(st.nextToken());
    arr[1] = Macro(st.nextToken());
    arr[2] = Macro(st.nextToken());
    Arrays.sort(arr);
    
    for(int i = 0; i < 3; i++) sb.append(arr[i]).append(' ');
    bw.write(sb.toString());
    bw.close();
  }
}