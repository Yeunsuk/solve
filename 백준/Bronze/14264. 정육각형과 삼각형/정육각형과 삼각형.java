import java.util.*; //14264(기하학) 정육각형과 삼각형
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine());

    double rlt = (Math.sqrt(3) / 4) * n * n;
    bw.write(String.valueOf(rlt));
    bw.close(); 
  }
}