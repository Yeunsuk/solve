import java.io.*; //9093 단어 뒤집기

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();
    char[] arr = new char[20];
    int std = 0;

    while(Test > 0) {
      int tmp = br.read();
      if(tmp==10 || tmp==32) {
        for(int i = std-1 ; i >= 0; i--) sb.append(arr[i]);
        if(tmp == 32) sb.append(' ');
        if(tmp == 10) {
          sb.append('\n');
          Test--;
        }
        
        std = 0;
      } else arr[std++] = (char) tmp;
    }
    
    System.out.print(sb);
  }
}