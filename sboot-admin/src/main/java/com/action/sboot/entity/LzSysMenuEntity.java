package com.action.sboot.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table( name = "lz_sys_menu", schema = "mini_wx", catalog = "" )
public class LzSysMenuEntity {
    private int id;
    private String name;
    private int upId;
    private String path;
    private int isLeaf;
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
    @Column( name = "upId" )
    public int getUpId() {
        return upId;
    }

    public void setUpId(int upId) {
        this.upId = upId;
    }

    @Basic
    @Column( name = "path" )
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column( name = "isLeaf" )
    public int getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(int isLeaf) {
        this.isLeaf = isLeaf;
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
        LzSysMenuEntity that = (LzSysMenuEntity) o;
        return id == that.id && upId == that.upId && isLeaf == that.isLeaf && state == that.state && Objects.equals(name, that.name) && Objects.equals(path, that.path) && Objects.equals(updater, that.updater) && Objects.equals(updatime, that.updatime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, upId, path, isLeaf, state, updater, updatime);
    }
}
