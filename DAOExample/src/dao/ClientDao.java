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

    public void deleteClient(int clientId) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from test where id=?");
            // Parameters start with 1
            preparedStatement.setInt(1, clientId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateClient(Client client) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update test set name=?, adress=?, credit=?" +
                            "where id=?");
//             Parameters start with 1
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getAdress());
            preparedStatement.setFloat(3, client.getCredit());
            preparedStatement.setInt(4, client.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Client> getAllUsers() {
        List<Client> clients = new ArrayList<Client>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from test");
            while (rs.next()) {
                Client client = new Client();
                client.setId(rs.getInt("id"));
                client.setName(rs.getString("name"));
                client.setAdress(rs.getString("adress"));
                client.setCredit(rs.getFloat("credit"));
                client.setExpiration(rs.getDate("date"));
                clients.add(client);
                System.out.println(client.getName());
                System.out.println(client.getAdress());
                System.out.println(client.getCredit());
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        
		System.out.println(clients);
	
        return clients;
        
    }

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