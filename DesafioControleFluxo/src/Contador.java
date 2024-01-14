import java.util.Scanner;

public class Contador 
{ 

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        System.out.println("Digite o primeiro numero:");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        int num2 = sc.nextInt();

        try {
			contar(num1, num2);
		
		}
        catch (ParametrosInvalidosException exception) 
        {
			System.out.println("O segundo deve ser maior que o primeiro");
		}
    }

    static void contar(int num1 , int num2) throws ParametrosInvalidosException
    {
        if (num2 <= num1) 
        {
            throw new ParametrosInvalidosException();
        }
        int contagem = num2 - num1;

        System.out.println("A subtração é " + contagem);
    }
}
