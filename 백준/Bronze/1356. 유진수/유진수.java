import java.util.*; //1356(수학) 유진수
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String arr = br.readLine(), rlt = "NO";
    int std = arr.length();
    
    if(std > 1) {
      for(int i = 1; i < std; i++) {
        int fd = 1, bk = 1, j;
        
        for(j = i; j < std; j++) bk *= (arr.charAt(j)-'0');
        for(j = 0; j < i; j++) fd *= (arr.charAt(j)-'0');
        if(fd == bk) {
          rlt = "YES";
          break;
        }
      }
    }
    
    bw.write(rlt);	
    bw.close();
  }
}