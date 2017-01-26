/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Forum;

import Business.Person.Patient;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Aayush
 */
public class ForumTopic {
    
    private String name;
    private Disease disease;
    private Patient senderPatient;
    private Date createdOn;
    private ArrayList<Reply>replyList;

    public ForumTopic() {
        replyList = new ArrayList<>();
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Patient getSenderPatient() {
        return senderPatient;
    }

    public void setSenderPatient(Patient senderPatient) {
        this.senderPatient = senderPatient;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public ArrayList<Reply> getReplyList() {
        return replyList;
    }

    public void setReplyList(ArrayList<Reply> replyList) {
        this.replyList = replyList;
    }
    
    
    @Override
    public String toString() {
        return name;
    }

    
    
    
    
}
