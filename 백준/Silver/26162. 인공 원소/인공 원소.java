import java.util.*; //26162(수학) 인공 원소
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    boolean arr[] = new boolean[119];
    arr[0] = arr[1] = true;

    for(int i = 2; i < 119; i++) {
      if(!arr[i]) {
        for(int j = i * 2; j < 119; j += i) arr[j] = true;
      }
    }

    while(Test-- > 0) {
      int num = Integer.parseInt(br.readLine());
      boolean std = false;

      for(int i = 2; i < num; i++) {
        if(arr[num - i]) continue;
        if(arr[i]) continue;
        std = true;
        break;
      }
      
      sb.append(std ? "Yes\n" : "No\n");
    }

    bw.write(sb.toString());
    bw.close();
  }
}