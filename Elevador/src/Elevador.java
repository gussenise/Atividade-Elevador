import java.util.Scanner;

public class Elevador {
    private int capacidadeMax;
    private int andarAtual;
    private int andarEscolhido;
    private int pessoasPresentes;


    public Elevador(int capacidade, String velocidade, int andarAtual) {
        this.capacidadeMax = capacidade;
        this.andarAtual = andarAtual;
    }

    public void andarEscolhido(){
        System.out.println("Para qual andar você deseja ir?");
        Scanner entrada = new Scanner(System.in);
        this.andarEscolhido = entrada.nextInt();
        if (this.andarEscolhido > this.andarAtual) {
            this.subir();
        } else {
            this.descer();
        }
    }

    public void subir(){
        System.out.println("Subindo...");
        for (int i = this.andarAtual + 1; i <= this.andarEscolhido; i++){
            System.out.println("Andar: " + i);
        }
        this.andarAtual = this.andarEscolhido;
        System.out.println("Seu andar chegou. Pode sair!");
    }

    public void descer(){
        System.out.println("Descendo...");
        for (int i = this.andarAtual - 1; i >= this.andarEscolhido; i--){
            System.out.println("Andar: " + i);
        }
        this.andarAtual = this.andarEscolhido;
        System.out.println("Seu andar chegou. Pode sair!");
    }

    public void imprimirDados(){
        System.out.println("Andar atual: " + this.andarAtual);
        System.out.println("Capacidade: " + this.capacidadeMax + " pessoas");
    }

    public void verificarCapacidade(){
        System.out.println("Quantas pessoas estão dentro do elevador?");
        Scanner entrada = new Scanner(System.in);
        this.pessoasPresentes = entrada.nextInt();
        if (this.capacidadeMax > this.pessoasPresentes){
            System.out.println("Capacidade permitida ainda não atingida. Pode entrar!");
            imprimirDados();
            andarEscolhido();
        } else {
            System.out.println("Atingiu a capacidade permitida. Espere outro elevador!");
        }
    }


}