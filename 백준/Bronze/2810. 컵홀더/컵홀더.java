import java.io.*;//2810(그리디) 컵홀더

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int cnt = str.split("LL", -1).length - 1;
        System.out.print(cnt <= 1 ? num : num - cnt + 1);
    }
}