
import java.util.Scanner;

public class Lista08 {
    public static void main(String[] args) throws Exception {
          //Declaração das variáveis
         double salario;
         double horas;
         double ganho; 
        //Passo 1: Entrada de dados

       try (Scanner teclado = new Scanner(System.in)) {
        System.out.print("Horas mensais:");
        horas = teclado.nextDouble();
        System.out.print("Ganho por hora:"); 
        ganho = teclado.nextDouble();
     }
       //Passo 2: Calcular o Imc
         salario = horas * ganho;
       
       //Passo 3: Exibir a resposta para o usuario

        System.out.println(salario);
    }      
}
   