package PendenciasPagar;

import javax.swing.*;
import java.time.LocalDate;

public class PendenciaPagamento {
    private String descricao;
    private Double valor;
    private Double juros;
    private LocalDate dataVencimento;
    private int id;

    public void gerarPendencia(){
        descricao = JOptionPane.showInputDialog("Digite o descricao da Pendencia");
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Pendencia"));
        juros =  Double.parseDouble(JOptionPane.showInputDialog("Digite o juro da Pendencia"));
        dataVencimento = LocalDate.parse(JOptionPane.showInputDialog("Digite o data da Pendencia"));
    }
}
