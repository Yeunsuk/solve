import java.util.*; //1544(자료 구조) 사이클 단어
import java.io.*;

public class Main {
  static int Macro(String str) {
    return Integer.parseInt(str);
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Macro(br.readLine()), rlt = 0;
    ArrayList<String>[] arr = new ArrayList[n];
    
    for(int i = 0; i < n; i++) {
      arr[i] = new ArrayList<>();
      String str = br.readLine();
      boolean std = true;
      
      for(int j = 0; j < str.length(); j++) arr[i].add(str.substring(j)+ str.substring(0,j));
      
      for(int j = 0; std && j < i; j++) {
        for(int k = 0; std && k < arr[j].size(); k++) {
          if(str.equals(arr[j].get(k))) std = false;
        }
      }
      
      if(std) rlt++;
    }

    bw.write(String.valueOf(rlt));
    bw.flush();
  }
}