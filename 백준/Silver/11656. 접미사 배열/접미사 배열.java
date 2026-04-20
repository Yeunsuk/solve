import java.util.*; //11656(문자열) 접미사 배열
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String[] arr = new String[str.length()];
    
    for (int i = 0; i < str.length(); i++) arr[i] = str.substring(i, str.length());
    Arrays.sort(arr);

    for(String tmp : arr) bw.write(tmp + "\n");
    bw.close();
  }
}