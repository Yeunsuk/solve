import java.io.*; //1731 추론

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int a[] = new int[n];

    for(int i = 0; i < n; i++) a[i] = Integer.parseInt(br.readLine());
    System.out.print(a[0]+a[2]==2*a[1] ? a[n-1]+a[1]-a[0] : a[n-1]*(a[1]/a[0]));
  }
}