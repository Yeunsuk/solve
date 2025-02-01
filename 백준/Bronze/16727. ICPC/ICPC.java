import java.util.*; //16727(구현) ICPC
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int per = Macro(st.nextToken());
    int e = Macro(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int est = Macro(st.nextToken());
    int p = Macro(st.nextToken());
    per += p;
    est += e;

    if(per != est) bw.write(per > est ? "Persepolis" : "Esteghlal");
    else bw.write(p == e ? "Penalty" : p > e ? "Persepolis" : "Esteghlal");
    bw.close();
  }
}