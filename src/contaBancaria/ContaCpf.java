package contaBancaria;

import static javax.swing.JOptionPane.showInputDialog;

public class ContaCpf {
    private String name = showInputDialog("Digite seu nome: ");
    private int cpf = Integer.parseInt(showInputDialog("Digite seu cpf:"));
    private Double saldo = Double.parseDouble(showInputDialog("Digite seu saldo"));

    public void Transfer(ContaCpf pagador, ContaCpf recebedor) {
        Double transferValue = Double.parseDouble(showInputDialog("Digite o valor que deseja transferir: "));
        if(pagador.saldo >= transferValue && pagador.cpf != recebedor.cpf) {
            recebedor.saldo = recebedor.saldo + transferValue;
            pagador.saldo = pagador.saldo - transferValue;
            System.out.println("o saldo do pagador agora e de : " + pagador.saldo + " " +  "o saldo do recebedor agora e de: " + recebedor.saldo);
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void Sacar(ContaCpf contaCpf){
        Double saque = Double.parseDouble(showInputDialog("Digite o quanto deseja sacar: "));
        if(contaCpf.saldo >= saque){
            contaCpf.saldo = contaCpf.saldo - saque;
        }
    }

    public void pagar(ContaCpf pagador,ContaCpf recebedor){

    }


}
