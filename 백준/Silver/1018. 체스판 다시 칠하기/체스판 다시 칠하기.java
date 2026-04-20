import java.util.*; //1018 체스판 다시 칠하기 
import java.io.*;

public class Main {
  private static char[][] std = new char[2][8];
  private static char[][] arr;

  private static int Macro(int a, int b) {
    int cnt1 = 0; int cnt2 = 0;
    for(int i = 0; i < 8; i++){
      for(int j = 0; j < 8; j++){
        if(arr[a + i][b + j] != std[(i + 1) % 2][j]) cnt1++;
        if(arr[a + i][b + j] != std[i % 2][j]) cnt2++;
      }
    }
    return Math.min(cnt1, cnt2);
  }

  public static void main(String[] args) throws IOException {
    std = new char[][] {{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}, {'B','W', 'B','W', 'B','W', 'B','W'}};
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] xy = br.readLine().split(" ");
    int y = Integer.parseInt(xy[0]);
    int x = Integer.parseInt(xy[1]);
    arr = new char[y][x];


    for(int i = 0; i < y; i++) {
      String str = br.readLine();
      for(int j = 0; j < x; j++) {
        arr[i][j] = str.charAt(j);
      }
    }

    br.close();
    int min = 64;
    for(int i = 0; i < y - 7; i++) {
      for(int j = 0; j < x - 7; j++) {
        min = Math.min(min, Macro(i, j));
      }
    }
  
    System.out.print(min);
  }
}