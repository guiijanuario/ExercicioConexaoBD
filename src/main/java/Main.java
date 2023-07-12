import connection.Conexao;
import model.Menu;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    //Essa classe vai ser responsável pela execução da aplicação
    public static void main(String[] args) {
        try {
            Connection connection = Conexao.getConnection();
            if (connection != null) {
                Statement statement = connection.createStatement();
                Menu menu = new Menu(statement);
                menu.executar();
            } else {
                System.out.println("Houve um problema com a conexão");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
