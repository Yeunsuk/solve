import java.util.*; //4299(수학) AFC 윔블던
import java.math.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int sum = Integer.parseInt(st.nextToken());
    int dff = Integer.parseInt(st.nextToken());
    
    if((sum + dff) % 2 != 0 || sum < dff) bw.write("-1");
    else bw.write(((sum + dff) / 2) + " " + (((sum + dff) / 2) - dff));
    bw.close();
  }
}