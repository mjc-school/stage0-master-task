public class Animal
	{
		private String color;
		private int numberOfPaws;
		private boolean hasFur;
		
	public Animal()
	{
		
	}
	
	public Animal(String color, int numberOfPaws, boolean hasFur) 
	{
		this.color=color;
		this.numberOfPaws=numberOfPaws;
		this.hasFur=hasFur;
	}
	
	public String getDescription()
	{
		String furDescription = hasFur ? "a" : "no";
        String pawsDescription = (numberOfPaws == 1) ? "paw" : "paws";
        
		return  "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawsDescription + " and " + furDescription + " fur.";
	}
	

	public static void main(String[] args) {
		Dog myDog = new Dog();
		Bird myBird = new Bird();
		
		Animal myAnimal = new Animal("black", 2, true);			//TASK 1
		System.out.println(myAnimal.getDescription());
		
		System.out.println("Dog: " + myDog.getDescription());
		System.out.println("Bird: " + myBird.getDescription());

	}	
}

