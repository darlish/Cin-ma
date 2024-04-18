//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            // Obtenir une connexion à la base de données
            Connection connection = DatabaseConnection.getConnection();

            // Exemple d'exécution d'une requête SQL
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Films");
            ResultSet resultSet = statement.executeQuery();

            // Traiter les résultats de la requête
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Titre"));
            }

            // Fermer la connexion à la base de données
            DatabaseConnection.closeConnection(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}