import java.util.*; //23351(그리디) 물 주기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken()), cnt = 0;
    int k = Integer.parseInt(st.nextToken()), pnt = 0;
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int arr[] = new int[num];
    boolean flag = true;
    
    for(int i = 0; i < num; i++) arr[i] = k;
    while(flag) {
      cnt++;
      for(int i = 0; i < a; i++) {
        arr[pnt++] += b;
        if(pnt == num) pnt = 0;
      }

      for(int i = 0; i < num; i++) {
        arr[i]--;
        if(arr[i] == 0) {
          flag = false;
          break;
        }
      }
    }
    
    
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}