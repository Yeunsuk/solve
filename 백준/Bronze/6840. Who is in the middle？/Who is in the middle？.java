import java.util.*; //6840(구현) Who is in the middle?
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int arr[] = new int[3];

    for(int i = 0; i < 3; i++) arr[i] = Integer.parseInt(br.readLine());
    Arrays.sort(arr);

    System.out.print(arr[1]);
  }
}