import java.util.*; //6784(구현) Multiple Choice
import java.io.*; 

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine()), rlt = 0, i;
    char arr[] = new char[n];
    
    for(i=0; i<n; i++) arr[i] = br.readLine().charAt(0);
    for(i=0; i<n; i++) if(arr[i] == br.readLine().charAt(0)) rlt++;
    System.out.print(rlt);
  }
}