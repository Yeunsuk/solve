import java.io.*; //2712 미국 스타일
import java.util.*;
import java.text.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    DecimalFormat df = new DecimalFormat("0.0000");
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    
    while(Test-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      double n = Double.parseDouble(st.nextToken()), std;
      String str;

      switch (st.nextToken()) {
        case "kg": std = n*2.2046; str = " lb\n"; break;
        case "lb": std = n*0.4536; str = " kg\n"; break;
        case "l":  std = n*0.2642; str = " g\n";  break;
        default:   std = n*3.7854; str = " l\n";
      }

      sb.append(df.format(std)).append(str);
    }

    System.out.print(sb);
  }
}