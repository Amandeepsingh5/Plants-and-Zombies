import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	Game f;
	Zombie z;
	//private Zombie enemy;
	private static ArrayList<Zombie> enemy;
	private static int sun= 0;
	private static int sunFlower = 0;
	private static int peaShooter = 0;

	//private static Boolean empty;

	public Game() {
		Game.enemy = new ArrayList<Zombie>();
		//empty = false;


		//enemy.setHealth(1);

	}

	public void createSunflower() {

	}
	public void createEnemy() {

		z = new Zombie(1);
		for(int i=0; i < 4;i++) {
			Game.enemy.add(z);
		}
	}

	public void action(String x) {

		if(x.equals("drop sunflower")) {
			sunFlower += 1;
			sun += 1;
			System.out.println("A sunflower has been dropped");
			System.out.println(sun + " sun points");
			System.out.println(sunFlower + " sunflower(s)");
			System.out.println(" ");
		}else if(x.equals("drop peashooter")) {
			if(sun >= 3) {
				peaShooter += 1;
				System.out.println(peaShooter + " pea Shooter");
				System.out.println(" ");
				sun -=3;
			}else {
				System.out.println("Not enough sunpoints");
				System.out.println(" ");
			}

		}else if(x.equals("shoot")&& enemy.isEmpty() == false) {

			if(peaShooter == 0) {
				System.out.println("No pea Shooter");
				System.out.println(" ");

			}else {
				if(peaShooter <= enemy.size()) {
					for(int i = 0; i < peaShooter; i++) {
						enemy.remove(0);
						System.out.println("Zombie dead");
						System.out.println(" ");
					}
				}
				if(peaShooter > enemy.size())  {
					int y = enemy.size();
					for(int i = 0; i < y; i++) {
						enemy.remove(0);
						System.out.println("Zombie dead");
						System.out.println(" ");
					}

				}
			}
		}

	}
	public void play() {


	}




	@SuppressWarnings("resource")
	public static void main(String[] args){

		Game f = new Game();
		f.createEnemy();
		while(enemy.isEmpty() == false) {
			//try {

			System.out.println("Commands");
			System.out.println("drop sunflower");
			System.out.println("drop peashooter");
			System.out.println("shoot");
			System.out.println(" ");

			/*				InputStreamReader sr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(sr);*/
			Scanner br = new Scanner(System.in);

			sun += 1;
			String name ;
			name = br.nextLine();
			f.action(name);


			/*} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}

		System.out.println("All zombies dead");

	}
}
