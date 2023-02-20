package Exercice1;
import Database.App;

import java.sql.*;

public class Exercice1 {

     /*
     * @param id
     * @param lastName
     * @return the number of affected rows
     */

    public static int updateSalary() {
        String SQL =  "UPDATE COMPANY set salary = 25000.00 where id=1";

        int affectedrow = 0;

        try {        App connection = new App();
            connection.connect();
            //effectuer les requetes
            Statement statement = connection.connect().createStatement();

            statement.executeUpdate(SQL);

            if (affectedrow == 0) {
                System.out.println("Aucune ligne modifiée!");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return affectedrow;
    }


}
