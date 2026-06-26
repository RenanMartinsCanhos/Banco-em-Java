package com;

import com.contaBancaria.ContaBancaria;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class RegisterAccountTest {

    @Test
    void validarCpfDaConta() {
        ContaBancaria conta = new ContaBancaria();
        String cpf = "54491805865";

        if (cpf.length() <= 14) {
            conta.setCpf(cpf);
        }
        System.out.println("cpf is invalid");

        assertEquals("54491805865", conta.getCpf());
    }

    @Test
    //void validarSeDataDeNascimentoMaiorQue18(){
    ContaBancaria conta = new ContaBancaria();
    int dataDeNascimento = 2007 - 03 - 31;
    int idade = LocalDate.now().getYear() - dataDeNascimento;

        if(idade>=18){
            conta.setDataDeNascimento(dataDeNascimento);
        }
        System.out.println("data nascimento is invalid");

    assertEquals(2007-03-31,conta.getDataDeNascimento());
}



