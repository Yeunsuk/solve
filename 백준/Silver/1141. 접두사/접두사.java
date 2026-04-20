import java.util.*; //1141(greedy) 접두사
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    String[] arr = new String[num];
    int cnt = 0;
    
    for(int i = 0; i < num; i++) {
      arr[i] = br.readLine();
    }

    Arrays.sort(arr, Comparator.comparing(String::length));
    for(int i = 0; i < num; i++) {
      for(int j = i + 1; j < num; j++) {
        if(arr[j].startsWith(arr[i])) {
          j = num;
          cnt++;
        }
      }
    }
      
    System.out.print(num - cnt);
  }
}