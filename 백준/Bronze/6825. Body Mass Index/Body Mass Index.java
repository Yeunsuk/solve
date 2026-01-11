import java.io.*; //6825(구현) Body Mass Index

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    double w = Double.parseDouble(br.readLine());
    double h = Double.parseDouble(br.readLine());
    double bmi = w / (h*h);

    if(bmi > 25) System.out.print("Overweight");
    else if(18.5 <= bmi && bmi <= 25) System.out.print("Normal weight");
    else System.out.print("Underweight");
  }
}