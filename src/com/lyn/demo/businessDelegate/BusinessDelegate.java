package com.lyn.demo.businessDelegate;

public class BusinessDelegate{
    private BusinessLookUp lookup = new BusinessLookUp();
    private BusinessService service;
    private String serviceType;
    
    public BusinessDelegate(String serviceType){
        this.serviceType = serviceType;
    }

    public String getServiceType(){
        return serviceType;
    }

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }
    
    public void doTask()
    {
        this.service = lookup.lookUp(this.getServiceType());
        this.service.doProcessing();
    }
}
