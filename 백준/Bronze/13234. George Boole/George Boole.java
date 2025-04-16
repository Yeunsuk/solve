import java.util.*; //13234(문자열) George Boole
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    boolean a = Boolean.parseBoolean(st.nextToken());
    String op = st.nextToken();
    
    boolean b = Boolean.parseBoolean(st.nextToken());
    boolean rlt = op.equals("AND") ? (a && b) : (a || b);
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}