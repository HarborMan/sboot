package com.action.sboot.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table( name = "lz_purchase_supplier", schema = "mini_wx", catalog = "" )
public class LzPurchaseSupplierEntity {
    private int id;
    private String name;
    private String linkman;
    private String mobile;
    private String address;
    private String descs;
    private int state;
    private String updater;
    private Timestamp updatime;

    @Id
    @Column( name = "id" )
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column( name = "name" )
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column( name = "linkman" )
    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    @Basic
    @Column( name = "mobile" )
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column( name = "address" )
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column( name = "descs" )
    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    @Basic
    @Column( name = "state" )
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Basic
    @Column( name = "updater" )
    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    @Basic
    @Column( name = "updatime" )
    public Timestamp getUpdatime() {
        return updatime;
    }

    public void setUpdatime(Timestamp updatime) {
        this.updatime = updatime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LzPurchaseSupplierEntity that = (LzPurchaseSupplierEntity) o;
        return id == that.id && state == that.state && Objects.equals(name, that.name) && Objects.equals(linkman, that.linkman) && Objects.equals(mobile, that.mobile) && Objects.equals(address, that.address) && Objects.equals(descs, that.descs) && Objects.equals(updater, that.updater) && Objects.equals(updatime, that.updatime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, linkman, mobile, address, descs, state, updater, updatime);
    }
}
