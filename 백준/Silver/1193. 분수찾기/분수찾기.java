import java.util.*; //1193(수학) 분수찾기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int cro = 1, sum = 0;
    br.close();

    while(true) {
      if(n <= sum + cro) {
        n -= sum + 1;
        if(cro % 2 == 1) bw.write(String.valueOf(cro - n) + "/" + String.valueOf(n + 1));  
        else bw.write(String.valueOf(n + 1) + "/" + String.valueOf(cro - n));
        break;
      }else {
        sum += cro;
        cro++;
      }
    }
    bw.close();
  }
}