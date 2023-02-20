package Exercice2;
import Database.App;

import java.sql.*;

public class Exercice2 {

    /*
     * @param id
     * @param lastName
     * @return the number of affected rows
     */

    public static int delete() {
        String SQL =  "DELETE from COMPANY where ID = 2";

        int affectedrows = 0;

        try {        App connection = new App();
            connection.connect();
            //effectuer les requetes
            Statement statement = connection.connect().createStatement();

            statement.executeUpdate(SQL);

            if (affectedrows == 0) {
                System.out.println("Aucune ligne modifiée!");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrows;
    }


}
