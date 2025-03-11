import java.util.*; //5554(수학) 심부름 가는 길
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int sum = Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine());
    bw.write(sum / 60 + "\n" + sum % 60);
    bw.close();
  }
}