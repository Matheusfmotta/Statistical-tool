import java.util.Scanner;
import java.util.Locale;
class StatisticalTool {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in).useLocale(Locale.US);
       TeoremaDaProbabilidadeTotal Calculo2 = new TeoremaDaProbabilidadeTotal();
       TeoremaProbabilidadeDeBayes Calculo3 = new TeoremaProbabilidadeDeBayes();
       ProbabilidadePriori Calculo4 = new ProbabilidadePriori();
       ProbabilidadePosteriori Calculo5 = new ProbabilidadePosteriori();
       AnaliseCombinatoria Calculo6 = new AnaliseCombinatoria();
       AnaliseCombinatoria Calculo7 = new AnaliseCombinatoria();

       int EscolhaCalculo = 0;
           do {
               System.out.println("Escolha uma das opções:");
               System.out.println("(1)SAIR");
               System.out.println("(2)USAR TEOREMA DA PROBABILIDADE TOTAL");
               System.out.println("(3)USAR TEOREMA DE BAYES");
               System.out.println("(4)USAR CALCULO DA PROBABILIDADE A PRIORI");
               System.out.println("(5)USAR CALCULO DA PROBABILIDADE POSTERIORI");
               System.out.println("(6)USAR CALCULO DE PERMUTAÇÃO");
               System.out.println("(7)USAR CALCULO DE ARRANJO");

               EscolhaCalculo = sc.nextInt();
               switch (EscolhaCalculo){
                   case 1:
                       System.out.println("SAINDO DO PROGRAMA...");
                   break;

                   case 2:
                       Calculo2.probabilidadeTotal(sc);
                   break;

                   case 3:
                       Calculo3.teoremaDeBayes(sc);
                   break;

                   case 4:
                       Calculo4.probabilidadePriori(sc);
                   break;

                   case 5:
                       Calculo5.probabilidadePosteriori(sc);
                   break;

                   case 6:
                       Calculo6.permutacao(sc);
                   break;

                   case 7:
                       Calculo7.arranjo(sc);
                   break;

                   default:
                       System.out.println("Você não digitou um valor válido");
                   break;
                   }
               }while (EscolhaCalculo > 1); sc.close();
           }

   }


