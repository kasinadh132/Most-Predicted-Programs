package Alphabets;
import java.util.Scanner;
public class TriangleCharacter3 {
    public static void main(String args[]){
try (Scanner scan = new Scanner(System.in)) {
    System.out.println("Enter the number of rows");
    int rows=scan.nextInt();
    int i,j;
    i=1;
    while(i<=rows){
        j=1;
        while(j<=i){
            System.out.print((char)(j+64));
            j++;
        }
        i++;
        System.out.println();
    }
}
}
}
