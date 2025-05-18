import java.util.*; //19583(문자열) 싸이버개강총회
import java.io.*;

public class Main {
  public static int istime(String time) {
      String[] tmp = time.split(":");
      return Integer.parseInt(tmp[0]) * 60 + Integer.parseInt(tmp[1]);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int stt = istime(st.nextToken()), cnt = 0;
    int end1 = istime(st.nextToken());
    int end2 = istime(st.nextToken());
    Set<String> set = new HashSet<>();
    String str;
    
    while((str = br.readLine()) != null) {
      st = new StringTokenizer(str);
      int arr = istime(st.nextToken());
      String name = st.nextToken();
      
      if(arr <= stt) set.add(name);
      else if(end1 <= arr && arr <= end2 && set.contains(name)) {
        set.remove(name);
        cnt++;
      }
    }
    
    bw.write(String.valueOf(cnt));
    bw.close();
  }
}