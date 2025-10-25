import java.util.*; //4696(수학) St. lves
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while(true) {
      double num = Double.parseDouble(br.readLine());
      if(num == 0) break;

      double rlt = 1 + num + num*num + num*num*num + num*num*num*num;
      sb.append(String.format("%.2f", rlt)).append("\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}