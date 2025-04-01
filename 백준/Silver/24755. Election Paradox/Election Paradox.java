import java.util.*; //24755(그리디) Election Paradox
import java.io.*;

public class Main {  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), sum = 0;
    int[] arr = new int[num];
    int std = num / 2 + 1;
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < num; i++) arr[i] = Integer.parseInt(st.nextToken());
    Arrays.sort(arr);

    for(int i = 0; i < num; i++) {
      if(i < std) sum += arr[i] / 2;
      else sum += arr[i];
    }

    bw.write(String.valueOf(sum));
    bw.close();
  }
}