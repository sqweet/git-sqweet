package com.sweet.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Customer", schema = "dbo", catalog = "AntExpress")
public class CustomerEntity {
    private String cstLogin;
    private String cstPwd;
    private String cstTel;
    private String cstAddress;

    @Id
    @Column(name = "CstLogin", nullable = false, length = 16)
    public String getCstLogin() {
        return cstLogin;
    }

    public void setCstLogin(String cstLogin) {
        this.cstLogin = cstLogin;
    }

    @Basic
    @Column(name = "CstPwd", nullable = true, length = 16)
    public String getCstPwd() {
        return cstPwd;
    }

    public void setCstPwd(String cstPwd) {
        this.cstPwd = cstPwd;
    }

    @Basic
    @Column(name = "CstTel", nullable = true, length = 11)
    public String getCstTel() {
        return cstTel;
    }

    public void setCstTel(String cstTel) {
        this.cstTel = cstTel;
    }

    @Basic
    @Column(name = "CstAddress", nullable = true, length = 256)
    public String getCstAddress() {
        return cstAddress;
    }

    public void setCstAddress(String cstAddress) {
        this.cstAddress = cstAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerEntity that = (CustomerEntity) o;
        return Objects.equals(cstLogin, that.cstLogin) &&
                Objects.equals(cstPwd, that.cstPwd) &&
                Objects.equals(cstTel, that.cstTel) &&
                Objects.equals(cstAddress, that.cstAddress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cstLogin, cstPwd, cstTel, cstAddress);
    }
}
