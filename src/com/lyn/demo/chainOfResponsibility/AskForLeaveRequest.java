package com.lyn.demo.chainOfResponsibility;

public class AskForLeaveRequest{
    private String name;
    private float days;
    private String reason;
    
    public AskForLeaveRequest(String name, float days, String reason){
        super();
        this.name = name;
        this.days = days;
        this.reason = reason;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public float getDays(){
        return days;
    }
    public void setDays(float days){
        this.days = days;
    }
    public String getReason(){
        return reason;
    }
    public void setReason(String reason){
        this.reason = reason;
    }
    
    
}
