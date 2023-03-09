

public class Hufflepuff {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(int diligence, int loyalty, int honesty) {
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void describe() {
        System.out.println("Diligence: " + diligence);
        System.out.println("Loyalty: " + loyalty);
        System.out.println("Honesty: " + honesty);
    }

    public static void compareStudents(Hufflepuff student1, Hufflepuff student2) {
        int student1Points = student1.getDiligence() + student1.getLoyalty() + student1.getHonesty();
        int student2Points = student2.getDiligence() + student2.getLoyalty() + student2.getHonesty();

        if (student1Points > student2Points) {
            System.out.println("Student 1 is a better Hufflepuff than Student 2.");
        } else if (student1Points < student2Points) {
            System.out.println("Student 2 is a better Hufflepuff than Student 1.");
        } else {
            System.out.println("Both students are equally good Hufflepuffs.");
        }
    }
}
