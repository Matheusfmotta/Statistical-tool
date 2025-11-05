import java.util.Scanner;
import java.util.Locale;
public class ProbabilidadePosteriori {

    public void probabilidadePosteriori(Scanner sc){

        double OcorrenciaDoEvento, TotalDeTentativas;
        double Resultado;

        System.out.println("--- Calculadora da Probabilidade a Posteriori ---");
        System.out.println("Esse programa irá calcular a probabilidade de um evento ocorrer a partir da observação" +
                " do número de tentativas e do número de ocorrências dele");
        System.out.println("Digite o número de vezes que o evento ocorreu:");
        OcorrenciaDoEvento = sc.nextDouble();
        System.out.println("Digite o número total de tentativas do experimento:");
        TotalDeTentativas = sc.nextDouble();

        Resultado = (OcorrenciaDoEvento/TotalDeTentativas) * 100;

        System.out.printf(Locale.getDefault(), "\nRESULTADO:  A probabilidade do evento ocorrer " +
                " é de: %.1f%%\n", Resultado);
    }
}
