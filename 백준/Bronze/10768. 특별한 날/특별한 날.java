import java.io.*; //10768(구현) 특별한 날

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int m = Integer.parseInt(br.readLine());
    int d = Integer.parseInt(br.readLine());

    if (m < 2)
      System.out.print("Before");
    else if (m == 2) {
      if (d < 18)
        System.out.print("Before");
      else if (d > 18)
        System.out.print("After");
      else
        System.out.print("Special");
    } else
      System.out.print("After");
  }
}