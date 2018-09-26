package com.action.sboot.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table( name = "lz_base_param", schema = "mini_wx", catalog = "" )
public class LzBaseParamEntity {
    private int id;
    private String name;
    private String descs;
    private int state;
    private String type;
    private String creater;
    private Timestamp creatime;

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
    @Column( name = "type" )
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column( name = "creater" )
    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    @Basic
    @Column( name = "creatime" )
    public Timestamp getCreatime() {
        return creatime;
    }

    public void setCreatime(Timestamp creatime) {
        this.creatime = creatime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LzBaseParamEntity that = (LzBaseParamEntity) o;
        return id == that.id && state == that.state && Objects.equals(name, that.name) && Objects.equals(descs, that.descs) && Objects.equals(type, that.type) && Objects.equals(creater, that.creater) && Objects.equals(creatime, that.creatime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, descs, state, type, creater, creatime);
    }
}
