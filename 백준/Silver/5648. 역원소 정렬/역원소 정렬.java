import java.util.*; //5648(기하학) 역원소 정렬
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Macro(st.nextToken());
    String str = "", tmp = "";
    long arr[] = new long[n];

    while(n > 0) {
      while(st.hasMoreTokens()) {
        str = st.nextToken();
        tmp = "";
        
        for(int i = str.length() - 1; i >= 0; i--) tmp += str.charAt(i);
        arr[--n] = Long.valueOf(tmp);
      }
      
      if(n > 0) st = new StringTokenizer(br.readLine());
    }
    
    Arrays.sort(arr);
    for(int i = 0; i < arr.length; i++) bw.write(arr[i] + "\n");
    bw.close();
  }
}