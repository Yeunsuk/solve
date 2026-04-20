import java.util.*; //3054(구현) 피터팬 프레임
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] cha = br.readLine().toCharArray();
    String[] arr = {"", "", "", "", ""};
    int len = cha.length, cnt = 1;
    char std = '#';
    
    for(char c : cha) {
      char pre = '*';
      
      if(cnt % 3 == 0) {
        std = '*';
        cnt = 1;
      }else {
        if(std != '*') pre = '#';
        std = '#';
        cnt++;
      }
      
      arr[1] += "." + std + "." + std;
      arr[3] += "." + std + "." + std;
      arr[2] += pre + "." + c + ".";
      arr[0] += ".." + std + ".";
      arr[4] += ".." + std + ".";
    }
  
    if(len > 0) {
      arr[0] += ".";
      arr[1] += ".";
      arr[2] += std;
      arr[3] += ".";
      arr[4] += ".";
  
      for(String tmp : arr) bw.write(tmp + "\n");
    }

    bw.close();
  }
}