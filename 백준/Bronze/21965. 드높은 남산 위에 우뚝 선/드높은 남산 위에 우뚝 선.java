import java.util.*; //21965(구현) 드높은 남산 위에 우뚝 선
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), cnt = 0;
    int[] arr = new int[num];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < num; i++) arr[i] = Integer.parseInt(st.nextToken());
    
    for(int i = 1; i < num; i++) {
      if(arr[i - 1] < arr[i]) {
        if(cnt == -1) {
          bw.write("NO");
          bw.close();
          return;
        }
        cnt++;
      }
      
      else if(arr[i - 1] == arr[i]) {
        bw.write("NO");
        bw.close();
        return;
      }
      
      else cnt = -1;
    }

    bw.write("YES");
    bw.close();
  }
}