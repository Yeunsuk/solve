import java.io.*; //2846 오르막길
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int arr[] = new int[n];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
    int min=1001, rlt=-1;

    for(int i=0; i<n-1; i++) {
      if(arr[i] < arr[i+1]) {
        min = Math.min(min, arr[i]);
        rlt = Math.max(rlt, arr[i+1]-min);
      }
      else min = 1001;
    }

    System.out.print((rlt==-1) ? "0" : rlt);
  }
}