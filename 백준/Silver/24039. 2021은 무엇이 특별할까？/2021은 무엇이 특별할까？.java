import java.util.*; //24039(수학) 2021은 무엇이 특별할까?
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> li = new ArrayList<Integer>();
    boolean[] arr = new boolean[10_001];
    int n = Macro(br.readLine()), i;
    
    for(i = 2; i < 10_001; i++) {
      for(int j = 2 * i; j < 10_001; j += i) {
        if(!arr[j]) arr[j] = true;
      }
    }

    for(i = 2; i < 10_001; i++) if(!arr[i]) li.add(i);
    for(i = 0; i < li.size(); i++) {
      if(li.get(i) * li.get(i + 1) > n) {
        bw.write(String.valueOf(li.get(i) * li.get(i + 1)));
        break;
      }
    }
    
    bw.close();
  }
}