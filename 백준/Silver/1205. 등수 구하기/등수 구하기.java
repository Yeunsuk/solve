import java.util.*; //1205(구현) 등수 구하기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Macro(st.nextToken()), cnt = 1;
    int point = Macro(st.nextToken());
    int max = Macro(st.nextToken());
    int[] arr = new int[max];
    
    if(num > 0) {
       st = new StringTokenizer(br.readLine());
       for(int i = 0; i < num; i++) arr[i] = Macro(st.nextToken());
    }
    
    Arrays.sort(arr);
    if(max == num && arr[0] >= point){
       bw.write("-1");
    }else {
      for(int i = max - 1; i >= Math.max(0, max - num - 1); i--) {
         if(arr[i] > point) cnt++;
         else break;
      }
      
      bw.write(String.valueOf(cnt));
    }
    
    bw.close();
  }
}