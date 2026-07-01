package contabancaria;


import javax.swing.*;
import java.time.LocalDate;


public class ContaBancaria {

    private String cpf;
    private Double saldo;
    private String name;
    private LocalDate dataDeNascimento;

    public void validarCpf() {
        ContaBancaria conta = new ContaBancaria();
        String cpf = JOptionPane.showInputDialog("Write your cpf");
            if(cpf.length() <= 14){
                conta.setCpf(cpf);
            }System.out.println("cpf is invalid");
    }

    public void validarDataNascimento(){
        ContaBancaria conta = new ContaBancaria();
        LocalDate dataNascimento = LocalDate.ofYearDay(LocalDate.parse(JOptionPane.showInputDialog(null,"Digite sua data de nascimento")));
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
