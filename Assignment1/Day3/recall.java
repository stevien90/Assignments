package Day3;

public class recall {

	public static void main(String[] args) {
		
		System.out.println("Testing out Employee Constructor"+"\n");
		Employee worker = new Employee(1, "Harima", 18, "schoolrumble@gmail.com");
		System.out.println(worker); //using constructor that has parameter id, name, age, email
		
		worker.name("Steven");// rewriting Harima to Steven
		System.out.println(worker);
		
		Employee workeri = new Employee(0);
		System.out.println(workeri);// using constructor that has just parameter id
		
		Employee worker2 = new Employee(1, "Jesse", 20, "Ayaya@gmail.com", "Jane");
		System.out.println(worker2); // using new constructor that has additional parameter last name
		
		Employee worker3 = new Employee(2, "Pen", 28, "Poggers@gmail.com","guyen", "North pole");
		System.out.println(worker3);
		
		System.out.println("\n"+"Updating old information");
		worker.last("nguyen");
		worker.address("myhome");
		workeri.last("Charolette");
		workeri.address("Wonderland");
		worker2.address("Kanto Region");
		System.out.println(worker);
		System.out.println(workeri);
		System.out.println(worker2);
		System.out.println("Information now updated");
		
		System.out.println("\n" + "Testing out Project Constructor"+"\n");
		Project project = new Project(1, "Take Over The World", "Dr. Doom");
		System.out.println(project);
		
		Project project2 = new Project(2, "Conquer the Galaxy", "THE EVILEST OF PERSON", "Alien minions");
		System.out.println(project2);
		
		System.out.println("\n" + "Testing out a constructor being declared as a private in another consturctor");
		permanentAdress p = new permanentAdress(0, "Nein Street", "Berlin", "Germany", 8008);
		Employee worker4 = new Employee(5, "German", 4, "imadog@gmail.com", "Shephard", "Human master", p);
		System.out.println(worker4);
		
	}


}
