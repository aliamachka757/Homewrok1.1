public class Ravenclaw {
    private int intelligence;
    private int wisdom;
    private int creativity;
    private int humor;

    public Ravenclaw(int intelligence, int wisdom, int creativity, int humor) {
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.creativity = creativity;
        this.humor = humor;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCreativity() {
        return creativity;
    }

    public int getHumor() {
        return humor;
    }

    public void describe() {
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Wisdom: " + wisdom);
        System.out.println("Creativity: " + creativity);
        System.out.println("Humor: " + humor);
    }

    public static void compareStudents(Ravenclaw student1, Ravenclaw student2) {
        int student1Points = student1.getIntelligence() + student1.getWisdom() + student1.getCreativity() + student1.getHumor();
        int student2Points = student2.getIntelligence() + student2.getWisdom() + student2.getCreativity() + student2.getHumor();

        if (student1Points > student2Points) {
            System.out.println("Student 1 is a better Ravenclaw than Student 2.");
        } else if (student1Points < student2Points) {
            System.out.println("Student 2 is a better Ravenclaw than Student 1.");
        } else {
            System.out.println("Both students are equally good Ravenclaws.");
        }
    }
}
