import java.util.*; //1213(구현) 팰린드롬 만들기
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    List<Integer> arr = new ArrayList<>();
    String st = br.readLine();
    br.close();

    char[] ch_str = st.toCharArray();
    char[] result = new char[ch_str.length];
    int cnt = 0, odd = 0, odd_num = 0;
    int len = ch_str.length;
    Arrays.sort(ch_str);
    char n = ch_str[0];
    
    for(int i = 0; i < len; i++) { //문자 종류 카운트
      if(ch_str[i] == n) cnt++;
      else {
        n = ch_str[i];
        arr.add(cnt);
        cnt = 1;
      }
    }

    arr.add(cnt);
    arr.toArray(new Integer[0]);
    cnt = 0;
    
    for(int i = 0; i < arr.size(); i++) { //종류 짝수 확인
      if(arr.get(i) % 2 != 0) {
        odd = i;
        cnt++;
      }
    }

    if(cnt == 1) { //홀수인 인덱스 찾기
      for(int i = 0; i < odd; i++) {
        odd_num += arr.get(i);
      }
    }
    
    String str = new String(ch_str);
    if(len % 2 == 0) { //문자열 길이가 짝수일때
      if(cnt != 0) System.out.print("I'm Sorry Hansoo");
      else { //문자 종류가 짝수개
        for(int i = 0; i < len; i++) {
          if(i % 2 == 0){
            result[i / 2] = str.charAt(i);
          } else {
            result[len - i / 2 - 1] = str.charAt(i);
          }
        }
        System.out.print(result);
      }
      
    } else { //문자열 길이가 홀수일때
      if(cnt != 1) System.out.print("I'm Sorry Hansoo");
      else { //문자 종류가 홀수개
        result[len / 2] = str.charAt(odd_num);
        str = str.substring(0, odd_num) + str.substring(odd_num + 1);
        for(int i = 0; i < len - 1; i++) {
          if(i % 2 == 0){
            result[i / 2] = str.charAt(i);
          } else {
            result[len - i / 2 - 1] = str.charAt(i);
          }
        }
        System.out.print(result);
      }
    } 
  }
} 