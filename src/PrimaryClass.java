import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
public class PrimaryClass {
    public static void main(String[] args)throws IOException {
        Scanner Sc = new Scanner(System.in);
        float weightKhulekani;
        float heightKhulekani;
        float resultBMI;
        // BMI weight / height * height
        System.out.println("This program is meant to calculate your BMI");
        System.out.printf("Please enter your height in cm: ");
        heightKhulekani = Sc.nextFloat();
        System.out.printf("Please enter your weight in Kg: ");
        weightKhulekani = Sc.nextFloat();

        resultBMI = (weightKhulekani / (float)Math.pow(heightKhulekani,2))*10000;
        System.out.println("Your score is: "+ resultBMI);
        if(resultBMI <= 16){
            System.out.println("Your are in the (starvation) category");
        }else if (resultBMI > 16f && resultBMI  <=16.99f) {
            System.out.println("You are in the (emaciation) category");
        }else if (resultBMI  > 16.99f && resultBMI <= 18.49f ) {
            System.out.println("You are in the (underweight) category");
        }else if (resultBMI >18.49f && resultBMI <=22.99f){
            System.out.println("You are in the (normal, low range) category");
        }else if(resultBMI > 22.99f && resultBMI <= 24.99f){
            System.out.println("You are in the (normal, high range) category");
        }else if (resultBMI > 24.99f && resultBMI<= 27.49f ){
            System.out.println("You are in the (overweight, low range) category");
        }else if (resultBMI > 27.49f && resultBMI <= 29.99f){
            System.out.println("Your are in the (overweight, high range) category");
        }if (resultBMI >29.99f && resultBMI <= 34.99f){
            System.out.println("You are in the (1st degree obesity) category");
        }if (resultBMI >34.99f && resultBMI <= 39.99f){
            System.out.println("You are in the (2nd degree obesity) category");
        }if(resultBMI >=40){
            System.out.println("You are in the (3rd degree obesity) category");
        }


    }
}
