import java.io.*; //6778(구현) Which Alien?

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    if(a >= 3 && b <= 4) sb.append("TroyMartian\n");
    if(a <= 6 && b >= 2) sb.append("VladSaturnian\n");
    if(a <= 2 && b <= 3) sb.append("GraemeMercurian\n");
    System.out.print(sb);
  }
}