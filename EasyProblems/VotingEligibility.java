/* Use of Logical Operators Write a Java program to check if a person is eligible to 
vote. (The person must be 18 or older and a citizen.)*/

public class VotingEligibility {
    public String name;
    public int age;
    public boolean isCitizen;

    public VotingEligibility(String name, int age, boolean isCitizen) {
        this.name = name;
        this.age = age;
        this.isCitizen = isCitizen;
    }

    public boolean isVoteEligible() {
        return age >= 18 && isCitizen;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Citizen: " + isCitizen);
        System.out.println("Eligible to Vote: " + isVoteEligible());
        System.out.println();
    }

    public static void main(String[] args) {
        VotingEligibility v1 = new VotingEligibility("Sareana", 20, true);
        VotingEligibility v2 = new VotingEligibility("Haruka", 12, true);
        VotingEligibility v3 = new VotingEligibility("Hayabusha", 25, false);

        v1.showDetails();
        v2.showDetails();
        v3.showDetails();
    }
}
