import contabancaria.ContaBancaria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;
import java.time.LocalDate;


class RegisterAccountTest {

    @Test
    void validarCpfDaConta() {
        ContaBancaria conta = new ContaBancaria();
        String cpf = "54491805865";

        if (cpf.length() <= 14) {
            conta.setCpf(cpf);
        }
        System.out.println("cpf is invalid");

        Assertions.assertEquals("54491805865", conta.getCpf());
    }

    @Test
    void validarDataNascimentoDaConta() {
        ContaBancaria conta = new ContaBancaria();
        LocalDate dataNascimento = LocalDate.of(2007, 03, 31);
        int idade = LocalDate.now().getYear() - dataNascimento.getYear();

        if (idade >= 18) {
            conta.setDataDeNascimento(dataNascimento);
        } else {
            System.out.println("data de nascimento is invalid");
        }

        Assertions.assertEquals(dataNascimento, conta.getDataDeNascimento());
    }
}




