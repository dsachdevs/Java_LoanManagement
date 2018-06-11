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
public class LoanDB {
    //Variable declarations
    private Loan[] loanList;
    private int count; //How many strings are in array
    private final int capacity; //How many at the most can be added

    //Constructor
    public LoanDB(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        loanList = new Loan[capacity];
    }

    //Constructor to set the default capacity
    public LoanDB() {
        this(10);
    }

    //Getters
    public int getCapacity() {
        return capacity;
    }

    public int getCount() {
        return this.count;
    }

    //Method to add a loan to DB
    public String addLoan(Loan name) {
        boolean present = false;
        String msg="";
        if (this.count < this.capacity) {
            for (int i = 0; i < count; i++) {
                if (name.equals(name, loanList[i])) {
                    present = true;
                    msg="Loan with same Name and amount already present. Loan NOT added!";
                    break;
                }
            }
            if (!present) {
                this.loanList[count++] = name;
                msg = "Loan added syccessfully";
            }
        } else {
            msg = "Capacity full. Load NOT added!";
        }
        return msg;

    }
    //Method to get all the loans

    public Loan[] getAllLoans() {
        return loanList;
    }

    //Method to get one specific loan
    public Loan getLoan(int loc) {
        return loanList[loc];
    }

    //Method to find locatio of one specific loan
    public int findLoan(String name, double amt) {
        int loc = -1;
        for (int i = 0; i < count; i++) {
            if (loanList[i].getLast_name().equals(name) && loanList[i].getLoan_amount() == amt) {
                loc = i;
                break;
            }
        }
        return loc;
    }

    
}
