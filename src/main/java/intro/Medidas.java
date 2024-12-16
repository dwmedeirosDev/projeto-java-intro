// 1- Pacote
package intro;

// 2- Referencia as bibliotecas
// Import Scanner
import java.util.Scanner;

// 3- Classe
public class Medidas {
    // 3.1- Atributos - características

    // 3.2 - Métodos e funções

    public static void main(String[] args){
        // switch - Selecionar o comportamento do programa conforme a escolha da pessoa ou software

        // Utilizar a classe Scanner do Java para ler a escolha do usuário no console

        // Necessário instanciar - = new Scanner () / System.in - Entrada
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Menu de opções");
        System.out.println("1- Modo ifSimples");
        System.out.println("2- Modo normal");
        System.out.println("3- Qual compacto");
        System.out.println("4- Sair");
        System.out.println("Digite a opção desejada: ");
        String opcao = scanner.next();

        // String opcao = "default";
        switch (opcao){
            case "1":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "2":
                System.out.println("Você escolheu executar o método normal");
                calcAreaModoExtenso();
                break;
            case "3":
                System.out.println("Você escolheu o método compacto");
                calcAreaModoCompacto();
            case "Exit":
                System.out.println("Sair");
                break;
            default:
                System.out.println("Erro: Não escolheu nenhuma das opções");
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