import java.util.*; //25551(수학) 멋쟁이 포닉스
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    b = Math.min(b, Integer.parseInt(st.nextToken()));
    a = Math.min(a, Integer.parseInt(st.nextToken()));

    st = new StringTokenizer(br.readLine());
    a = Math.min(a, Integer.parseInt(st.nextToken()));
    b = Math.min(b, Integer.parseInt(st.nextToken()));

    if(a == b) bw.write(String.valueOf(a * 2));
    else bw.write(String.valueOf(Math.min(a, b) * 2 + 1));
    bw.close();
  }
}