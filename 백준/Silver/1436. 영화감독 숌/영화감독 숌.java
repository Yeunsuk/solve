import java.util.*; //1436(브루트포스) 영화감독 숌
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      int num = Integer.parseInt(br.readLine());
      int six = 666;
      int cnt = 1;
      
      while(cnt != num) {
        six++;
        if(String.valueOf(six).contains("666")) cnt++;
      }
    
      bw.write(String.valueOf(six));
      bw.close();
  }
}