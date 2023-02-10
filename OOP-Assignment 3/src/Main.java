import java.util.Scanner;
import java.sql.*;
import java.sql.DriverManager;

public class Main {

    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "nurdos2005";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            List.getList();
            int command = scanner.nextInt();
            if (command == 0) {
                TableList.getTableList();

            } else if (command == 1) {
                IDs.getIDs();
            } else if (command == 2) {
                Clothes.getClothes();
            } else if (command == 3) {
                Color.getColors();
            } else if (command == 4) {
                Size.getSize();
            } else if (command == 5) {
                Type.getType();
            } else {
                System.err.println("Wrong input, ur blind");
            }
            /* else if (command == 6) {
                System.out.println("Type in Clothes_And_Misc / Color / Size / Type_Of_Clothes section you need");
                String lineScanner1 = scanner.nextLine();
                System.out.println("Then type in what you need (ex:Turtleneck)");
                String lineScanner2 = scanner.nextLine();
                Statement statement = connection.createStatement();
                String SQL_SELECT_TASKS = "select * from Aisle where ";
                ResultSet result = statement.executeQuery(SQL_SELECT_TASKS);
                while (result.next()) {
                    System.out.println("test" + ("\n"));
                } */
        }
    }
}