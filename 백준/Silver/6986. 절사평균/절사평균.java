import java.util.*; //6986(구현) 절사평균
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    StringBuilder sb = new StringBuilder();
    double[] arr = new double[num];
    double sum = 0;
    
    for(int i = 0; i < num; i++) arr[i] = Double.parseDouble(br.readLine());
    Arrays.sort(arr);
      
    for(int i = k; i < num - k; i++) sum += arr[i];
    sum += 0.00000001;
    
    sb.append(String.format("%.2f", sum / (num - 2 * k))).append('\n');
    for(int i = 0; i < k; i++) sum += arr[k] + arr[num - k - 1];
    sum += 0.00000001;
    
    sb.append(String.format("%.2f", sum / num));
    bw.write(sb.toString());
    bw.close();
  }
}