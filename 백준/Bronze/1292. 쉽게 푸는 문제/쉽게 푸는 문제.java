import java.util.*; //1292(수학) 쉽게 푸는 문제
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    ArrayList<Integer> li = new ArrayList<Integer>();
    int a = Macro(st.nextToken()), rlt = 0;
    int b = Macro(st.nextToken());

    for(int i = 0; i < b; i++) for(int j = 0; j <= i; j++) li.add(i + 1);
    for(int i = a - 1; i < b; i++) rlt += li.get(i);
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}