import contabancaria.ContaBancaria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



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



    }

