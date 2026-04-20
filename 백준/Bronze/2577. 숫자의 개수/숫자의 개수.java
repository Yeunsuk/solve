import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());
    int num = a*b*c;
    String S = String.valueOf(num);

    for(int i=0; i <= 9; i++) {
      int count = 0;
      for(int j=0; j < S.length(); j++) {
        if((S.charAt(j) - '0') == i) count++;
      }
      System.out.println(count);
    }
    
  }
}