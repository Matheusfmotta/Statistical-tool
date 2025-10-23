import java.util.Scanner;
class StatisticalTool {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       TeoremaDaProbabilidadeTotal Calculo = new TeoremaDaProbabilidadeTotal();
       int EscolhaCalculo = 0;
           do {
               System.out.println("Escolha uma das opções:");
               System.out.println("(1)SAIR");
               System.out.println("(2)USAR TEOREMA DA PROBABILIDADE TOTAL");

               EscolhaCalculo = sc.nextInt();
               switch (EscolhaCalculo){
                   case 1:
                       System.out.println("SAINDO DO PROGRAMA...");
                   break;

                   case 2:
                       Calculo.ProbabilidadeTotal();
                   break;

                   default:
                       System.out.println("Você não digitou um valor válido");
                   break;
               }
           }while (EscolhaCalculo > 1);
           sc.close();
   }
}

