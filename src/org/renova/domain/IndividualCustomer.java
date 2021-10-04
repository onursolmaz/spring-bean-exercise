package org.renova.domain;

public class IndividualCustomer extends Customer{

    private String gender;

    public IndividualCustomer(String name,String gender) {
        super(name);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "IndividualCustomer{" +
                "gender='" + gender + '\'' +
                "name='" + getName() + '\'' +
                '}';
    }
}
