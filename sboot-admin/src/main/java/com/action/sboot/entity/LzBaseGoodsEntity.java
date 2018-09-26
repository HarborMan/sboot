package com.action.sboot.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table( name = "lz_base_goods", schema = "mini_wx", catalog = "" )
public class LzBaseGoodsEntity {
    private int id;
    private String name;
    private String code;
    private String type;
    private String brand;
    private String unit;
    private String color;
    private String standard;
    private String material;
    private String buyPrice;
    private String salePrice;
    private String descs;
    private String updater;
    private Timestamp updatime;
    private int state;
    private String picture;

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
    @Column( name = "type" )
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column( name = "brand" )
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column( name = "unit" )
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column( name = "color" )
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column( name = "standard" )
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    @Basic
    @Column( name = "material" )
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Basic
    @Column( name = "buyPrice" )
    public String getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(String buyPrice) {
        this.buyPrice = buyPrice;
    }

    @Basic
    @Column( name = "salePrice" )
    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
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
    @Column( name = "picture" )
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LzBaseGoodsEntity that = (LzBaseGoodsEntity) o;
        return id == that.id && state == that.state && Objects.equals(name, that.name) && Objects.equals(code, that.code) && Objects.equals(type, that.type) && Objects.equals(brand, that.brand) && Objects.equals(unit, that.unit) && Objects.equals(color, that.color) && Objects.equals(standard, that.standard) && Objects.equals(material, that.material) && Objects.equals(buyPrice, that.buyPrice) && Objects.equals(salePrice, that.salePrice) && Objects.equals(descs, that.descs) && Objects.equals(updater, that.updater) && Objects.equals(updatime, that.updatime) && Objects.equals(picture, that.picture);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, code, type, brand, unit, color, standard, material, buyPrice, salePrice, descs, updater, updatime, state, picture);
    }
}
