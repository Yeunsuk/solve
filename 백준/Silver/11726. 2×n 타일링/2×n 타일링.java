import java.util.*; //11726(DP) 2xn 타일링
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());

    if(num == 1) bw.write("1");
    else {
      int arr[] = new int[num];
      arr[0] = 1; arr[1] = 2;
  
      for(int i = 2; i < num; i++) arr[i] = (arr[i - 1] + arr[i - 2]) % 10007;
      bw.write(String.valueOf(arr[num - 1]));
    }
    
    bw.close();
  }
}