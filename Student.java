package Student_Management_System;

/*
 * This class is responsible for keeping the
 * track of students fees, name ,grade & fees
 * paid.
 *
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /*
     * To create a new student by initializing.
     * Fees for every student is $30,000.
     * Fees paid initially is 0.
     * id for the student: unique.
     * name of the student.
     * grade of the student.
     */
    public Student(int id, String name,int grade){
        this.feesPaid=0; 		// We can avoid using this keyword here constructor do not have feesTotal parameter hence there's no ambiguity
        this.feesTotal=300000; 	// We can avoid using this keyword here constructor do not have feesTotal parameter hence there's no ambiguity
        this.id=id;
        this.name=name;
        this.grade=grade;

    }

    //Not going to alter student's name, student's id.


    /*
     * Used to update the student's grade.
     */
    public void setGrade(int grade){
        this.grade=grade;
    }


    /*
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * The school is going receive the funds.
     * fees :- fees that the student pays.
     */
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /*
     * id of the student.
     */
    public int getId() {
        return id;
    }

    /*
     * name of the student.
     */
    public String getName() {
        return name;
    }

    /*
     * grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /*
     * fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /*
     * total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /*
     * the remaining fees.
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name : "+name+
                " Total fees paid so far $"+ feesPaid;
    }
}
