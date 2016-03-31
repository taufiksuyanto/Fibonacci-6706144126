import java.util.Scanner;
public class Jurnal1 {
    public static void main(String[]args){
        int a = 3, b = 2, hasil = 1, c;
        Scanner scn = new Scanner(System.in);
        System.out.print ("Masukan Deret Fibonacci  : ");
        c = scn.nextInt ();
        for(int i=1; i<=c; i++){           
            a = b;
            b = hasil;
            System.out.print(hasil+" ");
            hasil = a+b;
        }
    } 
}
#Ini udah di edit ka
