import java.util.*; //1769(문자열) 3의 배수
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String arr = br.readLine();
    int cnt = 0;
    
    while(true) {
      long sum = 0;
      if(arr.length() == 1) break;  
      for(int i = 0; i < arr.length(); i++) sum += Integer.parseInt(String.valueOf(arr.charAt(i)));
      
      cnt++;
      arr = String.valueOf(sum);
    }

    bw.write(String.valueOf(cnt));
    bw.write("\n");
    
    if(Integer.parseInt(String.valueOf(arr)) % 3 == 0) bw.write("YES");
    else bw.write("NO");
    bw.close();
  }
}