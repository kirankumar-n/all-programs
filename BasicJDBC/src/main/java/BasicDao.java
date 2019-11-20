import java.sql.*;

public class BasicDao {
    public static void main(String args[]) throws Exception{
        UserDao userDao = new UserDao();
        userDao.connect();
        User user = userDao.getUser(707);
        User userNew = new User();
        userNew.name = "Kiran";
        user.id = 123;
        userDao.addUser(userNew);
        System.out.println(user.name);
    }
}

class UserDao{

    Connection connection = null;

    public void connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/leasing","root","abc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public User getUser(int id){
        String query = "select name from user where id =" + id;
        User user = new User();
        user.id = id;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            resultSet.next();
            String name = resultSet.getString(1);
            user.name = name;
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addUser(User user) {
        String query = "INSERT INTO `user` ( `email_id`, `name`, `role_id`, `city_id`, `is_deleted`, `is_internal_user`, `created_at`, `updated_at`, `updated_by`) VALUES ('kiran@gmail.com', 'Kiran Kumar N', 2, 0, 0, 0, now(), now(),null);";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class User{
    int id;
    String name;
}

//Output: Kiran Kumar N
//id	email_id	name	role_id	city_id	is_deleted	is_internal_user	created_at	updated_at	updated_by
//708	kiran@gmail.com	Kiran Kumar N	2	0	0	0	2019-11-21 00:53:44	2019-11-21 00:53:44	NULL
