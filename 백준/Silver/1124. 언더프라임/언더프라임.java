import java.util.*; //1124(수학) 언더프라임 
import java.io.*;

public class Main {
  static boolean[] check;
  static int[] cnt;
  
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  static void Prime() {
    check = new boolean[100001];
    check[0] = check[1] = true;
    cnt = new int[100001];

    for(int i = 2; i < 100001; i++) {
      if(check[i]) continue;
      for(int j = i + i; j < 100001; j += i) {
        check[j] = true;
        int tmp = j;
        
        while(tmp % i == 0) {
          tmp /= i;
          cnt[j]++;
        }
      }
    }
  }
  

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int m = Macro(st.nextToken());
    int n = Macro(st.nextToken());
    int rlt = 0;
    br.close();
    Prime();
    
    for(int i = m; i < n + 1; i++) if(!check[cnt[i]]) rlt++;
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}