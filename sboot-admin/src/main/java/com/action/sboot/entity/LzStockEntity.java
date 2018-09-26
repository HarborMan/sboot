package com.action.sboot.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table( name = "lz_stock", schema = "mini_wx", catalog = "" )
public class LzStockEntity {
    private int id;
    private int goodsId;
    private int repoId;
    private Integer totalCount;
    private Integer saleCount;
    private BigDecimal buyPrice;
    private BigDecimal avgBuyPrice;
    private BigDecimal salePrice;
    private BigDecimal totalBuyPrice;
    private BigDecimal totalSalePrice;
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
    @Column( name = "goodsId" )
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column( name = "repoId" )
    public int getRepoId() {
        return repoId;
    }

    public void setRepoId(int repoId) {
        this.repoId = repoId;
    }

    @Basic
    @Column( name = "totalCount" )
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Basic
    @Column( name = "saleCount" )
    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    @Basic
    @Column( name = "buyPrice" )
    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    @Basic
    @Column( name = "avgBuyPrice" )
    public BigDecimal getAvgBuyPrice() {
        return avgBuyPrice;
    }

    public void setAvgBuyPrice(BigDecimal avgBuyPrice) {
        this.avgBuyPrice = avgBuyPrice;
    }

    @Basic
    @Column( name = "salePrice" )
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    @Basic
    @Column( name = "totalBuyPrice" )
    public BigDecimal getTotalBuyPrice() {
        return totalBuyPrice;
    }

    public void setTotalBuyPrice(BigDecimal totalBuyPrice) {
        this.totalBuyPrice = totalBuyPrice;
    }

    @Basic
    @Column( name = "totalSalePrice" )
    public BigDecimal getTotalSalePrice() {
        return totalSalePrice;
    }

    public void setTotalSalePrice(BigDecimal totalSalePrice) {
        this.totalSalePrice = totalSalePrice;
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
        LzStockEntity that = (LzStockEntity) o;
        return id == that.id && goodsId == that.goodsId && repoId == that.repoId && state == that.state && Objects.equals(totalCount, that.totalCount) && Objects.equals(saleCount, that.saleCount) && Objects.equals(buyPrice, that.buyPrice) && Objects.equals(avgBuyPrice, that.avgBuyPrice) && Objects.equals(salePrice, that.salePrice) && Objects.equals(totalBuyPrice, that.totalBuyPrice) && Objects.equals(totalSalePrice, that.totalSalePrice) && Objects.equals(updatime, that.updatime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, goodsId, repoId, totalCount, saleCount, buyPrice, avgBuyPrice, salePrice, totalBuyPrice, totalSalePrice, updatime, state);
    }
}
