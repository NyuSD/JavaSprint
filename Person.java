/**
 * Represents a generic person in the system.
 * This serves as the parent class for Patient and Doctor.
 */
public class Person {
    private String id;
    private String name;
    private int age;
    private String phoneNumber;

    /**
     * Constructs a new Person.
     *
     * @param id          The unique identifier.
     * @param name        The name of the person.
     * @param age         The age of the person.
     * @param phoneNumber The contact number.
     */

    public Person(String id, String name, int age, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Gets the unique identifier.
     * @return The unique identifier.
     */

    public String getId() {
        return id;
    }

    /**
     * Sets the unique identifier.
     * @param id The unique identifier.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the name of the person.
     * @return The name of the person.
     */

    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     * @param name The name of the person.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the person.
     * @return The age of the person.
     */

    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     * @param age The age of the person.
     */

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the contact number.
     * @return The contact number.
     */

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the contact number.
     * @param phoneNumber The contact number.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "ID='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
