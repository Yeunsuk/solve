import java.util.*; //1813(애드 혹) 논리학 교수
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), rlt = -1;
    int[] arr = new int[51];
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++) arr[Macro(st.nextToken())]++;
    for(int i = 0; i < 51; i++) if(arr[i] == i) rlt = i;
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}