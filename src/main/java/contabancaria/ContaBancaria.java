package contabancaria;


import javax.swing.*;


public class ContaBancaria {

    private String cpf;
    private Double saldo;
    private String name;
    private int dataDeNascimento;

    public void validarCpf() {
        ContaBancaria conta = new ContaBancaria();
        String cpf = JOptionPane.showInputDialog("Write your cpf");
            if(cpf.length() <= 14){
                conta.setCpf(cpf);
            }System.out.println("cpf is invalid");
    }

    public void validarDataNascimento(){
        int dataNascimento = 2008-03-31;
    }

    public int getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(int dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
