public class IncomeCalculator {

    private int totalMonthlyIncomeInPLN;
    private int numOfFamilyMembers;

    public IncomeCalculator(int totalMonthlyIncomeInPLN, int numOfFamilyMembers) {
        this.totalMonthlyIncomeInPLN = totalMonthlyIncomeInPLN;
        this.numOfFamilyMembers = numOfFamilyMembers;
    }

    public DecisionType incomePerFamilyMember(){
        FinancialData financialData = new FinancialData(totalMonthlyIncomeInPLN,numOfFamilyMembers);

        if( totalMonthlyIncomeInPLN/numOfFamilyMembers > 2000){
            return DecisionType.POSITIVE;
        }else{
            return DecisionType.NEGATIVE;
        }
    }

}
