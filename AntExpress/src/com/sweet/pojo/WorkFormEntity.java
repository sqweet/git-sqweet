package com.sweet.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "WorkForm", schema = "dbo", catalog = "AntExpress")
public class WorkFormEntity {
    private String sendId;
    private String senderName;
    private String senderTel;
    private String sendDepartment;
    private String receiverName;
    private String receiverTel;
    private String receiveDep;
    private Timestamp sendDatetime;
    private String sender;
    private String status;

    @Id
    @Column(name = "SendId", nullable = false, length = 13)
    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    @Basic
    @Column(name = "SenderName", nullable = true, length = 16)
    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    @Basic
    @Column(name = "SenderTel", nullable = true, length = 11)
    public String getSenderTel() {
        return senderTel;
    }

    public void setSenderTel(String senderTel) {
        this.senderTel = senderTel;
    }

    @Basic
    @Column(name = "SendDepartment", nullable = true, length = 64)
    public String getSendDepartment() {
        return sendDepartment;
    }

    public void setSendDepartment(String sendDepartment) {
        this.sendDepartment = sendDepartment;
    }

    @Basic
    @Column(name = "ReceiverName", nullable = true, length = 16)
    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @Basic
    @Column(name = "ReceiverTel", nullable = true, length = 11)
    public String getReceiverTel() {
        return receiverTel;
    }

    public void setReceiverTel(String receiverTel) {
        this.receiverTel = receiverTel;
    }

    @Basic
    @Column(name = "ReceiveDep", nullable = true, length = 64)
    public String getReceiveDep() {
        return receiveDep;
    }

    public void setReceiveDep(String receiveDep) {
        this.receiveDep = receiveDep;
    }

    @Basic
    @Column(name = "SendDatetime", nullable = true)
    public Timestamp getSendDatetime() {
        return sendDatetime;
    }

    public void setSendDatetime(Timestamp sendDatetime) {
        this.sendDatetime = sendDatetime;
    }

    @Basic
    @Column(name = "Sender", nullable = true, length = 16)
    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Basic
    @Column(name = "Status", nullable = true, length = 16)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkFormEntity that = (WorkFormEntity) o;
        return Objects.equals(sendId, that.sendId) &&
                Objects.equals(senderName, that.senderName) &&
                Objects.equals(senderTel, that.senderTel) &&
                Objects.equals(sendDepartment, that.sendDepartment) &&
                Objects.equals(receiverName, that.receiverName) &&
                Objects.equals(receiverTel, that.receiverTel) &&
                Objects.equals(receiveDep, that.receiveDep) &&
                Objects.equals(sendDatetime, that.sendDatetime) &&
                Objects.equals(sender, that.sender) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sendId, senderName, senderTel, sendDepartment, receiverName, receiverTel, receiveDep, sendDatetime, sender, status);
    }
}
