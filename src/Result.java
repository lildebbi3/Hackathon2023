/*
Class to store the Result
 */
public class Result {
    private String state;
    private String industry;
    private int[] injuries = new int[6];

    public Result (String state, String industry, int[] injuries){
        setIndustry(industry);
        setState(state);
        setInjuries(injuries);
    }
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
        System.out.println("Physical Injuries: "+injuries[0]);
        System.out.println("Skin Disorders: "+injuries[1]);
        System.out.println("Respiratory Conditions: "+injuries[2]);
        System.out.println("Poisonings: "+injuries[3]);
        System.out.println("Hearing Loss: "+injuries[4]);
        System.out.println("Others Illnesses: "+injuries[5]);
    }
}
