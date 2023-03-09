
class Gryffindor {
    int nobility;
    int honor;
    int bravery;

    public Gryffindor(int nobility, int honor, int bravery) {
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void compareStudents(Gryffindor student1, Gryffindor student2) {
        int score1 = student1.nobility + student1.honor + student1.bravery;
        int score2 = student2.nobility + student2.honor + student2.bravery;

        if (score1 > score2) {
            System.out.println("The first Gryffindor student is better than the second one.");
        } else if (score1 < score2) {
            System.out.println("The second Gryffindor student is better than the first one.");
        } else {
            System.out.println("Both Gryffindor students are equally good.");
        }
    }
}