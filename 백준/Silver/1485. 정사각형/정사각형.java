import java.util.*; //1485번(기하학) 정사각형
import java.io.*;

public class Main {
  public static int condition(int[] arr) { //정사각형
    int[] length = new int[6];
    int x1 = arr[0];
    int y1 = arr[1];
    int cnt = 1;

    for(int i = 2; i < 7; i += 2) { //선분 3개
      int line_x = x1 - arr[i];
      int line_y = y1 - arr[i + 1];
      length[i / 2 - 1] = line_x * line_x + line_y * line_y;
    }

    x1 = arr[2];
    y1 = arr[3];
    for(int i = 4; i < 7; i += 2) { //선분 2개
      int line_x = x1 - arr[i];
      int line_y = y1 - arr[i + 1];
      length[i / 2 + 1] = line_x * line_x + line_y * line_y;
    }

    x1 = arr[4]; // 선분 1개
    y1 = arr[5];
    length[5] = (x1 - arr[6]) * (x1 - arr[6]) + (y1 - arr[7]) * (y1 - arr[7]);
    
    Arrays.sort(length);
    for(int i = 1; i < 4; i++) { //4변 길이 동일여부 판단
      if(length[0] == length[i]) {
        cnt++;
      }
    }

    if(cnt == 4) { // 2대각선 길이 동일여부 판단
      if(length[4] != length[5]) return 0;
      else return 1;
    } else return 0;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int Test = Integer.parseInt(br.readLine());
    for(int i = 0; i < Test; i++) {
      int[] Dot = new int[8];
      for(int j = 0; j < 8; j += 2) {
        st = new StringTokenizer(br.readLine());
        for(int k = 0; k < 2; k++) {
          Dot[j + k] = Integer.parseInt(st.nextToken());
        }
      }
      if(i == Test - 1) {
        sb.append(condition(Dot));
      } else sb.append(condition(Dot) + "\n");
    }
    br.close();
    System.out.print(sb);
  }
}