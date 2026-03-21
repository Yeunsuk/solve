import java.io.*; //1919 에너그램 만들기

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] arr1 = br.readLine().toCharArray();
    char[] arr2 = br.readLine().toCharArray();
    int[] rlt = new int[26];
    int sum = 0;
    
    for(char c : arr1) rlt[c-'a']++;
    for(char c : arr2) rlt[c-'a']--;
    for(int i : rlt) sum += Math.abs(i);
    System.out.print(sum);
  }
}