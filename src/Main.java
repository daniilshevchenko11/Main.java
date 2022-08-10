import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        example1();
        example2();
    }

    private static void example1(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x");
        double x = input.nextDouble();
        System.out.print("Enter y");
        double y = input.nextDouble();
        double z = Math.pow(x,y);
        System.out.println("z="+z);
    }
    private static void example2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x>=0");
        double x = input.nextDouble();
        if (x>=0) {
            double z = Math.sqrt(x);
            System.out.println("z=" + z);
        }
        else {
            System.out.println("You must have entered x>=0");
        }

    }



}