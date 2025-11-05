import java.util.Scanner;
import java.util.Locale;

public class TeoremaDaProbabilidadeTotal{

    public void probabilidadeTotal(Scanner sc){

        int tamanho, i;
        float SomaDosValoresDoEsp, calculo1,calculo2,resultadoProbabilidadeTotal;

        SomaDosValoresDoEsp = 0.0f;
        calculo1 = 0.0f;
        calculo2 = 0.0f;

        System.out.println("--- Calculadora do Teorema da Probabilidade Total ---");
        System.out.println("Este programa irá calcular a probabilidade total de um evento ocorrer em um espaço amostral.");
        System.out.println("Digite a quantidade de repartições do seu espaço amostral:");
        tamanho = sc.nextInt();
        sc.nextLine();

        float[] vetEspacoParticionado = new float[tamanho];
    for (i = 0; i < tamanho; i++){
        System.out.println("Digite o tamanho de cada partição:");
        vetEspacoParticionado[i] = sc.nextFloat();
        SomaDosValoresDoEsp = SomaDosValoresDoEsp + vetEspacoParticionado[i]; //Acumular e guardar valores
    }
    if (SomaDosValoresDoEsp != 100){
        System.out.println("\n[ERRO] A soma dos valores das partições do seu espaço amostral é ("+ SomaDosValoresDoEsp+"%) e" +
                    " não resulta em 100%. Sendo assim não é possível utilizar o teorema da probabilidade total.");
    }else{
        float[] vetProbabilidadeCondicional = new float[tamanho]; // P(B|A1)
        System.out.println("Para cada partição, digite a probabilidade do evento de interesse (B) ocorrer.");
            for (i = 0; i < tamanho; i++) {
                System.out.println("Qual a probabilidade do evento (B) ocorrer dado que pertence ao espaço A" +
                        +(i +1) + " de ("+vetEspacoParticionado[i]+"%) ?");
                            vetProbabilidadeCondicional[i] = sc.nextFloat();
            }
        float[] conta = new float[tamanho];
    for(i = 0; i < tamanho; i++){
        calculo1 = (vetProbabilidadeCondicional[i]/100.f * vetEspacoParticionado[i]/100.f);
        calculo2 = calculo2 + calculo1;
    }
    resultadoProbabilidadeTotal = (calculo2 * 100.f);
        System.out.printf(Locale.getDefault(),"\nRESULTADO: A probabilidade total do evento de interesse ocorrer" +
                " é de: %.1f%%\n", resultadoProbabilidadeTotal);
        }
    }
}