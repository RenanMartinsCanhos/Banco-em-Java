package contabancaria;


import lombok.Data;

import javax.swing.*;
import java.time.LocalDate;


@Data
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
            }else{
                JOptionPane.showMessageDialog(null,"cpf is invalid");
            }
    }

    public void validarDataNascimento(){
        ContaBancaria conta = new ContaBancaria();
        LocalDate dataNascimento = LocalDate.parse(JOptionPane.showInputDialog("Digite sua data de nascimento"));
        int idade = LocalDate.now().getYear() - dataNascimento.getYear();
        if(idade >= 18){
            conta.setDataDeNascimento(dataNascimento);
        }else {
            JOptionPane.showMessageDialog(null, "Data de nascimento invalido");
        }
    }


}
