import java.io.*; //15727 조별과제를 하려는데 조장이 사라졌다

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    System.out.print(n%5==0 ? n/5 : n/5+1);
  }
}