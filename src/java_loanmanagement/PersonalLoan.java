package java_loanmanagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DHiRAJ
 */
public class PersonalLoan extends Loan {

    //Constructor
    PersonalLoan(int loan_number, String last_name, double loan_amount, int loan_term, double loan_fee) {
        super(loan_number, last_name, loan_amount, loan_term);
        this.interest_rate = (super.getInterest_rate() + 2);
        this.loan_fee = loan_fee;
    }

    //Display the loan details
    @Override
    public String toString() {
        return "Type: Personal || " + super.toString() + " || Loan Fee: " + this.loan_fee + " || Total amount owed: "
                + (super.getLoan_amount() + this.loan_fee);
    }

}
