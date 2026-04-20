import java.util.*; //3076(구현) 상근이의 체스판
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int y = Macro(st.nextToken());
    int x = Macro(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int a = Macro(st.nextToken()); 
    int b = Macro(st.nextToken());
    y *= a;
    x *= b;
    
    char[][] arr = new char[y][x];
    for(int i = 0; i < y; i += a) {
      for(int j = 0; j < x; j += b) {
        char t  = '.';
        if((i / a % 2 == 0 && j / b % 2 == 0) || (i / a % 2 != 0 && j / b % 2 != 0)) t = 'X';
        for(int k = i; k < i + a; k++) for(int l = j; l < j + b; l++) arr[k][l] = t;
      }
    }

    for(int i = 0; i < y; i++) bw.write(String.valueOf(arr[i]) + "\n");
    bw.close();
  }
}