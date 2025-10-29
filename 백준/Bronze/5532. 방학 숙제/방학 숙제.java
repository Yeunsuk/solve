import java.util.*; //5532(수학) 방학 숙제
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    int c = Integer.parseInt(br.readLine());
    int d = Integer.parseInt(br.readLine());
    a = (a % c == 0) ? a /= c : a / c + 1;
    b = (b % d == 0) ? b /= d : b / d + 1;
    int std = (a > b) ? a : b;
    
    
    bw.write(String.valueOf(num - std));
    bw.close();
  }
}