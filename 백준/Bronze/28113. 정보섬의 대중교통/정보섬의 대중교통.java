import java.util.*; //28113(수학) 정보섬의 대중교통
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    
    bw.write(n <= b ? (a == b ? "Anything" : (b > a ? "Bus" : "Subway")) : "Subway");
    bw.close();
  }
}