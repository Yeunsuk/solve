import java.util.*; //1296(문자열) 팀 이름 정하기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String name = br.readLine(), win = "";
    int n = Macro(br.readLine());
    double max = -1, cul = 0;
    int na = name.length();
    int[] arr = new int[4];
    
    arr[0] = na - name.replace("L", "").length();
    arr[1] = na - name.replace("O", "").length();
    arr[2] = na - name.replace("V", "").length();
    arr[3] = na - name.replace("E", "").length();
    
    for(int i = 0; i < n; i++) {
      String tim = br.readLine();
      int[] trr = new int[4];
      
      trr[0] = arr[0] + tim.length() - tim.replace("L", "").length();
      trr[1] = arr[1] + tim.length() - tim.replace("O", "").length();
      trr[2] = arr[2] + tim.length() - tim.replace("V", "").length();
      trr[3] = arr[3] + tim.length() - tim.replace("E", "").length();
      cul = ((trr[0] + trr[1]) * (trr[0] + trr[2]) * (trr[0] + trr[3])
        * (trr[1] + trr[2]) * (trr[1] + trr[3]) * (trr[2] + trr[3])) % 100;

      if(max < cul) {
        max = cul; 
        win = tim;
      }else if (max == cul) {
        String[] tmp = new String[2];
        tmp[0] = win; 
        tmp[1] = tim;
        
        Arrays.sort(tmp);
        win = tmp[0];
      }
    }
    
    bw.write(win);
    bw.close();
  }
}