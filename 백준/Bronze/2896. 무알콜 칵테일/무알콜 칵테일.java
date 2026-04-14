import java.io.*; //2896 무알콜 칵테일
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double A[] = new double[6];
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int i=0; i<3; i++) A[i] = Integer.parseInt(st.nextToken());
    
    st = new StringTokenizer(br.readLine());
    for(int i=3; i<6; i++) A[i] = Integer.parseInt(st.nextToken());

    double min = Math.min(A[0]/A[3], Math.min(A[1]/A[4], A[2]/A[5]));
    for(int i=0; i<3; i++) System.out.print(A[i] - A[i+3]*min + " ");
  }
}