import java.util.*; //2635(수학) 수 이어가기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> list = new ArrayList<Integer>();
    int n = Macro(br.readLine());
    ArrayList<Integer> tmp;
    int max = 0, a, b; 
    
    for(int i = 1; i < n + 1; i++) {
      tmp = new ArrayList<Integer>();
      tmp.add(n);
      tmp.add(i);
      a = n;
      b = i;

      while(true) {
        int c = a - b;
        if(c > -1) tmp.add(c);
        else break;
            
        a = b;
        b = c;
      }
      
      if(max < tmp.size()) {
        max = tmp.size();
        list = tmp;
      }
    }

    bw.write(String.valueOf(max));
    bw.newLine();
    
    for(int i = 0; i < list.size(); i++) bw.write(list.get(i) + " ");
    bw.flush();
  }
}