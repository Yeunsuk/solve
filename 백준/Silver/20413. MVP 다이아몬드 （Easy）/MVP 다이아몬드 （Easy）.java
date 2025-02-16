import java.util.*; //20413(그리디) MVP 다이아몬드 (Easy)
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), sum = 0, pre = 0;
    int[] arr = new int[num];
    int[] std = new int[4];
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < 4; i++) {
      std[i] = Integer.parseInt(st.nextToken()) - 1;
    }

    String str = br.readLine();
    for (int i = 0; i < num; i++) {
      switch (str.charAt(i)) {
        case 'B': arr[i] = 0; break;
        case 'S': arr[i] = 1; break;
        case 'G': arr[i] = 2; break;
        case 'P': arr[i] = 3; break;
        case 'D': arr[i] = 4; break;
      }
    }
    
    for(int i = 0; i < num; i++) {
      if(arr[i] != 4) {
        int tmp = std[arr[i]] - pre;
        sum += tmp;
        pre = tmp;
      }else sum += std[3] + 1;
    }
    
    bw.write(String.valueOf(sum));
    bw.close();
  }
}