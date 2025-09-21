import java.util.*; // 22942(기하학) 데이터 체커
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    List<int[]> arr = new ArrayList<>();
    Stack<int[]> stack = new Stack<>();
    
    for(int i = 0; i < num; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      arr.add(new int[]{a - b, i});
      arr.add(new int[]{a + b, i});
    }

    Collections.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

    for(int[] tmp : arr) {
      if(!stack.isEmpty()) {
        if(stack.peek()[1] == tmp[1]) stack.pop();
        else stack.push(tmp);
      }else stack.push(tmp);
    }
    
    bw.write(stack.isEmpty() ? "YES" : "NO");
    bw.close();
  }
}