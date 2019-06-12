package homework4;

import java.util.Scanner;

public class homework4 {

    public static void main(String[] args) {
        System.out.println("type in the prosentage");
        Scanner first = new Scanner(System.in);
        double g = first.nextInt();
        
        if (g>=90){
            System.out.println("A*");
        }
        else if (g>=80){
            System.out.println("A");
        }
        else if (g>=70){
            System.out.println("B");
        }
        else if (g>=60){
            System.out.println("C");
        }
        else if (g>=50){
            System.out.println("D");
        }
        else if (50>g){
            System.out.println("F");
        }

    }
} 