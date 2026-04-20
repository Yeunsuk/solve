import java.util.*; //11650(정렬) 좌표 정렬하기
import java.io.*;

public class Main {
  
  public static void main(String[] args) throws IOException{ 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;
    
    int num = Integer.parseInt(br.readLine());
    int[][] arr = new int[num][2];
    
    for(int i = 0; i < num; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j < 2; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    br.close();
    Arrays.sort(arr, new Comparator<int[]>() {
      public int compare(int[] arr1, int[] arr2) {
        if (arr1[0] == arr2[0])
          return arr1[1] - arr2[1];
        else
          return arr1[0] - arr2[0];
      }
    });
    
    for(int i = 0; i < num; i++) {
      for(int j = 0; j < 2; j++) {
        sb.append(arr[i][j] + " ");
      }
      sb.append("\n");
    }
    
    System.out.print(sb);
  } 
}