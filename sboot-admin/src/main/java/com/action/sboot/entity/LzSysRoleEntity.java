package com.action.sboot.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table( name = "lz_sys_role", schema = "mini_wx", catalog = "" )
public class LzSysRoleEntity {
    private int id;
    private String name;
    private String code;
    private String descs;
    private String menuIds;
    private String menuNames;
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
    @Column( name = "code" )
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
    @Column( name = "menuIds" )
    public String getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(String menuIds) {
        this.menuIds = menuIds;
    }

    @Basic
    @Column( name = "menuNames" )
    public String getMenuNames() {
        return menuNames;
    }

    public void setMenuNames(String menuNames) {
        this.menuNames = menuNames;
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
        LzSysRoleEntity that = (LzSysRoleEntity) o;
        return id == that.id && state == that.state && Objects.equals(name, that.name) && Objects.equals(code, that.code) && Objects.equals(descs, that.descs) && Objects.equals(menuIds, that.menuIds) && Objects.equals(menuNames, that.menuNames) && Objects.equals(updater, that.updater) && Objects.equals(updatime, that.updatime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, code, descs, menuIds, menuNames, state, updater, updatime);
    }
}
