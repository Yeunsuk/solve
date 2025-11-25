import java.util.*; //11558(graphs) The Game of Death
import java.io.*;

public class Main {
  static int stoi(String s) { return Integer.parseInt(s); }
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    while(Test-- > 0) {
      int num = Integer.parseInt(br.readLine()), rlt = 0;
      if(num == 1) rlt = 1;
      else {
        int arr[] = new int[num];
        for(int  j = 0; j < num; j++) arr[j] = Integer.parseInt(br.readLine());
        
        List<Integer> tmp = new ArrayList<Integer>();
        int cnt = 0, k = 0;
        
        while(true) {
          tmp.add(k);
          
          if(tmp.contains(arr[k] - 1)) {
            rlt = 0;
            break;
          }
          if(arr[k] == num) {
            rlt = ++cnt;
            break;
          }
          
          cnt++;
          k = arr[k] - 1;
        }
      }
      
      sb.append(rlt).append("\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}