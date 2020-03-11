package komplex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("User neve: ");
		String name = sc.next();
		int len= name.length();
		
		if(len>=6 && !name.contains(" ") ){
			UserController user = new UserController(name);
			System.out.println("elmentve: " + name);
		}else{
			System.out.println("helytelen username!");
		}
		

	}

}