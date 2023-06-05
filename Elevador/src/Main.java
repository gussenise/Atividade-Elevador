import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Criando Elevadores
        Elevador atrio = new Elevador(24,"10",0);
        Elevador biblioteca = new Elevador(18, "20",0);
        Elevador saguao = new Elevador(10, "30",0);

        System.out.println("Em qual elevador você está? Escolha 1.Atrio 2.Biblioteca 3.Entrada");
        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();
        entrada.nextLine();

        if  (opcao == 1) {
            System.out.println("Elevador Atrio");
            atrio.verificarCapacidade();

        } else if (opcao == 2) {
            System.out.println("Elevador  Biblioteca");
            biblioteca.verificarCapacidade();

        } else if (opcao == 3) {
            System.out.println("Elevador Entrada");
            saguao.verificarCapacidade();

        } else {
            System.out.println("Opção inválida. Por favor, escolha um número correspondente a um elevador.");
            return;
        }
    }
}