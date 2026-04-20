import java.util.*; //9656(dp) 돌 게임 2
import java.io.*;

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    
    bw.write(n % 2 == 0 ? "SK" : "CY");
    bw.close();
  }
}