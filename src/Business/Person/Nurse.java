/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

/**
 *
 * @author Aayush
 */
public class Nurse extends Person{
    
    private String nurseLiscenceID;
    private String degree;

    public String getNurseLiscenceID() {
        return nurseLiscenceID;
    }

    public void setNurseLiscenceID(String nurseLiscenceID) {
        this.nurseLiscenceID = nurseLiscenceID;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return super.getFirstName();
    }
    
    
    
    
}
