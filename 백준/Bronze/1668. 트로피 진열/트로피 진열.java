import java.io.*; //1668 트로피 진열

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine()), lt=0, rt=0, max=0;
    int[] arr = new int[n];

    for(int i=0; i<n; i++) arr[i] = Integer.parseInt(br.readLine());
    for(int i=0; i<n; i++) {
      if(arr[i]>max) {
        max=arr[i];
        lt++;
      }
    }

    max=0;
    for(int i = n-1; i >= 0; i--) {
      if(arr[i]>max) {
        max=arr[i];
        rt++;
      }
    }
    
    System.out.print(lt+"\n"+rt+"\n");
  }
}