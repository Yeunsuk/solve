import java.util.*; // 16488(기하학) 피카츄가 낸 어려운 문제
import java.io.*;

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    
    bw.write(String.valueOf(n * n * k));
    bw.close();
  }
}