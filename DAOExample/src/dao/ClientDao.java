package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Client;
import utils.DbUtil;

public class ClientDao {

    private Connection connection;

    public ClientDao() {
        connection = DbUtil.getConnection();
    }

    public void addClient(Client client) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into test(name, adress, credit) values (?,?,?)");
            // Parameters start with 1
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getAdress());
            preparedStatement.setFloat(3, client.getCredit());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public void deleteClient(int userId) {
//        try {
//            PreparedStatement preparedStatement = connection
//                    .prepareStatement("delete from users where userid=?");
//            // Parameters start with 1
//            preparedStatement.setInt(1, userId);
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

//    public void updateClient(Client client) {
//        try {
//            PreparedStatement preparedStatement = connection
//                    .prepareStatement("update users set firstname=?, lastname=?, dob=?, email=?" +
//                            "where userid=?");
//             Parameters start with 1
//            preparedStatement.setString(1, user.getFirstName());
//            preparedStatement.setString(2, user.getLastName());
//            preparedStatement.setDate(3, new java.sql.Date(user.getDob().getTime()));
//            preparedStatement.setString(4, user.getEmail());
//            preparedStatement.setInt(5, user.getUserid());
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

//    public List<User> getAllUsers() {
//        List<User> users = new ArrayList<User>();
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet rs = statement.executeQuery("select * from users");
//            while (rs.next()) {
//                User user = new User();
//                user.setUserid(rs.getInt("userid"));
//                user.setFirstName(rs.getString("firstname"));
//                user.setLastName(rs.getString("lastname"));
//                user.setDob(rs.getDate("dob"));
//                user.setEmail(rs.getString("email"));
//                users.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return users;
//    }
//
//    public User getUserById(int userId) {
//        User user = new User();
//        try {
//            PreparedStatement preparedStatement = connection.
//                    prepareStatement("select * from users where userid=?");
//            preparedStatement.setInt(1, userId);
//            ResultSet rs = preparedStatement.executeQuery();
//
//            if (rs.next()) {
//                user.setUserid(rs.getInt("userid"));
//                user.setFirstName(rs.getString("firstname"));
//                user.setLastName(rs.getString("lastname"));
//                user.setDob(rs.getDate("dob"));
//                user.setEmail(rs.getString("email"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return user;
//    }
    
    
 
}