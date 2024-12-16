// 1- Pacote

package intro;

// 2- Referencia as bibliotecas

// 3- Classe
public class Medidas {

    //3.1- Atributos - características

    //3.2 - Métodos e funções

    public static void main(String[] args){
        // switch - Selecionar o comportamento do programa conforme a escolha da pessoa ou software

        String opcao = "default";

        switch (opcao){
            case "ifSimples":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "normal":
                System.out.println("Você escolheu executar o método normal");
                calcAreaModoExtenso();
                break;
            case "compacto":
                System.out.println("Você escolheu o método compacto");
                calcAreaModoCompacto();
            default:
                System.out.println("Nenhuma das opções");
                break;
        }
    }

    public static void  ifSimples(){
        // Condicional - Verificar uma condição, fazer uma pergunta p/ pessoa, hardware ou software
        // if = se, else = senão

        String modo = "curto";

        if(modo == "curto"){
            calcAreaModoCompacto();
        }
        else {
            calcAreaModoExtenso();
        }
    }

    // Código normal
    public static void calcAreaModoExtenso(){

        //Cálculo de área
        System.out.println("Cálculo de área - MODO NORMAL");
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
    public static void calcAreaModoCompacto(){

        //Cálculo de área
        System.out.println("Cálculo de área - MODO COMPACTO");
        int largura = 10;
        int comprimento = 10;

        System.out.println("A largura é de " + largura + " m" + " e o comprimento é de " + comprimento
                + " m" + " Logo, a área é de " + largura * comprimento + " m²");
    }
}