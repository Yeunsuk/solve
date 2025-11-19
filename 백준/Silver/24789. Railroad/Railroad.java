import java.util.*; //24789(graphs) Railroad
import java.io.*;

public class Main {
  static int stoi(String s) { return Integer.parseInt(s); }
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    st.nextToken();
    
    bw.write(stoi(st.nextToken())%2==0 ? "possible" : "impossible"); 
    bw.close();
  }
}