import java.util.*; //16916(문자열) 부분 문자열
import java.io.*;

public class Main {
  static boolean kmp(String std, String text) {
    int[] arr = LPS(text);
    int i = 0, j = 0;

    while(i < std.length()) {
      if(std.charAt(i) == text.charAt(j)) {
        i++;
        j++;
        if(j == text.length()) return true;
      }else {
        if(j != 0) j = arr[j - 1];
        else i++;
      }
    }

    return false;
  }

  static int[] LPS(String tmp) {
    int[] arr = new int[tmp.length()];
    int len = 0, i = 1;

    while(i < tmp.length()) {
      if(tmp.charAt(i) == tmp.charAt(len)) arr[i++] = ++len;
      else {
        if (len != 0) len = arr[len - 1];
        else arr[i++] = 0;
      }
    }

    return arr;
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String std = br.readLine();
    String tmp = br.readLine();
    
    bw.write(kmp(std, tmp) ? "1" : "0");
    bw.close();
  }
}