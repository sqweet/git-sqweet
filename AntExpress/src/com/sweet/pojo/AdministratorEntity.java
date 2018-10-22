package com.sweet.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Administrator", schema = "dbo", catalog = "AntExpress")
public class AdministratorEntity {
    private String admPwd;

    @Id
    @Column(name = "AdmPwd", nullable = false, length = 16)
    public String getAdmPwd() {
        return admPwd;
    }

    public void setAdmPwd(String admPwd) {
        this.admPwd = admPwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdministratorEntity that = (AdministratorEntity) o;
        return Objects.equals(admPwd, that.admPwd);
    }

    @Override
    public int hashCode() {

        return Objects.hash(admPwd);
    }
}
