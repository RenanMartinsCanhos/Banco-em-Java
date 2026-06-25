package com.example.java.pendencias;

import javax.swing.*;
import java.time.LocalDate;


public class PendenciaPagamento {
    private String descricao;
    private Double valor;
    private Double juros;
    private LocalDate dataVencimento;
    private int id;

    public void gerarPendencia() {
        PendenciaPagamento pagador = new PendenciaPagamento();
        pagador.setDescricao(JOptionPane.showInputDialog("Digite o descricao da Pendencia"));
        pagador.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Pendencia")));
        pagador.setJuros(Double.parseDouble(JOptionPane.showInputDialog("Digite o juro da Pendencia")));
        pagador.setDataVencimento(LocalDate.parse(JOptionPane.showInputDialog("Digite o data da Pendencia")));
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
