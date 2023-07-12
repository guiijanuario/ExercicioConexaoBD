package model;

import java.sql.SQLException;
import java.sql.Statement;

public class ModificarTabela {
    public void adicionarUsuario (Statement statement, String nome){
        nome = "('" + nome + "')";
        String sql = "insert into pessoas(nome) values"+nome;
        try {
            statement.executeUpdate(sql);
            System.out.println("Usuario adicionado com sucesso!");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void atualizarNomeUsuario (Statement statement, String nomeAntigo, String novoNome){
        nomeAntigo = "'"+nomeAntigo+"'";
        novoNome = "'"+novoNome+"'";
        String sql = "update pessoas set nome ="+novoNome+" where nome ="+nomeAntigo;
        try {
            statement.executeUpdate(sql);

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deletarUsuario (Statement statement, String nome){
        nome = "'"+nome+"'";
        String sql = "delete from pessoas where nome ="+nome;
        try {
            statement.executeUpdate(sql);
            System.out.println("Deletado!");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
