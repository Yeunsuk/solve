import java.util.*; //1476(수학) 날짜 계산
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = 0; int b = 0; int c = 0;
    int[] arr = new int[3];
    br.close();
    
    arr[0] = Integer.parseInt(st.nextToken());
    arr[1] = Integer.parseInt(st.nextToken());
    arr[2] = Integer.parseInt(st.nextToken());
    int rlt = 0;
    
    while(true) {
      if(a == 16) a = 1;
      if(b == 29) b = 1;
      if(c == 20) c = 1;
      if(arr[0] == a && arr[1] == b && arr[2] == c) break;
      rlt++;
      a++;
      b++;
      c++;
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}