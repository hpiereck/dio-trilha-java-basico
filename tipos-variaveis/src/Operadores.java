public class Operadores {

    public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao);


        int a, b;

        a = 5;
        b = 6;

        // usando if else
        String resultado = "";
        if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";   

        System.out.println(resultado);

        // usando operador ternário
        resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        String nomeUm = "Henrique";
        String nomeDois = new String("Henrique");

        System.out.println(nomeUm == nomeDois); // compara se são o mesmo objeto na memória
        System.out.println(nomeUm.equals(nomeDois)); // compara o conteúdo dos objetos
    }
    
}
