class Student {
    protected String name;
    protected int magicPower;
    protected int transgressionDistance;

    public Student(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void describe() {
        System.out.println("Ученик " + name + " умеет колдовать с мощностью " + magicPower +
                " и может трансгрессировать на расстояние " + transgressionDistance + ".");
    }

}
