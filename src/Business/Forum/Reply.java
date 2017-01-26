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
public class Reply {
    
    private Patient patient;
    private String reply;
    private Date replyDate;
    private ArrayList<Reply>commentList;

    public Reply() {
        
        commentList = new ArrayList<>();
        
    }


    
    
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    public ArrayList<Reply> getCommentList() {
        return commentList;
    }

    public void setCommentList(ArrayList<Reply> commentList) {
        this.commentList = commentList;
    }
    

    @Override
    public String toString() {
        return String.valueOf(replyDate);
    }
}
