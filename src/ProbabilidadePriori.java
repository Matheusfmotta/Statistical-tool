import java.util.Scanner;
import java.util.Locale;
public class ProbabilidadePriori {
    public void probabilidadePriori(Scanner sc){
        float CasosFavoraveis, CasosPossiveis;
        float Resultado;

        System.out.println("--- Calculadora da Probabilidade a Priori ---");
        System.out.println("Este programa irá calcular a probabilida de um evento (A) ocorrer quando já se sabe os " +
                "casos favoráveis e todo tamanho amostral que é representado pelos casos possíveis");
        System.out.println("Digite abaixo o número de casos favoraveis ao evento (A)");
        CasosFavoraveis = sc.nextInt();
        System.out.println("Agora digite o número de casos possíveis para o evento (A):");
        CasosPossiveis = sc.nextInt();

        Resultado =(CasosFavoraveis/CasosPossiveis) * 100;
        System.out.printf(Locale.getDefault(), "\nRESULTADO:  A probabilidade do evento (A) ocorrer " +
                " é de: %.1f%%\n", Resultado);
    }
}
