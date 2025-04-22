import java.io.*; //2743(구현) 단어 길이 재기

public class Main {
  public static void main(String[] args) throws IOException {
    int len = 0;

    while(true) {
      int ch = System.in.read();
      if(ch == '\n' || ch == -1) break;
      len++;
    }

    System.out.print(len);
  }
}