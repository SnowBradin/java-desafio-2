import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        //lendo os valores de entrada
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBenefícios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            //aliquota de 5%, salario de até 1100
            valorImposto = 0.05F * valorSalario;
        }
        else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
            //aliquota de 10%, salario de 1100 até 2500
            valorImposto = 0.10F * valorSalario;
        }
        else if (valorSalario > 2500) {
            //poderia usar "else {"
            //aliquota de 15%, salario acima de 2500     
            valorImposto = 0.15F * valorSalario;
        }
        float saida = valorSalario - valorImposto + valorBenefícios;
        System.out.println("Valor Final " + String.format("%.2f", saida));
    }
}
