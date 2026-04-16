import java.io.*; //11948 과목 선택
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int arr[] = new int[6];
    int sum = 0;

    for(int i=0; i<6; i++) arr[i] = Integer.parseInt(br.readLine());
    Arrays.sort(arr, 0,4);
    Arrays.sort(arr, 4,6);

    for(int i=1; i<4; i++) sum += arr[i];
    sum += arr[5];
    
    System.out.print(sum);
  }
}