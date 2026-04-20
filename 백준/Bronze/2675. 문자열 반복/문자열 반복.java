import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < num; i++) {
      String[] arr = br.readLine().split(" ");
      int n = Integer.parseInt(arr[0]);
      String str = arr[1];
      
      for(int j = 0; j < str.length(); j++) {
        for(int k = 0; k < n; k++) {
          sb.append(str.charAt(j));
        }
      }
      sb.append("\n");
    }
    br.close();
    System.out.print(sb);
  }
}