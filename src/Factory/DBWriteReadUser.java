package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBWriteReadUser implements WriteReadUser {
	
	Connection conn = null;
	
	public DBWriteReadUser () {
		
		try {
			Class.forName("org.sqlite.JDBC");
			conn = DriverManager.getConnection("jdbc:sqlite:Users.db.sqlite");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void write(User user) {
		try {
			Statement s = conn.createStatement();
			s.executeUpdate("Insert into Users (name, age, mail) values ('" + user.getName() +
					"', " +  user.getAge() + ", '" + user.getMail() + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public User read(String name) {
		User userRead = null;
		ResultSet rs = null;
		
		try {
			Statement s = conn.createStatement();
			rs = s.executeQuery("Select * from Users where name='" + name + "'");
			userRead = new User(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("mail"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return userRead;
	}

	@Override
	public void update(String name, User user) {
		try {
			Statement s = conn.createStatement();
			s.executeUpdate("Update Users set age=" + user.getAge() + ", mail='" + user.getMail() + 
					"' where name='" + name + "'");
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void listAllRecords() {
		User user = null;
		ResultSet rs = null;
		
		try {
			Statement s = conn.createStatement();
			rs = s.executeQuery("Select * from Users");
			while (rs.next()) {
				user = new User(rs.getInt("id"), rs.getString("name"), rs.getInt("age"), rs.getString("mail"));
				System.out.println(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
