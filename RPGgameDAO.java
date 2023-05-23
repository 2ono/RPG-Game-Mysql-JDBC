import java.sql.Connection;
import java.sql.SQLException;

public class RPGgameDAO {

	public void enrollGame() throws ClassNotFoundException, SQLException {
		Connection conn = new JDBC().createC();
		
		String q = "insert into human(id,name,age,email,address) values(?,?,?,?,?);";
		
		// stop autu commit
//		conn.getAutoCommit(false);
		// 1, 'james',30,'sky@gmail.com','south korea country soul city'
		
		// visit restaurants to gain Level resrant table > level table > human table
		
	}
}
