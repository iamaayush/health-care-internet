/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

/**
 *
 * @author Aayush
 */
public class DoctorToLabWorkRequest extends WorkRequest{
    
    
    private String MRN;
    private String Result;

    public String getMRN() {
        return MRN;
    }

    public void setMRN(String MRN) {
        this.MRN = MRN;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
    
    
    
}
