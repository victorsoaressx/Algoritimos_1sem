
//ler 2 numeros e uma opção entre +, -, *, /, realizar a operação desejada se possivel, e exibir as respostas adequadas


import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        char operacao;
        System.out.println(" Digite o primeiro numero; ");
        num1 = scanner.nextDouble();
        System.out.println(" Digite o segundo numero: ");
        num2 = scanner.nextDouble();
        System.out.println("Escolha + - * /: ");
        scanner.nextLine(); 
        operacao = scanner.nextLine().charAt(0);

        if(operacao == '+'){
            resultado = num1 = num2;
            System.out.println(" Soma = " + resultado);
        }

        else if(operacao == '-'){
            resultado = num1 - num2;
            System.out.println(" Subtração = " + resultado);
        }

        else if(operacao == '*'){
            resultado = num1 * num2;
            System.out.println(" Multiplicação = " + resultado);
        }

        else if( operacao == '/'){
            if(num2 == 0){
             System.out.println(" Não existe divisão por 0 ");
            }
            else{
                resultado = num1 / num2;
                System.out.println("Divisão = " + resultado);
            }
        }

        else{
            System.out.println(" operação invalida! ");
        }
    }
    

}
