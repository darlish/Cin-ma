import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    // Les détails de connexion à la base de données
    private static final String URL = "jdbc:mysql://localhost:3306/BDD-Cinéma";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private Connection connection;

    // Méthode pour établir la connexion à BDD-Cinéma
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Méthode pour fermer la connexion à BDD-Cinéma
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void connect() throws SQLException {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
        if (connection != null) {
            System.out.println("Connexion à la base de données établie !");
        } else {
            System.err.println("La connexion à la base de données a échoué.");
        }
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connexion à la base de données fermée.");
            } catch (SQLException e) {
                System.err.println("Erreur lors de la fermeture de la connexion : " + e.getMessage());
            }
        }
    }

    public void executeQuery(String query) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(query);
            System.out.println("Requête exécutée avec succès.");
        } catch (SQLException e) {
            System.err.println("Erreur lors de l'exécution de la requête : " + e.getMessage());
        }
    }

    public void executeUpdate(String query) {
        try {
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(query);
            System.out.println("Nombre de lignes affectées : " + rowsAffected);
        } catch (SQLException e) {
            System.err.println("Erreur lors de l'exécution de la mise à jour : " + e.getMessage());
        }
    }
}
