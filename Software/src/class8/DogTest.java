package class8;

public class DogTest
{

	public static void main(String[] args)
	{
		System.out.println(Dog.count);
		Dog dog1 = new Dog();
		System.out.println(Dog.count);
		Dog dog2 = new Dog();
		System.out.println(Dog.count);
		System.out.println(dog2.count);
	}

}
