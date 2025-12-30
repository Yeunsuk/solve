import java.io.*; //6810(구현) ISBN

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String ISBN = "9780921418";
    int sum = 0, n = 1, tmp;

    for (int i = 0; i < ISBN.length() + 3; i++) {
      if (i < ISBN.length()) tmp = ISBN.charAt(i) - '0';
      else tmp = Integer.parseInt(br.readLine());
      
      sum += tmp * n;
      n = (n == 1) ? 3 : 1;
    }
    
    System.out.print("The 1-3-sum is " + sum);
  }
}