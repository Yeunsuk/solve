import java.util.*; //27964(문자열) 콰트로치즈피자
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashSet<String> set = new HashSet<>();
    int n = Macro(br.readLine());
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++) {
      String tmp = st.nextToken();
      if(tmp.endsWith("Cheese")) set.add(tmp);
    }

    if(3 < set.size()) bw.write("yummy");
    else bw.write("sad");
    bw.close();
  }
}