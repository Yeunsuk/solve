import java.util.*; //1654(이분탐색) 랜선 자르기
import java.io.*;

public class Main {
  static long high, mid, low;
  static int num, key;
  static int[] arr;

  public static void main(String[] args) throws IOException{ 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());  
    num = Integer.parseInt(st.nextToken());
    key = Integer.parseInt(st.nextToken());
    arr = new int[num];
    high = 0; low = 0;
    
    for(int i = 0; i < num; i++) {
      arr[i] = Integer.parseInt(br.readLine());
      if(high < arr[i]) high = arr[i];
    }

    high++;
    while(low < high) {
      
      mid = (low + high) / 2;
      long sum = 0;
      
      for(int i = 0; i < num; i++) {
        sum += arr[i] / mid;
        if(sum >= key) break;
      }
      
      if(sum < key) high = mid;
      else low = mid + 1;
    }

    System.out.print(low - 1);
  } 
}