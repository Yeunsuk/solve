import java.io.*; //18409 母音を数える (Counting Vowels)

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine()), cnt = 0;
    String s = br.readLine();
    
    for(int i = 0; i < n; i++) {
      switch(s.charAt(i)) {
        case 'a': case 'i': case 'u': case 'e': case 'o':
          cnt++;
      }
    }
    
    System.out.print(cnt);
  }
}