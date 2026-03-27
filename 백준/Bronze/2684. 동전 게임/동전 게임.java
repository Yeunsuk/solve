import java.io.*; //2684 동전 게임

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int Test = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    while (Test-- > 0) {
      String s = br.readLine();
      int[] cnt = new int[8];
      int idx = 0;

      
      for(int i=0; i<3; i++) idx=(idx<<1) | (s.charAt(i)=='H' ? 1 : 0);
      cnt[idx]++;

      for(int i=3; i<40; i++) {
        idx = ((idx&0b11) << 1) | (s.charAt(i)=='H' ? 1 : 0);
        cnt[idx]++;
      }

      for(int i=0; i<8; i++) sb.append(cnt[i]).append(" ");
      sb.append("\n");
    }

    System.out.print(sb);
  }
}