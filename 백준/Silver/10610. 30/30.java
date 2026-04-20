import java.util.*; //10610(그리디) 30
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    String str = br.readLine();
    int len = str.length();
    int sum = 0;

    char[] arr = str.toCharArray();
    Arrays.sort(arr);

    for(int i = len - 1; i > -1; i--) {
      int tmp = arr[i] - '0';
      sb.append(tmp);
      sum += tmp;
    }

    if(arr[0] != '0' || sum % 3 != 0) bw.write("-1");
    else bw.write(sb.toString());
    bw.close();
  }
}