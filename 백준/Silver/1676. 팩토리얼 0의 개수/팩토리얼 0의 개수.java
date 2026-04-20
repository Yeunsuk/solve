import java.util.*; //1676(수학) 팩토리얼 0의 개수
import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int num = Integer.parseInt(br.readLine());
    int cnt = 0;
    br.close();

    for(int i = 1; i <= num; i++) {
      int j = i;
      while(j % 5 == 0) {
        j /= 5;
        cnt++;
      }
    }
    
    System.out.print(cnt);
  } 
}