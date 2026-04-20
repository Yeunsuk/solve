import java.util.*; //1541(그리디) 잃어버린 괄호
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split("-");
    List<Integer> li = new ArrayList<>();

    for(String s : str) {
      int sum = 0;
      String[] tmp = s.split("\\+");
      for(String t : tmp) sum += Macro(t);
         
      li.add(sum);
    }
    
    long rlt = li.get(0);
    for(int i = 1; i < li.size(); i++) rlt -= li.get(i);  
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}