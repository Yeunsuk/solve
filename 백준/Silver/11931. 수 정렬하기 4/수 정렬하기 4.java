import java.util.*; //11931(정렬) 수 정렬하기 4
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    Integer tmp[] = new Integer[n];

    for(int i = 0; i < n; i++) tmp[i] = Integer.parseInt(br.readLine());
    Arrays.sort(tmp, Collections.reverseOrder());
    for(int i : tmp) bw.write(i + "\n"); 
    bw.close();
  }
}