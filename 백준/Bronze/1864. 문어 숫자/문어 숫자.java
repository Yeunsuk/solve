import java.io.*; //1864 문어 숫자

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    while(true) {
      String s = br.readLine();
      if(s.equals("#")) break;

      int n = s.length(), rlt=0, t;
      
      for(int i=0; i<n; i++) {
        if(s.charAt(i) == '-') t=0;
        else if(s.charAt(i) == '\\') t=1;
        else if(s.charAt(i) == '(') t=2;
        else if(s.charAt(i) == '@') t=3;
        else if(s.charAt(i) == '?') t=4;
        else if(s.charAt(i) == '>') t=5;
        else if(s.charAt(i) == '&') t=6;
        else if(s.charAt(i) == '%') t=7;
        else t=-1;

        rlt = 8*rlt + t;
      }
      
      sb.append(rlt).append("\n");
    }

    System.out.print(sb);
  }
}