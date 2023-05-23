import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RPGgame {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// add exception
		try {
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
					dao.levelCheck();
				case 3:
					System.out.println("Hunting animal!");
					int ran = (int) (Math.random() * 19);
					ArrayList<String> ani = Animal();
					System.out.println("You are encounterd to " + ani.get(ran) + "!!!");
					System.out.println("You are encounterd to " + ani.get(ran) + "!!!");
					System.out.println("You are encounterd to " + ani.get(ran) + "!!!");
					System.out.println("You are encounterd to " + ani.get(ran) + "!!!");
					System.out.println("You are encounterd to " + ani.get(ran) + "!!!");
					System.out.println("You are encounterd to " + ani.get(ran) + "!!!");
					dao.huntAnimal(ran);

				}

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static ArrayList<String> Animal() {
		ArrayList<String> animals = new ArrayList<String>();
		// 18ea
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Fox");
		animals.add("Elephant");
		animals.add("Duck");
		animals.add("Kangaroo");
		animals.add("Squirrel");
		animals.add("Horse");
		animals.add("Deer");
		animals.add("Goat");
		animals.add("Bear");
		animals.add("Chicken");
		animals.add("Eagle");
		animals.add("Dog");
		animals.add("Birds");
		animals.add("Monkey");
		animals.add("Sheep");
		animals.add("Leopard");
		
		return animals;
	}
}
