package contabancaria;


import javax.swing.*;
import java.time.LocalDate;


public class ContaBancaria {

    private String cpf;
    private Double saldo;
    private String name;
    private LocalDate dataDeNascimento;

    ContaBancaria conta = new ContaBancaria();

    public void validarCpf() {
        String cpf = JOptionPane.showInputDialog("Write your cpf");
            if(cpf.length() <= 14){
                conta.setCpf(cpf);
            }else{
                JOptionPane.showMessageDialog(null,"cpf is invalid");
            }
    }

    public void validarDataNascimento(){
        LocalDate dataNascimento = LocalDate.parse(JOptionPane.showInputDialog("Digite sua data de nascimento"));
        int idade = LocalDate.now().getYear() - dataNascimento.getYear();
        if(idade >= 18){
            conta.setDataDeNascimento(dataNascimento);
        }else {
            JOptionPane.showMessageDialog(null, "Data de nascimento invalido");
        }
    }

    public void validarNome(){
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        if(nome.matches("^[A-Za-zÀ-ÖØ-öø-ÿ\\s]+$")){
            conta.setName(nome);
        }else{
            JOptionPane.showMessageDialog(null, "Nome invalido");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
