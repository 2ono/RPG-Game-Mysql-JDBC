import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RPGgameDAO {

	public void enrollGame(String name)
			throws SQLException {
		try {

			Connection c = JDBC.createC();
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
}
