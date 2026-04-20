import java.util.*; //14215(기하학) 세 막대
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[3];

    for(int i = 0; i < 3; i++) arr[i] = Macro(st.nextToken());
    Arrays.sort(arr);
    
    if(arr[0] + arr[1] > arr[2]) bw.write(String.valueOf(arr[0] + arr[1] + arr[2]));
    else bw.write(String.valueOf((arr[0] + arr[1]) * 2 - 1));
    bw.close();
  }
}