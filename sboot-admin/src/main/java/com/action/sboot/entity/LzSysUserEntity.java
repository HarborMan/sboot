package com.action.sboot.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table( name = "lz_sys_user", schema = "mini_wx", catalog = "" )
public class LzSysUserEntity {
    private int id;
    private String account;
    private String password;
    private Integer roleId;
    private String roleName;
    private Integer employeeId;
    private String updater;
    private Timestamp updatime;
    private int state;
    private Integer isLocked;
    private Timestamp lockTime;

    @Id
    @Column( name = "id" )
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column( name = "account" )
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column( name = "password" )
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column( name = "roleId" )
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column( name = "roleName" )
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column( name = "employeeId" )
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
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

    @Basic
    @Column( name = "isLocked" )
    public Integer getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Integer isLocked) {
        this.isLocked = isLocked;
    }

    @Basic
    @Column( name = "lockTime" )
    public Timestamp getLockTime() {
        return lockTime;
    }

    public void setLockTime(Timestamp lockTime) {
        this.lockTime = lockTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LzSysUserEntity that = (LzSysUserEntity) o;
        return id == that.id && state == that.state && Objects.equals(account, that.account) && Objects.equals(password, that.password) && Objects.equals(roleId, that.roleId) && Objects.equals(roleName, that.roleName) && Objects.equals(employeeId, that.employeeId) && Objects.equals(updater, that.updater) && Objects.equals(updatime, that.updatime) && Objects.equals(isLocked, that.isLocked) && Objects.equals(lockTime, that.lockTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, account, password, roleId, roleName, employeeId, updater, updatime, state, isLocked, lockTime);
    }
}
