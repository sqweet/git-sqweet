package com.sweet.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Employee", schema = "dbo", catalog = "AntExpress")
public class EmployeeEntity {
    private String empLogin;
    private String empName;
    private String empPwd;
    private String empGender;
    private String job;
    private String department;
    private String tel;
    private String email;
    private double salary;

    @Id
    @Column(name = "EmpLogin", nullable = false, length = 16)
    public String getEmpLogin() {
        return empLogin;
    }

    public void setEmpLogin(String empLogin) {
        this.empLogin = empLogin;
    }

    @Basic
    @Column(name = "EmpName", nullable = true, length = 16)
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Basic
    @Column(name = "EmpPwd", nullable = true, length = 32)
    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd;
    }

    @Basic
    @Column(name = "EmpGender", nullable = true, length = 1)
    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    @Basic
    @Column(name = "Job", nullable = true, length = 16)
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "Department", nullable = true, length = 16)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Basic
    @Column(name = "Tel", nullable = true, length = 11)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "Email", nullable = true, length = 32)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Salary", nullable = true)
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return Objects.equals(empLogin, that.empLogin) &&
                Objects.equals(empName, that.empName) &&
                Objects.equals(empPwd, that.empPwd) &&
                Objects.equals(empGender, that.empGender) &&
                Objects.equals(job, that.job) &&
                Objects.equals(department, that.department) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(email, that.email) &&
                Objects.equals(salary, that.salary);
    }

    @Override
    public int hashCode() {

        return Objects.hash(empLogin, empName, empPwd, empGender, job, department, tel, email, salary);
    }
}
