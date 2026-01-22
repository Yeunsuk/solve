import java.util.*; //2566(구현) 최댓값
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int max=0,x=1,y=1;
    
    for(int i=0;i<9;i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j=0;j<9;j++) {
        int tmp=Integer.parseInt(st.nextToken());
        if(tmp>max) {
          max=tmp;
          x=i+1;
          y=j+1;
        }
      }
    }

    System.out.print(max+"\n"+x+" "+y);
  }
}