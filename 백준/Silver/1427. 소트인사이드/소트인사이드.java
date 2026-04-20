import java.util.*; //1427(문자열) 소트인사이드
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    char[] arr = br.readLine().toCharArray();
    Arrays.sort(arr);
    br.close();
    
    for(int i = arr.length - 1; i > -1; i--) sb.append(arr[i]);
    System.out.print(sb);
  }
}