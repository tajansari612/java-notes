class Animal{
    private String name;
    private int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    
}

class Dog extends Animal{
    private String breed;
    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
    }

    // Getter
    public String getBreed(){
        return breed;
    }
    // Setter
    public void setBreed(String breed){
        this.breed = breed;
    }
}
class _12_object_creation{
    public static void main(String[] args){
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Animal dog2 = new Dog("Max", 5, "Beagle");
       
        dog.setAge(4);
        dog.setBreed("Labrador");
        dog.setName("Charlie");

        dog2.setAge(6);
        dog2.setName("Rocky");
        // dog2.setBreed("Bulldog"); // This line would cause a compile-time error
    }
}