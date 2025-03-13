import java.util.*; //18384(수학) PRIM
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  static int[] Prime(int max) {
    boolean[] arr = new boolean[max + 1];
    arr[0] = arr[1] = true;
    int cnt = 0, idx = 0;

    for(int i = 2; i * i <= max; i++) {
      if(!arr[i]) {
        for(int j = i * i; j <= max; j += i) arr[j] = true;
      }
    }

    for(int i = 2; i <= max; i++) if(!arr[i]) cnt++;
    int[] pri = new int[cnt];
    
    for(int i = 2; i <= max; i++) if(!arr[i]) pri[idx++] = i;
    return pri;
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int Test = Macro(br.readLine());
    int[] prr = Prime(1_000_000);
    
    while(Test-- > 0) {
      String[] input = br.readLine().split(" ");
      int[] arr = new int[input.length];
      int sum = 0;

      for(int i = 0; i < input.length; i++) {
        arr[i] = Macro(input[i]);
      }

      for(int num : arr) {
        int tmp = Arrays.binarySearch(prr, num);
        if(tmp < 0) tmp = -(tmp + 1);
        sum += prr[tmp];
      }
      
      sb.append(sum).append("\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}