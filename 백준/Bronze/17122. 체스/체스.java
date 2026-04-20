import java.util.*; //17122(수학) 체스
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    Set<Integer> arr_int = Set.of(1, 3, 5, 7, 10, 12, 14, 16, 17, 19, 21, 23,26, 28, 30, 32, 33, 35, 37, 39, 42, 44, 46, 48, 49, 51, 53, 55, 58, 60, 62, 64);
    Set<Character> arr_ch = Set.of('A', 'C', 'E', 'G');
    int Test = Integer.parseInt(br.readLine());
    

    while(Test-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String str = st.nextToken();
      
      int num = Integer.parseInt(st.nextToken()), black = 0, white = 0;
      boolean std = (arr_ch.contains(str.charAt(0))) ^ (Character.getNumericValue(str.charAt(1)) % 2 == 0);
      
      if(std) black++;
      else white++;

      if(arr_int.contains(num)) black++;
      else white++;
      
      bw.write(black == white ? "NO\n" : "YES\n");
    }
    
    bw.close();
  }
}