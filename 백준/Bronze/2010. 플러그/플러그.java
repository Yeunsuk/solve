import java.util.*; //2010(수학) 플러그
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    int sum = 0;
      
    for(int i = 0; i < Test; i++) sum += Integer.parseInt(br.readLine());
    System.out.print(sum - Test + 1);
  }
}