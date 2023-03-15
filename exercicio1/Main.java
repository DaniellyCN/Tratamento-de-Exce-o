package exercicio1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        int a, b;
        double r;
        boolean verify;
        Scanner entrada = new Scanner(System.in);
        do{
            try{
                verify = false;
                System.out.println("Vamos dividir?");
                System.out.print("Informe o primeiro número: ");
                a = entrada.nextInt();
                System.out.print("Informe o segundo número: ");
                b = entrada.nextInt();
                r = (a/b);
                System.out.print("Resultado da divisão: " + r);
            }catch(ArithmeticException e ){
                System.out.println("Não é possível realizar uma divisão por 0.");
                verify = true;
            }catch(InputMismatchException e){
                System.out.println("O valor informado deve ser numérico.");
                verify = true;
            }finally{
                entrada.nextLine();
            }
        }while(verify);
       
        
    }
}