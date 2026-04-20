import java.util.*; //11728(정렬) 배열 합치기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken()); 		
    int[] rlt = new int[a + b];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < a; i++) rlt[i]= Integer.parseInt(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < b; i++) rlt[i + a] = Integer.parseInt(st.nextToken()); 
    
    Arrays.sort(rlt);
    br.close();
      
    for(int c : rlt) bw.write(c + " ");
    bw.close();
  }
}