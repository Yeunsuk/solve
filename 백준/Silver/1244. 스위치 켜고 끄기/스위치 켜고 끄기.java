import java.util.*; //1244(구현) 스위치 켜고 끄기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), i;
    int[] arr = new int[n];
    
    StringTokenizer st = new StringTokenizer(br.readLine()); 
    for(i = 0; i < n; i++) arr[i] = Macro(st.nextToken());
    int num = Macro(br.readLine()); 
    
    for(i = 0; i < num; i++) {
      st = new StringTokenizer(br.readLine());
      int std = Macro(st.nextToken());
      int tmp = Macro(st.nextToken());


      if(std == 1) {
        for(int j = 0; j < n; j++) if((j + 1) % tmp == 0) arr[j] = arr[j] == 0? 1: 0;
      }else {
        arr[tmp - 1] = arr[tmp - 1] == 0 ? 1 : 0;
        for(int j = 1; j < n / 2; j++) {
          if(tmp + j - 1 >= n || tmp - j - 1 < 0) break;
          if(arr[tmp -j - 1] == arr[tmp + j - 1]) {
            arr[tmp - j - 1] = arr[tmp - j - 1] == 0 ? 1 : 0;
            arr[tmp + j - 1] = arr[tmp + j - 1] == 0 ? 1 : 0;
          }
          
          else break;
        }
      }
    }

    for(i = 0; i < n; i++) {
      if(i != 0 && i % 20 == 0) bw.newLine();
      bw.write(arr[i] + " ");
    }
    
    bw.close();
  }
}