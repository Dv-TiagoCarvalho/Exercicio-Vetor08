import java.util.Arrays;
import java.util.Scanner;

public class vetor08 {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);

        int[] vetor1 = new int[5];
        int [] vetor2 = new int[5];
        int [] vetor3 = new int[10];
        
            System.out.println("Digite 5 numeros");

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = scanner.nextInt();

            
                
        }

        System.out.println("Digite 5 numeros");

        for (int i = 0; i < vetor2.length; i++) {

            vetor2[i] = scanner.nextInt();   
            
         
        }

    for (int i = 0; i < vetor1.length; i++) {


       vetor3[i] = vetor1[i];   
    }

    for (int i = 0; i < vetor2.length; i++) {

        vetor3[vetor1.length+i] = vetor2[i];
        
    }

   System.out.println("Vetor 3: " + Arrays.toString(vetor3));
   scanner.close();

   
    }
}
