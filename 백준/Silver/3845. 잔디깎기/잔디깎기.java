import java.util.*; //3845(정렬) 잔디깎기
import java.awt.Stroke;
import java.io.*;

public class Main {
  static double Macro(String str) {
    return Double.parseDouble(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = "";
    
    while(!(str = br.readLine()).equals("0 0 0.0")) {
      StringTokenizer st = new StringTokenizer(str);
      int a = Integer.parseInt(st.nextToken()), i;
      int b = Integer.parseInt(st.nextToken());
      double std = Macro(st.nextToken());
      double[] arr_x = new double[a];
      double[] arr_y = new double[b];
      boolean rlt = true;

      st = new StringTokenizer(br.readLine());
      for(i = 0; i < a; i++) arr_x[i] = Macro(st.nextToken());
      Arrays.sort(arr_x);
      
      st = new StringTokenizer(br.readLine());
      for(i = 0; i < b; i++) arr_y[i] = Macro(st.nextToken());
      Arrays.sort(arr_y);
      
      for(i = 0; i < a - 1; i++) if(arr_x[i] + std / 2 < arr_x[i + 1] - std / 2) rlt = false;
      for(i = 0; i < b - 1; i++) if(arr_y[i] + std / 2 < arr_y[i + 1] - std / 2) rlt = false;
      
      if(arr_y[b - 1] + std / 2 < 100) rlt = false;
      if(arr_x[a - 1] + std / 2 < 75) rlt = false;
      
      if(arr_x[0] - std / 2 > 0) rlt = false;
      if(arr_y[0] - std / 2 > 0) rlt = false;
      
      bw.write(rlt ? "YES" : "NO");
      bw.newLine();
    }
    	
    bw.close();
  }
}