import java.util.*; //1340(문자열) 연도 진행바
import java.io.*;

public class Main{
  public static boolean Macro(int y) {
    if(y % 4 == 0) {
      if(y % 100 == 0) {
        if(y % 400 == 0) return true; 
        else return false;
      }
      return true;
    }
    return false;
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    br.close();
    
    String[] li_m = {"January", "February", "March", "April", 
                       "May", "June", "July", "August", "September", "October", 
                       "November", "December"};
    int[] li_d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int tt_d = 0, tt_m = 0, m = 0, n = 0;
    String tmp = st.nextToken();
    
    for(int i = 0; i < li_m.length; i++) {
      if(li_m[i].equals(tmp)) {
        m = i;
        break;
      }
    }
    
    tmp = st.nextToken();
    int d = Integer.parseInt(tmp.substring(0, 2));
    int y = Integer.parseInt(st.nextToken());
    if(Macro(y)) n = 527040;
    else n = 525600;

    for(int i = 0; i < m; i++) {
      tt_d += li_d[i];
      if(i == 1) if(Macro(y)) tt_d++;
    }

    tt_d += --d;
    String arr[] = (st.nextToken()).split(":");
    tt_m = tt_d * 1440 + Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);
    
    bw.write((double)tt_m / n * 100 + " ");
    bw.close();
  }
}