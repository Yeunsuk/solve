import java.util.*; //4717(구현) Lunacy
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    while(true) {
      double std = Double.parseDouble(br.readLine());
      if(std < 0) break;
      
      sb.append(String.format(
          "Objects weighing %.2f on Earth will weigh %.2f on the moon.%n",
          std, std * 0.167
      ));
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}