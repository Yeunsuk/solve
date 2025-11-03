import java.util.*; //12738(dp) 가장 긴 증가하는 부분 수열 3
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> list = new ArrayList<>();
    int num = Integer.parseInt(br.readLine());
    int[] arr = new int[num];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < num; i++) arr[i] = Integer.parseInt(st.nextToken());

    for(int x : arr) {
      int pos = Collections.binarySearch(list, x);
      if(pos < 0) pos = -(pos + 1);
      
      if(pos == list.size()) list.add(x);
      else list.set(pos, x);
    }

    bw.write(String.valueOf(list.size()));
    bw.close();
  }
}