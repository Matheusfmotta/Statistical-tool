import java.util.Scanner;
class StatisticalTool {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       TeoremaDaProbabilidadeTotal Calculo2 = new TeoremaDaProbabilidadeTotal();
       TeoremaProbabilidadeDeBayes Calculo3 = new TeoremaProbabilidadeDeBayes();

       int EscolhaCalculo = 0;
           do {
               System.out.println("Escolha uma das opções:");
               System.out.println("(1)SAIR");
               System.out.println("(2)USAR TEOREMA DA PROBABILIDADE TOTAL");
               System.out.println("(3)USAR TEOREMA DE BAYES");

               EscolhaCalculo = sc.nextInt();
               switch (EscolhaCalculo){
                   case 1:
                       System.out.println("SAINDO DO PROGRAMA...");
                   break;

                   case 2:
                       Calculo2.probabilidadeTotal();
                   break;

                   case 3:
                       Calculo3.teoremaDeBayes();
                   break;

                   default:
                       System.out.println("Você não digitou um valor válido");
                   break;
                   }
               }while (EscolhaCalculo > 1); sc.close();
           }

   }


