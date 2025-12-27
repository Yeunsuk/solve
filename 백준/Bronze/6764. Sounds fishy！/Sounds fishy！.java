import java.util.*; //6764(구현) Sounds fishy!
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int arr[] = new int[4];

    for(int i = 0; i < 4; i++) arr[i] = Integer.parseInt(br.readLine());
    if(arr[0]<arr[1] && arr[1]<arr[2] && arr[2]<arr[3]) bw.write("Fish Rising");
    else if(arr[0]>arr[1] && arr[1]>arr[2] && arr[2]>arr[3]) bw.write("Fish Diving");
    else if(arr[0]==arr[1] && arr[1]==arr[2] && arr[2]==arr[3]) bw.write("Fish At Constant Depth");
    else bw.write("No Fish");
    bw.close();
  }
}