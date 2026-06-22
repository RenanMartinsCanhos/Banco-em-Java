package contaBancaria;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContaBancariaRepositoryImpl implements ContaBancariaRepository {
    @Override
    public void save(ContaBancaria contaBancaria) {
        String sql = "INSERT INTO ContaBancaria (cpf, nome, saldo, conta) VALUES (?, ?, ?)";
        try() {


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
