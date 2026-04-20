import java.util.*; //7785(자료구조) 회사에 있는 사람
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, String> map = new HashMap<String, String>();
    ArrayList<String> li;
    StringTokenizer st;
    
    int num = Integer.parseInt(br.readLine());
    for(int i = 0; i < num; i++) {
      st = new StringTokenizer(br.readLine());
      String na = st.nextToken();
        
      if(map.containsKey(na)) map.remove(na);
      else map.put(na, "0");
    }
    
    li = new ArrayList<String>(map.keySet()); 
    Collections.sort(li, Collections.reverseOrder());
    for(int i = 0; i < li.size(); ++i) bw.write(String.valueOf(li.get(i)) + "\n");

    br.close();
    bw.close();
  }
} 