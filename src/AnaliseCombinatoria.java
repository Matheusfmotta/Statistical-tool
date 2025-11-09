import java.util.Scanner;

class AnaliseCombinatoria {
   public void permutacao(Scanner sc){

       long NumeroTotalElementos;
       long Resultado = 1;

       System.out.println("--- Calculadora de Permutação Simples ---");
       System.out.println("Use quando a ordem importa e TODOS os elementos são usados.");
       System.out.println("Digite o número total de elementos (n):");

       NumeroTotalElementos = sc.nextInt();
       for (long i = NumeroTotalElementos; i > 0 ; i--){
           Resultado = (Resultado * i); // i!
       }
       System.out.println("RESULTADO: O fatorial de "+ NumeroTotalElementos+ " é "+Resultado);
    }
    public void arranjo(Scanner sc){

        long NumeroTotalElementos;
        long NumeroDoGrupo = 1;
        long p;
        long Resultado =1;

        System.out.println("--- Calculadora de Arranjo Simples ---");
        System.out.println("Use quando a ordem importa, mas você escolhe APENAS ALGUNS elementos.");

        System.out.println("Digite o número total de elementos disponíveis (n):");
        NumeroTotalElementos = sc.nextLong();

        do {
            System.out.println("Digite o tamanho do grupo (p):");
            NumeroDoGrupo = sc.nextLong();
            if(NumeroDoGrupo > NumeroTotalElementos){
                System.out.println("ERRO: O grupo 'p' (" + NumeroDoGrupo + ") não pode ser maior que o total 'n' " +
                        "(" + NumeroTotalElementos + "). Tente novamente:");
            }else{}
        }while(NumeroDoGrupo > NumeroTotalElementos);

        p = (NumeroTotalElementos - NumeroDoGrupo); //p = (n - p)

        for (long i = NumeroTotalElementos; i > p ; i--){
            Resultado = (Resultado * i);
        }
        System.out.println("RESULTADO: O Arranjo de " + NumeroTotalElementos + " elementos, tomados " +
                "" + NumeroDoGrupo + " a " + NumeroDoGrupo + ", é: " + Resultado);
    }
}
