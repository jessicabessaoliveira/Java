public class ConversaoTipo {
    public static void main(String[] args) {

        /*
         * Widening Casting - Conversão automática do tipo menor para o tipo maior
         * A conversão é feita automaticamente ao passar um tipo de tamanho menor para um tipo de tamanho maior
         */
        int valorInteiro = 8;
        double valorDouble = valorInteiro;        
        System.out.println("Widening Casting"); 
        System.out.println(valorInteiro);      // Saída 8
        System.out.println(valorDouble);   // Saída 8.0

       
        /*
         * Narrowing Casting - Conversão manual do tipo maior para o tipo menor 
         * A conversão deve ser feita manualmente, colocando o tipo entre parênteses na frente do valor
         */
        double myDouble = 8.78d;
        int myInt = (int) myDouble; 
        System.out.println("Narrowing Casting");         
        System.out.println(myDouble);   // Saída 8.78
        System.out.println(myInt); // Saída 8
    }
}
