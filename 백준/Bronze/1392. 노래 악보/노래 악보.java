import java.io.*; //1392 노래악보
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken()) + 1;
    int q = Integer.parseInt(st.nextToken());
    StringBuilder sb = new StringBuilder();
    int[] arr = new int[num];
    
    for(int i=1; i<num; i++) {
      int t = Integer.parseInt(br.readLine());
      arr[i] = arr[i-1] + t;
    }
    
    for(int i=0; i<q; i++) {
      int n = Integer.parseInt(br.readLine()), lt = 1, rt = num-1;
      
      while(lt < rt) {
        int mid = (lt+rt) / 2;
        if(arr[mid]>n) rt = mid;
        else lt = mid+1;
      }
      
      sb.append(lt).append("\n");
    }
    
    System.out.print(sb);
  }
}