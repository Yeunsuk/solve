import java.io.*; //2596 비밀편지
import java.math.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String[] arr = new String[] {"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"};
    int n = Integer.parseInt(br.readLine());
    String s = br.readLine();
    
    for(int i=0; i<n; i++) {
      int idx = -1;

      for(int j=0; j<8 && idx==-1; j++) {
        int tmp = 0;
        
        for(int k=0; k<6 && tmp<=1; k++) if(s.charAt(i*6 + k) != arr[j].charAt(k)) tmp++;
        if(tmp<=1) idx=j;
      }

      if(idx==-1) {
        System.out.println(i+1);
        return;
      }
      
      sb.append((char)('A'+idx));
    }
    
    System.out.print(sb);
  }
}