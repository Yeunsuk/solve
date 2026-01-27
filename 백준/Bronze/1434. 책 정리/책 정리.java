import java.util.*; //1434(구현) 책 정리
import java.io.*;

public class Main {
  static int stoi(String s) {
    return Integer.parseInt(s);
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = stoi(st.nextToken()), m = stoi(st.nextToken());
    int[] arr1 = new int[n], arr2 = new int[m];
    int rlt = 0, i = 0, j = 0;

    st = new StringTokenizer(br.readLine());
    for(i = 0; i < n; i++) {
      arr1[i] = stoi(st.nextToken());
      rlt += arr1[i];
    }

    st = new StringTokenizer(br.readLine());
    for(i = 0; i < m; i++) arr2[i] = stoi(st.nextToken());
    
    for(i = 0; i < m; i++) {
      while(j < n) {
        if(arr1[j] >= arr2[i]) {
          arr1[j] -= arr2[i];
          rlt -= arr2[i];
          break;
        }else j++;
      }
    }

    System.out.print(rlt);
  }
}