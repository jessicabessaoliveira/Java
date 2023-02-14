public class TiposPrimitivos {
    public static void main(String[] args){
        // Armazenam números inteiros
        byte b = 100;       // 1 byte
        short s = 5000;      // 2 bytes
        int i = 100000;     // 4 bytes
        long l = 15000000000L;       // 8 bytes
        // Armazenam números fracionários
        float fl = 5.75f;     // 4 bytes
        /*
         * Um número de ponto flutuante também pode
         * ser um número científico com um "e" para
         * indicar a potência de 10 
         */
        float fl1 = 35e3f;   // 4 bytes
        double d = 19.99d;  // 8 bytes
        // Armazena valores verdadeiros ou falsos
        boolean boo = true;  // 1 bit (1 byte)
        // Armazena um único caractere/letra ou valores ASCII
        char a = 'A';       // 2 bytes
        /*
         * Como alternativa, se você estiver familiarizado com valores ASCII,
         * poderá usá-los para exibir determinados caracteres
        */
        char a1 = 65;

        System.out.println("Byte " + b);
        System.out.println("Short " + s);
        System.out.println("Int " + i);
        System.out.println("Long " + l);
        System.out.println("Float " + fl);
        System.out.println("Float com potencia de 10 (e) " + fl1);
        System.out.println("Double " + d);
        System.out.println("Boolean " + boo);
        System.out.println("Char " + a);
        System.out.println("Char " + a1);
    }
}
