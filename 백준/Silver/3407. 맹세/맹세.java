import java.util.*; //3407(문자열) 맹세
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    Set<String> set = new HashSet<>(Arrays.asList(
        "h", "he", "li", "be", "b", "c", "n", "o", "f", 
        "ne", "na", "mg", "al", "si", "p", "s", "cl", "ar",
        "k", "ca", "sc", "ti", "v", "cr", "mn", "fe", "co", 
        "ni", "cu", "zn", "ga", "ge", "as", "se", "br", "kr",
        "rb", "sr", "y", "zr", "nb", "mo", "tc", "ru", "rh", 
        "pd", "ag", "cd", "in", "sn", "sb", "te", "i", "xe",
        "cs", "ba", "hf", "ta", "w", "re", "os", "ir", "pt", 
        "au", "hg", "tl", "pb", "bi", "po", "at", "rn",
        "fr", "ra", "rf", "db", "sg", "bh", "hs", "mt", "ds", 
        "rg", "cn", "fl", "lv", "la", "ce", "pr", "nd",	
        "pm", "sm", "eu", "gd", "tb", "dy", "ho", "er", "tm", 
        "yb", "lu", "ac", "th", "pa", "u", "np", "pu", "am", 
        "cm", "bk", "cf", "es", "fm", "md", "no", "lr"
    ));
    
    int Test = Integer.parseInt(br.readLine());
    while(Test-- > 0) {
      String str = br.readLine();
      int len = str.length();
      
      boolean[] dp = new boolean[len + 1];
      dp[0] = true;
      
      for(int i = 0; i < len; i++) {
        if(!dp[i]) continue;
        if(set.contains(str.substring(i, i + 1))) dp[i + 1] = true;
        if(i + 1 < len && set.contains(str.substring(i, i + 2))) dp[i + 2] = true;
      }
      
      sb.append(dp[len] ? "YES\n" : "NO\n");
    }
    
    bw.write(sb.toString());
    bw.close();
  }
}