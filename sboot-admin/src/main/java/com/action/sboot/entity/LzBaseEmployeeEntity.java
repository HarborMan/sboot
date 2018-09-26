package com.action.sboot.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table( name = "lz_base_employee", schema = "mini_wx", catalog = "" )
public class LzBaseEmployeeEntity {
    private int id;
    private String name;
    private String code;
    private String idCard;
    private String mobile;
    private Integer sex;
    private Date birthday;
    private String address;
    private String email;
    private String type;
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
    @Column( name = "idCard" )
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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
    @Column( name = "sex" )
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Basic
    @Column( name = "birthday" )
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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
    @Column( name = "email" )
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column( name = "type" )
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        LzBaseEmployeeEntity that = (LzBaseEmployeeEntity) o;
        return id == that.id && state == that.state && Objects.equals(name, that.name) && Objects.equals(code, that.code) && Objects.equals(idCard, that.idCard) && Objects.equals(mobile, that.mobile) && Objects.equals(sex, that.sex) && Objects.equals(birthday, that.birthday) && Objects.equals(address, that.address) && Objects.equals(email, that.email) && Objects.equals(type, that.type) && Objects.equals(updater, that.updater) && Objects.equals(updatime, that.updatime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, code, idCard, mobile, sex, birthday, address, email, type, updater, updatime, state);
    }
}
