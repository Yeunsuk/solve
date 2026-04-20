import java.util.*; //1380(문자열) 귀걸
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int Test = 0;
    
    while(true) {
      int n = Integer.parseInt(br.readLine());
      if(n == 0) break;
      Test++;
      
      String[] na = new String[n];
      char[] tf = new char[n];
    
      for(int i = 0; i < n; i++) na[i]=br.readLine();
      for(int i = 0; i < 2 * n - 1; i++) {
        st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        if(tf[num - 1] == 'A' || tf[num - 1] == 'B') { 
          tf[num - 1] = st.nextToken().charAt(0);
          tf[num - 1] = 'F';
        }else tf[num - 1] = st.nextToken().charAt(0);
      }
      
      for(int i = 0; i < n; i++) if(tf[i] !='F') bw.write(Test + " " + na[i] + "\n");
    }

    br.close();
    bw.close();
  }
}