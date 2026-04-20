import java.util.*; //1940(정렬) 주몽
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), cnt = 0;
    int std = Macro(br.readLine()), i, j;
    int[] arr = new int[n];
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(i = 0; i < n; i++) arr[i] = Macro(st.nextToken());
    Arrays.sort(arr);
    j = n - 1;
    i = 0;

    while(i < j) {
      if(arr[i] + arr[j] < std) i++;
      else if (arr[i] + arr[j] > std) j--;
      else {
        cnt++;
        i++;
        j--;
      }
    }

    bw.write(String.valueOf(cnt));
    bw.close();
  }
}