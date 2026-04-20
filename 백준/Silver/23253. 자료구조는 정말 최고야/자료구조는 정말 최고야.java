import java.util.*; //23253(구현) 자료구조는 정말 최고야
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Macro(st.nextToken());
    int n = Macro(st.nextToken());
    boolean rlt = true;

    for(int i = 0; i < n; i++) {
      num = Macro(br.readLine());
      int tmp = 200_001;

      String[] arr = br.readLine().split(" ");
      for(int j = 0; j < num; j++) {
        if(Macro(arr[j]) > tmp) rlt = false;
        tmp = Macro(arr[j]);
      }
    }

    if(rlt) bw.write("Yes");
    else bw.write("No");
    bw.close();
  }
}