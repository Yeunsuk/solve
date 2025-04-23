import java.util.*; //13118(구현) 뉴턴과 사과
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int arr[] = new int[4];

    for(int i = 0; i < 4; i++) arr[i] = Macro(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int x = Macro(st.nextToken());
    
    for(int i = 0; i < 4; i++) {
      if(arr[i] == x) {
        bw.write(String.valueOf(i + 1));
        bw.close();
        return;
      }
    }
    
    bw.write("0");
    bw.close();
  }
}