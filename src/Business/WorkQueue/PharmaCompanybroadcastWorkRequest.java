/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Enterprise.Enterprise;

/**
 *
 * @author Aayush
 */
public class PharmaCompanybroadcastWorkRequest extends WorkRequest {
    
    private String enterpriseName;
    private String recipients;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }


    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    
    
    
    @Override
    public String toString() {
        return super.getMessage();
    }
    
    
}
