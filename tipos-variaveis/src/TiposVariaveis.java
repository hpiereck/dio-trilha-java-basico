public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        String meuNome = "Henrique";
        
        double salarioMinimo = 2500.00;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // esse cast torna um numero de precisao maior em um de precisão menor

        int numero = 1;

        numero = 2;

        final double PI = 3.14;

//       PI = 10.75; //final não pode ser alterado pois é uma constante

        
    }
}
