package com.sweet.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Department", schema = "dbo", catalog = "AntExpress")
public class DepartmentEntity {
    private int depId;
    private String depName;
    private String depDetail;

    @Id
    @Column(name = "DepId", nullable = false)
    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    @Basic
    @Column(name = "DepName", nullable = true, length = 16)
    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    @Basic
    @Column(name = "DepDetail", nullable = true, length = 256)
    public String getDepDetail() {
        return depDetail;
    }

    public void setDepDetail(String depDetail) {
        this.depDetail = depDetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentEntity that = (DepartmentEntity) o;
        return depId == that.depId &&
                Objects.equals(depName, that.depName) &&
                Objects.equals(depDetail, that.depDetail);
    }

    @Override
    public int hashCode() {

        return Objects.hash(depId, depName, depDetail);
    }
}
