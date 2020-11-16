package org.hbrs.se.ws20.uebung2;

public class MemberInstanz implements Member{
    Integer ID;
    public Integer getID(){
        return this.ID;
    }
    public MemberInstanz(Integer ID){
        this.ID = ID;
    }
    @Override
    public String toString(){
        return Integer.toString(ID);
    }
}
