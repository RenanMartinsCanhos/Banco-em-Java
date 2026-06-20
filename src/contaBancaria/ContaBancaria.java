package contaBancaria;

import javax.swing.*;

import java.util.Random;

import static javax.swing.JOptionPane.showInputDialog;

public class ContaBancaria {
    private Long cpf;
    private String nome;
    private Double saldo;
    private Long conta;

    public void criarContaBancaria() {
        ContaBancaria novaConta = new ContaBancaria();
        Random generator = new Random();
        novaConta.setCpf(Long.parseLong(JOptionPane.showInputDialog("Digite seu cpf")));
        novaConta.setNome(JOptionPane.showInputDialog("Digite seu nome"));
        novaConta.setConta(generator.nextLong());
    }






    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Long getConta() {
        return conta;
    }

    public void setConta(Long conta) {
        this.conta = conta;
    }
}