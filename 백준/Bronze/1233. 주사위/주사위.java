import java.io.*; //1233(구현) 주사위

public class Main {
  public static void main(String[] args) throws Exception {
    int s1=read(), s2=read(), s3=read(), rlt=0, max=0;
    int[] arr = new int[s1+s2+s3+1];

    for(int i=1; i<=s1; i++) 
      for(int j=1; j<=s2; j++) 
        for(int k=1; k<=s3; k++) 
          arr[i+j+k]++;

    for(int i=0; i<arr.length; i++) {
      if(max<arr[i]) {
        max=arr[i];
        rlt=i;
      }
    }
    
    System.out.print(rlt);
  }

  static int read() throws Exception {
    int c, n = 0;
    while((c = System.in.read()) <= 32);
    n = c & 15;
    while((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);
    return n;
  }
}