package com.example.java.contaBancaria;

import lombok.Data;

import javax.swing.*;

import java.util.Random;

import static javax.swing.JOptionPane.showInputDialog;

@Data
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
}