import java.util.*; //1100(문자열) 하얀 칸
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[][] arr = new char[8][8];
    int rlt = 0;

    for(int i = 0; i < 8; i++){
      String tmp = br.readLine();
      for(int j = 0; j < 8; j++){
        arr[i][j] = tmp.charAt(j);
        if((i + j) % 2 == 0 && arr[i][j] == 'F') rlt++;
      }
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}