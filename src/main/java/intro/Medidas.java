// 1- Pacote

package intro;

// 2- Referencia as bibliotecas

// 3- Classe

public class Medidas {

    //3.1- Atributos - características

    //3.2 - Métrodos e funções

    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("Cálculo de áreas");
    }

    // Código normal

    public void calcAreaModoExtenso(){

        //Cálculo de área

        int largura;
        int comprimento;
        int resultado;

        largura = 4; // largura recebe 4
        comprimento = 3; // comprimento recebe 3

        resultado = largura * comprimento;
        System.out.println("A largura é de " + largura + " m");
        System.out.println("O comprimento é de " + comprimento + " m");
        System.out.println("Logo, a área é de " + resultado + " m²");

    }

    // Código reduzido (Otimizado)

    public void calcAreaModoCompacto(){

        //Cálculo de área

        int largura = 10;
        int comprimento = 10;

        System.out.println("A largura é de " + largura + " m" + " e o comprimento é de " + comprimento
                + " m" + " Logo, a área é de " + largura * comprimento + " m²");
    }

}
