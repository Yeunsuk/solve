import java.util.*; //9366(기하학) 삼각형 분류
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Macro(br.readLine()) + 1;
    int[] arr = new int[3];
    StringTokenizer st;

    for(int i = 1; i < num; i++) {
      st = new StringTokenizer(br.readLine());
      arr[0] = Macro(st.nextToken());
      arr[1] = Macro(st.nextToken());
      arr[2] = Macro(st.nextToken());
      Arrays.sort(arr);

      if(arr[0] + arr[1] <= arr[2]) bw.write("Case #" + i + ": invalid!\n");
      else if(arr[0] == arr[1] && arr[1] == arr[2]) bw.write("Case #" + i + ": equilateral\n");
      else if(arr[0] == arr[1] || arr[1] == arr[2]) bw.write("Case #" + i + ": isosceles\n");
      else bw.write("Case #" + i + ": scalene\n");      
    }
    
    bw.close(); 
  }
}