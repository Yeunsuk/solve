import java.util.*; //12871(수학) 무한 문자열
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  static int Cul(int a, int b) {
    if(b == 0) return a;
    return Cul(b, a % b);
  }

  static String Rlt(String str, int a) {
    String tmp = str;
    
    while(str.length() < a) str += tmp;
    return str;
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine(), tmp = br.readLine();
    int lns = str.length(), lnt = tmp.length();
    int std = Cul(lns, lnt);
    
    if(std == 1) std = lns * lnt;
    else std = lns * (lnt / std);
    str = Rlt(str, std);
    tmp = Rlt(tmp, std);

    if(str.equals(tmp)) bw.write("1");
    else bw.write("0");
    bw.close();
  }
}