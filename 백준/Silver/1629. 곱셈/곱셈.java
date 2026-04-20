import java.util.*; //1629(수학) 곱셈
import java.io.*;

public class Main {
  public static long pow(long n, long min, long dvd) {
    if(min == 1) return n % dvd;
    long t = pow(n, min/2, dvd);
    
    if(min % 2 == 1) return t * t % dvd * n % dvd;
    return t * t % dvd;
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    long a = Long.parseLong(st.nextToken());
    long b = Long.parseLong(st.nextToken());
    long c = Long.parseLong(st.nextToken());

    bw.write(String.valueOf(pow(a, b, c)));
    bw.close();
  }
}