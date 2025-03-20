public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero++){
            if(numero == 3)
              //  break;  imprime o 1 e 2 e para no 3 para a execução
              continue; //não imprimi o 3 e mudou o fluxo e nao mudou o for
            
            System.out.println((numero));    
        }
    }
}
