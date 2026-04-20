import java.util.*; //11068(수학) 회문인 수
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  static boolean Cul(int n, int std) {
    ArrayList<Integer> li = new ArrayList<>();
    while (n != 0) {
      li.add(n % std);
      n /= std;
    }
    
    for(int i = 0; i < li.size() / 2; i++) if(li.get(i) != li.get(li.size() - 1 - i)) return false;
    return true;
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine());

    while(Test-- > 0) {
      int num = Macro(br.readLine());
      boolean chk = false;
      
      for(int i = 2; i <= 64 && !chk; i++) chk = Cul(num, i);
      if(chk) bw.write("1\n");
      else bw.write("0\n");
    }
    
    bw.close();
  }
}