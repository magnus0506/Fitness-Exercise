public class Member extends Person{

    private boolean isBasic;

    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
        getMonthlyFee();
        getMemberType();
    }

    public String getMemberType(){
        String memberType;
        if (isBasic){
            return memberType = "Basic";
        } else {
            return memberType = "Full";
        }
    }

    public int getMonthlyFee() {
        if (isBasic) {
            return 199;
        } else  {
            return 299;
        }
    }

    public String toString(){
        return  "Member: " + getName() +
                "\nCPR: " + getCpr() +
                "\nMembership: " + getMemberType() +
                "\nMonthly Fee: " + getMonthlyFee() +
                "\n";
    }
}
