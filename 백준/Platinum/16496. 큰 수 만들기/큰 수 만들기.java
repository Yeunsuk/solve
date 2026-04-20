import java.util.*; //16496(그리디) 큰 수 만들기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num = Macro(br.readLine()), i;
    String[] arr = new String[num];
    
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for(i = 0; i < num; i++) arr[i] = st.nextToken();
    
    Arrays.sort(arr, ((x, y) -> (y + x).compareTo(x + y)));
    for(i = 0; i < arr.length; i++) sb.append(arr[i]);
    
    if(sb.charAt(0) == '0') bw.write("0");
    else bw.write(sb.toString());
    bw.close(); 
  }
}