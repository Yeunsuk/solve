import java.util.*; //3711(수학) 학번
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
      int num = Macro(br.readLine()), max = 0;
      int[] arr = new int[num];
      
      for(int i = 0; i < num; i++) {
        arr[i] = Macro(br.readLine());
        max = Math.max(max, arr[i]);
      }
      
      for(int i = 1; i <= max + 1; i++) {
        ArrayList<Integer> set = new ArrayList<Integer>();
        for(int j = 0; j < num; j++) {
          int tmp = arr[j] % i;

          if(set.contains(tmp)) break;
          else set.add(tmp);
        }
        
        if(set.size() == num) {
          bw.write(i + "\n");
          break;
        }
      }
    }
    
    bw.close();
  }
}