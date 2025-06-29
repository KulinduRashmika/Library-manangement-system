package com.user.demo.data;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_nic")
    private String userNic;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "reg_date")
    @Temporal(TemporalType.DATE)
    private Date regDate;

    @Column(name = "contact")
    private String contact;

    // Getters + Setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getUserNic() { return userNic; }
    public void setUserNic(String userNic) { this.userNic = userNic; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Date getRegDate() { return regDate; }
    public void setRegDate(Date regDate) { this.regDate = regDate; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }
}