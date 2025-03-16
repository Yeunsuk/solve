import java.util.*; //27514(구현) 1차원 2048
import java.io.*;

public class Main {
  static int Exponential(long n) {
    int count = 0;

    while(n % 2 == 0) {
      n /= 2;
      count++;
    }

    return count;
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), rlt = 0;
    int[] arr = new int[80];
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i = 0; i < num; i++) {
      long tmp = Long.parseLong(st.nextToken());
      if(tmp == 0) continue;
      else if(tmp == 1) arr[0]++;
      else arr[Exponential(tmp)]++;
    }
    
    for(int i = 0; i < 80; i++) {
      if(arr[i] == 0) continue;
      else if(arr[i] == 1) rlt = i;
      else arr[i + 1] += arr[i] / 2;
    }
    
    bw.write(String.valueOf((1L << rlt)));
    bw.close();
  }
}