import java.util.*; //2559(누적 합) 수열
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
      
    int num = Integer.parseInt(st.nextToken()), rlt = Integer.MIN_VALUE;;
    int std = Integer.parseInt(st.nextToken()), sum = 0;
    int[] arr = new int[num];

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < num; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    for(int i = 0; i < std - 1; i++) sum += arr[i];
    for(int i = std - 1; i < num; i++) {
      sum += arr[i];
      if(sum > rlt) rlt = sum;
      sum -= arr[i - std + 1];
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}