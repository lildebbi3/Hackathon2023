/*
Class to store the Result
 */
public class Result {
    private String state;
    private String industry;
    private int[] injuries = new int[7];

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int[] getInjuries() {
        return injuries;
    }

    public void setInjuries(int[] injuries) {
        this.injuries = injuries;
    }

    public void print() {
        System.out.println("State: " + state);
        System.out.println("Industry: " + industry);
        System.out.println("Injuries:");
        for (int i = 0; i < injuries.length; i++) {
            System.out.println("Week " + (i+1) + ": " + injuries[i]);
        }
    }
}
