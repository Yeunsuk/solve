import java.util.*; //2558(수학) A + B - 2
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    bw.write(String.valueOf(Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine())));
    bw.close();
  }
}