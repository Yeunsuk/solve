import java.util.*; //30970(정렬) 선택의 기로 
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Macro(br.readLine()), cnt = 0;
    int[][] arr = new int[10_001][10_001];
    
    while(Test-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      arr[Macro(st.nextToken())][Macro(st.nextToken())]++;
    }

    for(int i = 10_000; i > 0; i--) {
      if(cnt == 2) break;
      for(int j = 1; j < 10_001; j++) {
        if(cnt == 2) break;
        if(arr[i][j] > 1 && cnt == 0) {
          bw.write(i + " " + j + " " + i + " " + j + "\n");
          cnt = 2;
        }else if(arr[i][j] > 1 && cnt == 1) {
          bw.write(i + " " + j + "\n");
          cnt++;
        }else if(arr[i][j] == 1 && cnt == 0) {
          bw.write(i + " " + j + " ");
          cnt++;
        }else if(arr[i][j] == 1 && cnt == 1) {
          bw.write(i + " " + j + "\n");
          cnt++;
        }
      }
    }

    cnt = 0;
    for(int i = 1; i < 10_001; i++) {
      if(cnt == 2) break;
      for(int j = 10_000; j > 0; j--) {
        if(cnt == 2) break;
        if(arr[j][i] > 1 && cnt == 0) {
          bw.write(j + " " + i + " " + j + " " + i + "\n");
          cnt = 2;
        }else if(arr[j][i] > 1 && cnt == 1) {
          bw.write(j + " " + i + "\n");
          cnt++;
        }else if(arr[j][i] == 1 && cnt == 0) {
          bw.write(j + " " + i + " ");
          cnt++;
        }else if(arr[j][i] == 1 && cnt == 1) {
          bw.write(j + " " + i + "\n");
          cnt++;
        }
      }
    }
    
    bw.close();
  }
}