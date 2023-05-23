import java.sql.SQLException;
import java.util.Scanner;

public class RPGgame {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
	
		while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to RPG game");
			System.out.println("Press 1 to enroll Character");
			System.out.println("Press 2 to check status Character");
			System.out.println("Press 3 to hunt animals");
			int num = scan.nextInt();
			RPGgameDAO dao = new RPGgameDAO();
			
			
			switch (num) {
			case 1:
//				int id, String name, int age, String email, String address
				System.out.println("Submit your nickname");
				String name = scan.next();
				dao.enrollGame(name);
				
				System.out.println("Congrat! you did done");
				break;
			case 2:
				System.out.println("Check your status");
			case 3:
				System.out.println("Hunting animal!");
				
				
			}
			
		}
	}
}
