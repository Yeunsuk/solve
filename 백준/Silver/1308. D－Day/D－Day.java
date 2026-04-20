import java.util.*; //1308(구현) D-Day
import java.io.*;

public class Main {

  static int Check(int y) {
    if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) return 1;
    else return 0;
  }
  
  static int Macro(int y, int m, int d){
    int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int sum = 0;

    for(int i = 1; i < y; i++) sum += 365 + Check(i);
    for(int i = 1; i < m; i++) {
      if(i == 2) sum += Check(y);
      sum += day[i];
    }

    sum += d;
    return sum;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    
    st = new StringTokenizer(br.readLine());
    int y1 = Integer.parseInt(st.nextToken());
    int m1 = Integer.parseInt(st.nextToken());
    int d1 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int y2 = Integer.parseInt(st.nextToken());
    int m2 = Integer.parseInt(st.nextToken());
    int d2 = Integer.parseInt(st.nextToken());

     if(y2 - y1 > 1000 || y2 - y1 == 1000 && (m1 < m2 || m1 == m2 && d1 <= d2)) System.out.print("gg");
    else System.out.print("D-" + (Macro(y2, m2, d2) - Macro(y1, m1, d1)));
  }
} 