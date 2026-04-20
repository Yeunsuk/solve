import java.util.*; //1333(구현) 부재중 전화
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }
  
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    ArrayList<Boolean> arr = new ArrayList<Boolean>();
    int num = Macro(st.nextToken()), rlt = 0;
    int len = Macro(st.nextToken());
    int gp = Macro(st.nextToken());
    

    for(int i = 0; i < num; i++) {
      for(int j = 0; j < len; j++) arr.add(true);
      if(i != num - 1) for(int j = 0; j < 5; j++) arr.add(false);
    }

    while(rlt < arr.size()) { 
      if(arr.get(rlt) == false) break;
      rlt += gp;    
    }
    
    bw.write(String.valueOf(rlt));
    bw.close();
  }
}