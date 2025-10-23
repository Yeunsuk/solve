import java.util.*; //18110(수학) solved.ac
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), rlt = 0;

    if(num != 0) {
      int std = (int)Math.round(num * 0.15);
      int[] arr = new int[num];
  
      for(int i = 0; i < num; i++) arr[i] = Integer.parseInt(br.readLine());
      Arrays.sort(arr);
  
      for(int i = std; i < num - std; i++) rlt += arr[i];
      rlt = (int)Math.round((double)rlt / (num - std * 2));
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}