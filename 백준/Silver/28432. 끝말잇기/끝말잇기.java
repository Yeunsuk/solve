import java.util.*; //28432(구현) 끝말잇기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Set<String> set = new HashSet<>();
    boolean fck = false, eck = false;
    int n = Macro(br.readLine());
    char fst = '.', end = '.';
    String rlt = "";

    for(int i = 0; i < n; i++) {
      String str = br.readLine();
      if(!str.equals("?")) {
        set.add(str);
        
        if(fck && !eck) {
          end = str.charAt(0);
          eck = true;
        }
      }else fck = true;
      if(!fck) fst = str.charAt(str.length() - 1);
    }

    int m = Macro(br.readLine());
    if(n == 1) bw.write(br.readLine());
    else {
      for(int i = 0; i < m; i++) {
        String str = br.readLine();
        if((str.charAt(0) == fst || fst == '.')
            && (str.charAt(str.length() - 1) == end || end == '.') && !set.contains(str)) rlt = str;
      }
      
      bw.write(rlt);
    }

    bw.close();
  }
}