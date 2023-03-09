// Faculty class, inheriting from Hogwarts
public class Faculty extends Hogwarts {
    // Properties specific to each faculty
    private String house;
    private String headOfHouse;

    public Faculty(String name, int age, String bloodStatus, String house, String headOfHouse) {
        super(name, age, bloodStatus);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public String getHouse() {
        return house;
    }

    public String getHeadOfHouse() {
        return headOfHouse;
    }
}
