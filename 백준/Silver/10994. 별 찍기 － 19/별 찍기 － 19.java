import java.util.*; //10994(구현) 별 찍기 - 19
import java.io.*;

public class Main {
 public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int num = 4 * (n - 1) + 1;
    
    char[][] arr = new char[num][num];
    for(int i = 0; i < num; i++) {
      for(int j = 0; j < num; j++) {
        arr[i][j] = ' ';
      }
    }
    
    for(int i = 0; i < num; i++) {
      int cnt = (i < num / 2) ? i / 2 : (num - i - 1) / 2;
      
      for(int j = 0; j <= cnt; j++) {
        arr[i][num - j * 2 - 1] = '*';
        arr[i][j * 2] = '*';
      }

      if(i % 2 == 0) for(int j = cnt * 2; j < num - (cnt * 2); j++) arr[i][j] = '*';
    }
    
    for(int i = 0; i < num; i++) {
      for(int j = 0; j < num; j++) bw.write(arr[i][j]);
      bw.newLine();
    }
    
    bw.close();
  }
}