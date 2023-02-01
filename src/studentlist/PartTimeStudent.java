/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author nguye
 */
public class PartTimeStudent extends StudentList{
    
    private int noOfCOurse;

    public PartTimeStudent(int noOfCOurse) {
        this.noOfCOurse = noOfCOurse;
    }

    public int getNoOfCOurse() {
        return noOfCOurse;
    }

    public void setNoOfCOurse(int noOfCOurse) {
        this.noOfCOurse = noOfCOurse;
    }
    
}
