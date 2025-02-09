import java.util.*; //32201(자료구조) 눈사람
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine()), max = -1;
    String[] arr = new String[num];

    StringTokenizer st = new StringTokenizer(br.readLine());
    HashMap<String, Integer> map = new HashMap<>();
    for(int i = 0; i < num; i++) {
      map.put(st.nextToken(), i);
    }

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < num; i++) {
      arr[i] = st.nextToken();
      max = Math.max(max, map.get(arr[i]) - i);
    }

    for(int i = 0; i < num; i++) {
      if(map.get(arr[i]) - i == max) {
        bw.write(arr[i] + " ");
      }
    }
    
    bw.close();
  }
}