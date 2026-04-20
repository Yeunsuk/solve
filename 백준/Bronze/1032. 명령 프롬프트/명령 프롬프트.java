import java.io.*; //1032번(구현) 명령 프롬프트

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int File_Num = Integer.parseInt(br.readLine());
    String Name = br.readLine();
      
    for(int i = 0; i < File_Num-1; i++) {
      String Name1 = br.readLine();
      for(int j = 0; j < Name.length(); j++) {
        if(Name.charAt(j) != Name1.charAt(j)) {
          Name = Name.substring(0, j) + '?' + Name.substring(j + 1, Name.length());
        }
      }
    }
    br.close();
    System.out.println(Name);
  }
}