import java.util.*; //2930(구현) 가위 바위 보
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  static int Cul(char std, char tmp) {
    if(std == 'R' && tmp == 'S' || std == 'S' && tmp == 'P' || std == 'P' && tmp == 'R') return 2;
    if(std == tmp) return 1;
    return 0;
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int std = Macro(br.readLine()), sum = 0, max = 0;
    char[] arr = br.readLine().toCharArray();
    int num = Macro(br.readLine());
    
    char[][] tmp = new char[num][std];
    for(int i = 0; i < num; i++) {
      tmp[i] = br.readLine().toCharArray();
    }
    
    for(int i = 0; i < std; i++) {
      for(int j = 0; j < num; j++) {
        sum += Cul(arr[i], tmp[j][i]);
      }
    }
    
    for(int i = 0; i < std; i++) {
      int cnt_r = 0, cnt_s = 0, cnt_p = 0;
      
      for(int j = 0; j < num; j++) {
        cnt_r += Cul('R', tmp[j][i]);
        cnt_s += Cul('S', tmp[j][i]);
        cnt_p += Cul('P', tmp[j][i]);
      }
      
      max += Math.max(cnt_r, Math.max(cnt_s, cnt_p));
    }

    bw.write(sum + "\n" + max);
    bw.close();
  }
}