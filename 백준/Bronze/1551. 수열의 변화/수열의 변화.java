import java.util.*; //1551(문자열) 수열의 변화
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Macro(st.nextToken());
    int[] arr = new int[num];

    int Test = Macro(st.nextToken());
    st = new StringTokenizer(br.readLine(), ",");
    for(int i = 0; i < num; i++) arr[i] = Macro(st.nextToken());
    
    int[] rlt = Arrays.copyOf(arr, arr.length);
    num--;
    
    while(Test != 0) {
      int[] tmp = new int[num];
      
      for(int i = 0; i < rlt.length - 1; i++) tmp[i] = rlt[i + 1] - rlt[i];
      rlt = Arrays.copyOf(tmp, tmp.length);
      Test--;
      num--;
    }
    
    for(int i = 0; i < rlt.length; i++) bw.write(i == rlt.length - 1 ? String.valueOf(rlt[i]) : rlt[i] + ",");
    bw.close();
  }
}