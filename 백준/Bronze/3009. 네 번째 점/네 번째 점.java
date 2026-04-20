import java.util.*; //3009(기하학) 네 번째 점
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    StringTokenizer st;

    int[] x = new int[3];
    int[] y = new int[3];

    for(int i = 0; i < 3; i++) {
      st = new StringTokenizer(br.readLine()," ");
      x[i] = Integer.parseInt(st.nextToken());
      y[i] = Integer.parseInt(st.nextToken());
    }

    if(x[0] == x[1])      sb.append(x[2] + " ");
    else if(x[0] == x[2]) sb.append(x[1] + " ");
    else sb.append(x[0] + " ");
    

    if(y[0] == y[1])      sb.append(y[2]);
    else if(y[0] == y[2]) sb.append(y[1]);
    else sb.append(y[0]);

    System.out.print(sb);
  }
}