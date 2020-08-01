package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Member implements Serializable {
    private int ID;
    private String name;
    private String phone;
    private String email;
    private String address;
    private Date expireDate;
    private String status;
    private double record;

    private ArrayList<Item> borrow;
    private ArrayList<Date> borrowDate;

    public Member() {
        System.out.println("ID = " + getID());
    }

    public Member(String name, String phone, String email, String address, Date expireDate, String status) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.expireDate = expireDate;
        this.status = status;
        System.out.println(getID());
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getRecord() {
        return record;
    }

    public void setRecord(double record) {
        this.record = record;
    }

    public ArrayList<Item> getBorrow() {
        return borrow;
    }

    public void setBorrow(ArrayList<Item> borrow) {
        this.borrow = borrow;
    }

    public ArrayList<Date> getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(ArrayList<Date> borrowDate) {
        this.borrowDate = borrowDate;
    }

    @Override
    public String toString() {
        return "Member{ ID = " + ID +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", expireDate=" + expireDate +
                ", status=" + status +
                ", record=" + record +
                ", borrow=" + borrow +
                ", borrowDate=" + borrowDate +
                '}';
    }
}


