import Database.App;
import Exercice1.Exercice1;
import Exercice2.Exercice2;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        //Exercice1
        System.out.println("Affected rows for update: " + Exercice1.updateSalary());

        //Exercice2
        System.out.println("Affected rows for update: " + Exercice2.delete());
    }
}