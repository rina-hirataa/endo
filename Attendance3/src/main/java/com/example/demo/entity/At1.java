package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "At1") // テーブル名を指定
public class At1 {
    @Id
    @Column(name = "employeeid") 
    private String employeeId; // カラム名が employee_id である場合、@Column(name = "employee_id") を追加

    @Column(name = "password") 
    private String password;

    // ゲッターとセッター
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}