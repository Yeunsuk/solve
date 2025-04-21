import java.io.*; //16017(구현) Telemarketer or not?

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int arr[] = new int[4];

    for(int i = 0; i < 4; i++) arr[i] = Integer.parseInt(br.readLine());
    System.out.print((arr[0] == 8 || arr[0] == 9) && (arr[3] == 8 || arr[3] == 9) && arr[1] == arr[2] ? "ignore" : "answer");
  }
}