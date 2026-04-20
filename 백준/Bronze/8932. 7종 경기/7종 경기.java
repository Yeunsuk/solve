import java.util.*; //8932(수학) 7종 경기
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    double[] std = {9.23076, 1.84523, 56.0211, 4.99087, 0.188807, 15.9803, 0.11193, 26.7, 75, 1.5, 42.5, 210, 3.8, 254, 1.835, 1.348, 1.05, 1.81, 1.41, 1.04, 1.88};
    int Test = Macro(br.readLine());
    int[] tmp = new int[7];

    while(Test-- > 0) {
      int sum = 0;
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int i = 0; i < 7; i++) tmp[i] = Macro(st.nextToken());

      for(int j = 0; j < 7; j++) sum += std[j] * Math.pow((Math.abs(std[j + 7] - tmp[j])), std[j + 14]);
      bw.write(sum + "\n");
    }
    
    bw.close();
  }
}