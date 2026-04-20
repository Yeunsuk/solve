import java.util.*; //10816(자료구조) 숫자 카드 2
import java.io.*;

public class Main {
  private static int Macro(int[] arr, int key) {
    int ma1 = arr.length, ma2 = arr.length;
    int mi1 = 0, mi2 = 0; 

    while (mi1 < ma1) {
      int mid = (mi1 + ma1) / 2;
      
      if (key < arr[mid]) ma1 = mid;
      else mi1 = mid + 1;
    }

    while (mi2 < ma2) {
      int mid = (mi2 + ma2) / 2;
      
      if (key <= arr[mid]) ma2 = mid;
      else mi2 = mid + 1;
    }

    return mi1 - mi2;
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int[] arr = new int[num];
    StringTokenizer st;

    
    st = new StringTokenizer(br.readLine(), " ");
    for(int i = 0; i < num; i++) arr[i] = Integer.parseInt(st.nextToken());

    int m = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    Arrays.sort(arr);

    for(int i = 0; i < m; i++) {
      int key = Integer.parseInt(st.nextToken());
      bw.write(Macro(arr, key) + " ");
    }
    
    bw.close();
  }
} 