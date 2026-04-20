import java.util.*; //2941(구현) 크로아티아 알파벳
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    String rlt = br.readLine();

    for(int i = 0; i < arr.length; i++) if(rlt.contains(arr[i])) rlt = rlt.replace(arr[i], "#");
    bw.write(String.valueOf(rlt.length()));
    bw.close();
  }
}