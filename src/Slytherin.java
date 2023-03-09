



class Slytherin {
    int cunning;
    int determination;
    int ambition;
    int resourcefulness;
    int thirstForPower;

    public Slytherin(int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public void compare(Slytherin other) {
        int thisScore = cunning + determination + ambition + resourcefulness + thirstForPower;
        int otherScore = other.cunning + other.determination + other.ambition + other.resourcefulness + other.thirstForPower;
        if (thisScore > otherScore) {
            System.out.println("Этот Слизеринец лучше, чем другой");
        } else if (thisScore < otherScore) {
            System.out.println("Этот Слизеринец хуже, чем другой");
        } else {
            System.out.println("Этот Слизеринец такой же, как и другой");
        }
    }
}

