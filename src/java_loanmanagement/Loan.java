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
public abstract class Loan implements LoanConstants {

    //Declaring variables
    private final int loan_number;
    private final String last_name;
    private final double loan_amount;
    protected double interest_rate, loan_fee;
    private final int loan_term;

    //Constructor
    public Loan(int loan_number, String last_name, double loan_amount, int loan_term) {

        this.loan_number = loan_number;
        this.last_name = last_name;
        //setting current prime intrest rate to a constant value
        this.interest_rate = 9;

        if (loan_amount > MAX_LOAN_AMT) {
            this.loan_amount = MAX_LOAN_AMT;
        } else {
            this.loan_amount = loan_amount;
        }
        
        if (loan_term != SHORT_TERM && loan_term != MEDIUM_TERM && loan_term != LONG_TERM) {
            this.loan_term = SHORT_TERM;
        } else {
            this.loan_term = loan_term;
        }
        
    }

    //getters
    public int getLoan_number() {
        return loan_number;
    }

    public String getLast_name() {
        return last_name;
    }

    public double getLoan_amount() {
        return loan_amount;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public int getLoan_term() {
        return loan_term;
    }

    //Method to diaplay loan details
    @Override
    public String toString() {
        return "Company: " + COMPANY_NAME + " || Loan Number: " + getLoan_number() + " || Last Name: " + getLast_name()
                + " || Interest Rate: " + getInterest_rate() + " || Loan Amount: " + getLoan_amount()
                + " || Loan Term: " + getLoan_term();
    }

    //Method to see if two loan objects are equal.
    public boolean equals(Loan l1, Loan l2) {
        boolean result = false;
        if (l1.getLast_name().equalsIgnoreCase(l2.getLast_name()) && l1.getLoan_amount() == l2.getLoan_amount()) {
            result = true;
        }
        return result;
    }
}

