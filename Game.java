import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Game {

	Game f;
	Zombie z;
	private static int lifes = 5;
	private static ArrayList<Zombie> enemy;
	private static int sun= 0;
	private static int sunFlower = 0;
	private static int peaShooter = 0;
	private static int turns = 5;
	private static int counter = 0;

	public Game() {
		Game.enemy = new ArrayList<Zombie>();
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
					//System.out.println(enemy.size()+" left");
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
		while(enemy.isEmpty() == false && lifes != 0) {

			System.out.println("Commands");
			System.out.println("------------------");
			System.out.println("1. drop sunflower");
			System.out.println("2. drop peashooter");
			System.out.println("3. shoot");
			System.out.println(" ");


			Scanner br = new Scanner(System.in);

			counter++;
			if (counter == turns) {
				lifes -= 1;
				counter = 0;
				System.out.println(lifes + " lives left");
			}
			sun++;
			String name ;
			name = br.nextLine();
			f.action(name);

		}

		if(enemy.isEmpty() == false && lifes == 0) {
			System.out.println("You died");
		}else {
			System.out.println("All zombies dead");
		}

	}
}
