import java.util.*; //15312(dp) 이름 궁합
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    int[] alpabet = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String fst = br.readLine();
    String sec = br.readLine();

    int[] arr = new int[fst.length() + sec.length()];
    int siz = arr.length;
    
    for(int i = 0; i < arr.length - 1; i = i + 2) {
      arr[i + 1] = alpabet[sec.charAt(i / 2) - 65];
      arr[i] = alpabet[fst.charAt(i / 2) - 65];
    }

    while(siz > 2) {
      for(int i = 0; i < siz - 1; i++) arr[i] = (arr[i] + arr[i + 1]) % 10;
      arr[--siz] = 0;
    }

    bw.write(String.valueOf(arr[0]) + String.valueOf(arr[1]));
    bw.close();
  }
}