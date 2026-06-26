package com.contaBancaria;

import lombok.Data;

@Data

public class ContaBancaria {

    private String cpf;

    public void ValidarCpf(String cpf) {
        cpf = "54491805865";
    }
}
