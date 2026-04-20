import java.util.*; //2822(정렬) 점수 계산
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int[] arr = new int[8];
    int sum = 0;
    
    for(int i = 0; i < 8; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    int[] arr_sort = Arrays.copyOf(arr, arr.length);
    Arrays.sort(arr_sort);
    br.close();
    
    for(int i = 0; i < 5; i++) {
      sum += arr_sort[7 - i];
      for(int j = 0; j < 8; j++) {
        if(arr_sort[7 - i] == arr[j]) {
          arr[j] = -1;
          break;
        }
      }
    }
    
    sb.append(sum + "\n");
    for(int i = 0; i < 8; i++) {
      if(arr[i] == -1) sb.append(i + 1 + " ");
    }
    
    System.out.print(sb);
  } 
}
