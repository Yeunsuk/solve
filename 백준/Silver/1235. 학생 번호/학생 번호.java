import java.util.*; //1235(문자열) 학생 번호
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), i;
    String[] arr = new String[n];
    
    for(i = 0; i < n; i++) arr[i] = br.readLine();
    int tmp = arr[0].length();

    for(i = 1; i <= tmp; i++) {
      Set<String> set = new HashSet<>();
      for(int j = 0; j < n; j++) set.add(arr[j].substring(tmp - i));
      
      if(set.size() == n) {
        bw.write(String.valueOf(i));
        break;
      }
    }
    
    bw.close();
  }
}