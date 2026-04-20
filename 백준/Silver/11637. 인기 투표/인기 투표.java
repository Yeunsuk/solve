import java.util.*; //11637(구) 인기 투표
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine());
    
    while(Test-- > 0) {  
      List<Integer> tmp = new ArrayList<Integer>();
      int num = Macro(br.readLine()), max = 0;
      int sum = 0, sec = 0, top = 0, n = 0;

      while(num-- > 0) {
        int t = Macro(br.readLine());
        tmp.add(t);
        sum += t;
      }

      max = sum / 2 + 1;
      for(int i = 0; i < tmp.size(); i++) {
        if(tmp.get(i) > top) {
          top = tmp.get(i);
          n = i + 1;
          sec = 0;
        }else if(tmp.get(i) == top) sec++;
      }
      
      if(sec != 0) bw.write("no winner\n");
      else {
        if(max <= tmp.get(n - 1)) bw.write("majority winner " + n + "\n");
        else bw.write("minority winner " + n + "\n");
      }
    }
    
    bw.close();
  }
}