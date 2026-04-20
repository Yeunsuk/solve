import java.util.*; //5073(기하학) 삼각형과 세 변
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[3];
    StringTokenizer st;
    
    while(true) {
      st = new StringTokenizer(br.readLine());
      arr[0] = Macro(st.nextToken());
      arr[1] = Macro(st.nextToken());
      arr[2] = Macro(st.nextToken());

      if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
      Arrays.sort(arr);

      if(arr[2] >= arr[0] + arr[1]) bw.write("Invalid\n");
      else if(arr[0] == arr[1] && arr[1] == arr[2]) bw.write("Equilateral\n");
      else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) bw.write("Isosceles\n");
      else bw.write("Scalene\n");
    }
    
    bw.close();
  }
}