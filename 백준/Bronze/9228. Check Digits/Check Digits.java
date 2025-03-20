import java.util.*; //9228(수학) Check Digits
import java.io.*;

public class Main { 
  static String Rlt(String num) {
    int len = num.length(), sum = 0;
      
    for (int i = 0; i < len; i++) sum += (num.charAt(len - i - 1) - '0') * (i + 2);
    int tmp = 11 - sum % 11;
      
    if (tmp == 10) return "Rejected";
    else if (tmp == 11) return "0";
    else return Integer.toString(tmp); 
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    while(true) {
      String num = br.readLine();
      if(num.equals("#")) break;
      
      sb.append(num).append(" -> ").append(Rlt(num)).append("\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}