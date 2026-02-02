import java.io.*; //2576(구현) 홀수

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int sum = 0, min = 100;

    for(int i = 0; i < 7; i++) {
      int n = Integer.parseInt(br.readLine());
      if(n%2 == 1) {
        if(n<=min) min = n;
        sum += n;
      }
    }

    if(sum>0) System.out.print(sum + "\n" + min);
    else System.out.print("-1");
  }
}