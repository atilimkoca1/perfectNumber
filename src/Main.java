import java.util.Scanner;

/**
 * mukemmel
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum=0 ;

        System.out.print("sayı giriniz: ");
        n= input.nextInt();

        for(int i=n-1 ; i>=1 ; i--){

            if(n%i==0){
                sum+=i;
            }

        }

        if(sum==n){

            System.out.println("Sayı mükemmel sayıdır.");
        }else{
            System.out.println("Sayı mükemmel degildir.");

        }



    }
}