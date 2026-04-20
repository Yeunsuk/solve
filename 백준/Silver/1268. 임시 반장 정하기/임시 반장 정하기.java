import java.util.*; //1268(구현) 임시 반장 정하기 
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Macro(br.readLine());
    int[][] arr = new int[num][5];
    int rlt = 0, max = 0;
    StringTokenizer st;
    Set<Integer> hash;
    int i, j;
      
    for(i = 0; i < num; i++) {
      st = new StringTokenizer(br.readLine());
      for(j = 0; j < 5; j++) arr[i][j] = Macro(st.nextToken());
    }

    for(i = 0; i < num; i++) {
      hash = new HashSet<>(); 

      for(j = 0; j < 5; j++) {
        for(int k = 0; k < num; k++) {
          if(arr[i][j] == arr[k][j] && k != i) hash.add(k);
        }
      }

      if(max < hash.size()) {
        max = hash.size();
        rlt = i;
      }
    }

    bw.write(String.valueOf(rlt + 1));
    bw.close();
  }
}