package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//conexão com o banco
public class Conexao {

    public static Connection getConnection(){
        try{
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/nomedobanco",
                    "postgres", "1234");
            return connection;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

}
