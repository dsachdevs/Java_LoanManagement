/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_loanmanagement;

/**
 *
 * @author DHiRAJ
 */
public class BusinessLoan extends Loan {
        //Constructor
    BusinessLoan(int loan_number, String last_name, double loan_amount, int loan_term, double loan_fee){
        super(loan_number, last_name, loan_amount, loan_term);
        this.interest_rate = (super.getInterest_rate() + 1);
        this.loan_fee = loan_fee;
    }
    
    //display the loan details
    @Override
    public String toString(){
        return "Type: Business || " + super.toString()+ " || Loan Fee: " + this.loan_fee + " || Total amount owed: "
                + (super.getLoan_amount() + this.loan_fee);
    }
    
}
