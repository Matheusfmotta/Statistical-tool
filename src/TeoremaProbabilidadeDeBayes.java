import java.util.Scanner;
import java.util.Locale;
public class TeoremaProbabilidadeDeBayes{
    public void teoremaDeBayes(){
        TeoremaDaProbabilidadeTotal Calculo2 = new TeoremaDaProbabilidadeTotal();
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        float ProbabilidadeBDadoA, ProbabilidadeA, ValorProbabilidadeTotal = 0.0f, calculo1 ,Resultado = 0.0f;
        int SabeValorDaProbTotal = 0;

        System.out.println("--- Calculadora do Teorema da Bayes ---");
        System.out.println("Este programa irá calcular a probabilidade de um evento (A1) ser verdadeiro," +
                " dado que um evento (B) ocorreu. ");

        System.out.println("Qual a probabilidade do evento (B) dado que o evento (A1) ocorreu?");
        ProbabilidadeBDadoA = sc.nextFloat();
        sc.nextLine();
        System.out.println("Qual a probabilidade de (A1)?");
        ProbabilidadeA = sc.nextFloat();
        do {
            System.out.println("Escolha uma das duas opções abaixo:");
            System.out.println("(1) Calcular probabilidade total");
            System.out.println("(2) Já sei o valor da probabilidade total");
            SabeValorDaProbTotal = sc.nextInt();
            if (SabeValorDaProbTotal == 1) {
                Calculo2.probabilidadeTotal();
                System.out.println("Digite o resultado encontrado da probabilidade total:");
                ValorProbabilidadeTotal = sc.nextFloat();
            }
            else if (SabeValorDaProbTotal == 2) {
                System.out.println("Digite o valor da probabilidade total abaixo:");
                ValorProbabilidadeTotal = sc.nextFloat();
            } else System.out.println("---Digite um valor válido---");
        }while (SabeValorDaProbTotal < 1 || SabeValorDaProbTotal > 2 || ValorProbabilidadeTotal == 0);

            calculo1 = (ProbabilidadeA * ProbabilidadeBDadoA);
            Resultado = (calculo1/ValorProbabilidadeTotal);
            double resultadoPercentual = Resultado * 100;

            System.out.printf(Locale.getDefault(), "\nRESULTADO: A probabilidade do evento (A1) dado que " +
                    "o evento (B) ocorreu é de: %.1f%%\n", resultadoPercentual);
            sc.close();
    }
}
