package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal("Gazelle", "MAMMIFERE", "HERBIVORE");
		zoo.addAnimal("Z�bre", "MAMIFERE", "HERBIVORE");
		zoo.addAnimal("Lion", "MAMMIFERE", "HERBIVORE");
		zoo.addAnimal("Panth�re", "MAMMIFERE", "CARNIVORE");
		zoo.addAnimal("Requin blanc", "POISSON", "HERBIVORE");
		zoo.addAnimal("Truite dor�e", "POISSON", "HERBIVORE");
		zoo.addAnimal("Boa constrictor", "SERPENT", "CARNIVORE");
		zoo.addAnimal("Python", "SERPENT", "CARNIVORE");
	}

}
