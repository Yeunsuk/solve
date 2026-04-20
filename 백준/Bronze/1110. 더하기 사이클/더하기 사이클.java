import java.io.*; //1110번 더하기 사이클

public class Main {

  public static int Macro(int num) {
    return (num % 10) * 10 + ((num / 10) + (num % 10)) % 10;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());
    int result = num;
    br.close();

    num = Macro(result);
    int count = 1;

    while(true) {
      if(num == result) {
        System.out.println(count);
        break;
      }else {
        num = Macro(num);
        count++;
      } 
    }
  }
}