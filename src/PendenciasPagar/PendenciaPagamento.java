package pendenciasPagar;

import contaBancaria.ContaCpf;

import javax.swing.*;
import java.time.LocalDate;

public class PendenciaPagamento {
    private String descricao;
    private Double valor;
    private Double juros;
    private LocalDate dataVencimento;
    private String devedor;
    private int id;

    public PendenciaPagamento gerarPendencia(ContaCpf recebedorDaPendencia,PendenciaPagamento pagador) {
        devedor = recebedorDaPendencia.getName();
        descricao = JOptionPane.showInputDialog("Digite o descricao da Pendencia");
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Pendencia"));
        juros =  Double.parseDouble(JOptionPane.showInputDialog("Digite o juro da Pendencia"));
        dataVencimento = LocalDate.parse(JOptionPane.showInputDialog("Digite o data da Pendencia"));

        pagador.setDescricao(descricao);
        pagador.setValor(valor);
        pagador.setJuros(juros);
        pagador.setDataVencimento(dataVencimento);
        pagador.setDevedor(devedor);
        return pagador;
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

    public String getDevedor() {
        return devedor;
    }

    public void setDevedor(String devedor) {
        this.devedor = devedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
