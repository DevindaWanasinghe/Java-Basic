import java.sql.*;

public class JDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "";
        //String query = "SELECT * FROM users";
        //String query1 =  " INSERT INTO users VALUES ('Gayan', 24)";
        //String query2 = " DELETE FROM users WHERE age=24";
        //String query3 = " UPDATE users SET age=25 WHERE name='saman'";
        //String query4 = "CREATE TABLE subjects (code VARCHAR(20), name VARCHAR(20))";
        String query5 = " DROP TABLE subjects";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            //ResultSet result = statement.executeQuery(query); Print database values
            //statement.executeUpdate(query1); //Insert data into database.
            //statement.executeUpdate(query2);  // Delete data in database
            //statement.executeUpdate(query3); //Update database.
            //statement.executeUpdate(query4); //Create Table
            statement.executeUpdate(query5);  // delete table

            /* Print database values
            String name;
            int age;
            while (result.next()) {
                name = result.getString(1);
                age = result.getInt(2);
                System.out.println(name + " " + age);
            }
             */

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
