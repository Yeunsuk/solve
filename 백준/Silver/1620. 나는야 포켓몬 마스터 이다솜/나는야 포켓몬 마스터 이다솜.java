import java.util.*; //1620(자료구조) 나는야 포켓몬 마스터 이다솜
import java.io.*;

public class Main {
  private static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    HashMap<String, Integer> mp = new HashMap<>();
    int num = Macro(st.nextToken());
    int ber = Macro(st.nextToken());
    String na = "";

    String arr[] = new String[num + 1];
    for(int i = 1; i <= num; i++) {
      na = br.readLine();
      arr[i] = na;
      mp.put(na, i);
    }

    while(ber-- > 0) {
      na = br.readLine();

      if(na.charAt(0) <= 57) {
        num = Macro(na);
        bw.write(arr[num] + "\n");
      }else bw.write(mp.get(na) + "\n");
    }

    bw.close();
  }
}