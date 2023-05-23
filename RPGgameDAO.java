import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RPGgameDAO {

	private final JDBC dbConnector = new JDBC();
	
	public void enrollGame(String name)
			throws SQLException {
		try {

			Connection c = dbConnector.createC();
//			String q = "insert into human(id,name,age,email,address) values(?,?,?,?,?);";
			String q = "insert into human(human_name) values(?)";

			// 자동커밋 비활성화
			c.setAutoCommit(false);
			// sql injection 공격 예방
			PreparedStatement pstm = c.prepareStatement(q);

//			pstm.setInt(1, id);
			pstm.setString(1, name);
//			pstm.setInt(3, age);
//			pstm.setString(4, email);
//			pstm.setString(5, address);
			pstm.addBatch();
			// 배치 실행
			pstm.executeBatch();
			// 커밋
			c.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// stop autu commit
//		conn.getAutoCommit(false);
		// 1, 'james',30,'sky@gmail.com','south korea country soul city'

		// visit restaurants to gain Level resrant table > level table > human table

	}
	
	
	public void huntAnimal(int hunt) throws ClassNotFoundException, SQLException {
		try {
			Connection cnn = dbConnector.createC();
			
			String q = "insert into hunting(exercise_hour) values(?);";
			
			//자동 커밋 비활성화
			cnn.setAutoCommit(false);
			
			// SQL injection 방어
			PreparedStatement pstm = cnn.prepareStatement(q);
			
			pstm.setInt(1, hunt);
			pstm.addBatch();
			pstm.executeBatch();
			cnn.commit();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void levelCheck() throws ClassNotFoundException, SQLException {
		try {
			Connection cn = dbConnector.createC();
			String q = "";
			// update level set level = level + hunting.exercise_hour where level.human_id = hunting.human_id;
			
			// 자동 커밋 비활성화
			cn.setAutoCommit(false);
			
			// SQL injection 방어
			PreparedStatement pstm = cn.prepareStatement(q);
			
			pstm.executeUpdate();
			
			cn.commit();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getEnergy() throws ClassNotFoundException, SQLException {
		Connection cn = dbConnector.createC();
		String q = "";
		
		cn.setAutoCommit(false);
		
		// SQL injection 방어
		PreparedStatement pstm = cn.prepareStatement(q);
		
		pstm.executeUpdate();
		
		cn.commit();
	}
	
	
	
}
