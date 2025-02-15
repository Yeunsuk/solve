import java.util.*; //29751(수학) 삼각형
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] arr = br.readLine().split(" ");
    
    double tmp = Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
    bw.write(String.format("%.1f", tmp / 2));
    bw.close();
  }
}