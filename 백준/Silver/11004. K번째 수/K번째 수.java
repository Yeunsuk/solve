import java.util.*; //11004(정렬) K번째 수
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    List<Integer> li = new ArrayList<>();

    for(int i = 0; i < n; i++) li.add(Integer.parseInt(st.nextToken()));
    Collections.sort(li);
    br.close();
    
    bw.write(String.valueOf(li.get(k-1)));
    bw.close();
  }
}