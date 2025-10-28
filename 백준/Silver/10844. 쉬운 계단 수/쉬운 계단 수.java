import java.util.*; //10844(dp) 쉬운 계단 수
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    long[][] arr = new long[num + 1][10];
    long mod = 1_000_000_000, rlt = 0;
    
    for(int i = 1; i < 10; i++) arr[1][i] = 1;

    for(int i = 2; i <= num; i++) {
      for(int j = 0; j < 10; j++) {
        if(j == 0) arr[i][0] = arr[i-1][1] % mod;
        else if(j == 9) arr[i][9] = arr[i-1][8] % mod;
        else arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]) % mod;
      }
    }
    
    for(int i = 0; i < 10; i++) rlt += arr[num][i]; 
    bw.write(String.valueOf(rlt % mod));
    bw.close();
  }
}