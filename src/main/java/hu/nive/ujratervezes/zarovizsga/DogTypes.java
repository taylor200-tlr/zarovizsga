package hu.nive.ujratervezes.zarovizsga;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DogTypes {

    private DataSource dataSource;

    public DogTypes(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getDogsByCountry(String country) {

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("select name from dogs_types where country = ? order by name");
        ) {
                stmt.setString(1, country);
                List<String> dogNames = new ArrayList<>();
//                try(
                        ResultSet resultSet = stmt.executeQuery();
//                        ){
                    while (resultSet.next()){
                        dogNames.add(resultSet.getString("name").toLowerCase());
                    }

 //               }
            return dogNames;

        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot select table", se);
        }
    }
}
