import java.util.*; //10814(정렬) 나이순 정렬
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[][] str = new String[n][2];
    StringTokenizer st;
    
    for(int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      str[i][0] = st.nextToken();
      str[i][1] = st.nextToken();
    }

    Arrays.sort(str, new Comparator<String[]>() {
      public int compare(String[] str1, String[] str2) {
        return Integer.parseInt(str1[0]) - Integer.parseInt(str2[0]);
      }
    });

    for(int i = 0; i < n; i++) bw.write(str[i][0] + " " + str[i][1] + "\n");
    bw.close();
  }
}