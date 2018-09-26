package com.action.sboot.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table( name = "lz_base_repo", schema = "mini_wx", catalog = "" )
public class LzBaseRepoEntity {
    private int id;
    private String name;
    private String code;
    private String address;
    private String descs;
    private Integer adminId;
    private String updater;
    private Timestamp updatime;
    private int state;

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
    @Column( name = "code" )
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
    @Column( name = "adminId" )
    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
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

    @Basic
    @Column( name = "state" )
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LzBaseRepoEntity that = (LzBaseRepoEntity) o;
        return id == that.id && state == that.state && Objects.equals(name, that.name) && Objects.equals(code, that.code) && Objects.equals(address, that.address) && Objects.equals(descs, that.descs) && Objects.equals(adminId, that.adminId) && Objects.equals(updater, that.updater) && Objects.equals(updatime, that.updatime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, code, address, descs, adminId, updater, updatime, state);
    }
}
