import java.io.*; //6841(구현) I Speak TXTMSG

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while (true) {
      String s = br.readLine();

      switch (s) {
        case "TTYL":
          sb.append("talk to you later\n");
          System.out.print(sb);
          return;
        case "CU": sb.append("see you\n"); break;
        case ":-)": sb.append("I’m happy\n"); break;
        case ":-(": sb.append("I’m unhappy\n"); break;
        case ";-)": sb.append("wink\n"); break;
        case ":-P": sb.append("stick out my tongue\n"); break;
        case "(~.~)": sb.append("sleepy\n"); break;
        case "TA": sb.append("totally awesome\n"); break;
        case "CCC": sb.append("Canadian Computing Competition\n"); break;
        case "CUZ": sb.append("because\n"); break;
        case "TY": sb.append("thank-you\n"); break;
        case "YW": sb.append("you’re welcome\n"); break;
        default: sb.append(s).append('\n');
      }
    }
  }
}