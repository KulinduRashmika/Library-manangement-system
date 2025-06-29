package com.demo.issued.data;



import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Borrow_Return")
public class Issued {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "U_ID")
    private int uid;

    @Column(name = "B_ID")
    private int bid;

    @Column(name = "Borrow_Date")
    @Temporal(TemporalType.DATE)
    private Date borrowDate;

    @Column(name = "Return_Date")
    @Temporal(TemporalType.DATE)
    private Date returnDate;

    // --- Getters and Setters ---
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
