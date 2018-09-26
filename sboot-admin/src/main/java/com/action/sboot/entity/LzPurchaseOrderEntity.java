package com.action.sboot.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table( name = "lz_purchase_order", schema = "mini_wx", catalog = "" )
public class LzPurchaseOrderEntity {
    private int id;
    private Integer goodsId;
    private Integer supplierId;
    private String supplierName;
    private Integer repoId;
    private String orderNumber;
    private Integer count;
    private BigDecimal unitPrice;
    private BigDecimal totalPrice;
    private Integer employeeId;
    private String descs;
    private Integer checkState;
    private String checkResult;
    private String checkAccount;
    private Timestamp checktime;
    private Timestamp taketime;
    private String creater;
    private Timestamp creatime;
    private String updater;
    private Timestamp updatime;
    private Integer state;
    private int type;

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
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column( name = "supplierId" )
    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    @Basic
    @Column( name = "supplierName" )
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    @Basic
    @Column( name = "repoId" )
    public Integer getRepoId() {
        return repoId;
    }

    public void setRepoId(Integer repoId) {
        this.repoId = repoId;
    }

    @Basic
    @Column( name = "orderNumber" )
    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Basic
    @Column( name = "count" )
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Basic
    @Column( name = "unitPrice" )
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column( name = "totalPrice" )
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
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
    @Column( name = "descs" )
    public String getDescs() {
        return descs;
    }

    public void setDescs(String descs) {
        this.descs = descs;
    }

    @Basic
    @Column( name = "checkState" )
    public Integer getCheckState() {
        return checkState;
    }

    public void setCheckState(Integer checkState) {
        this.checkState = checkState;
    }

    @Basic
    @Column( name = "checkResult" )
    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    @Basic
    @Column( name = "checkAccount" )
    public String getCheckAccount() {
        return checkAccount;
    }

    public void setCheckAccount(String checkAccount) {
        this.checkAccount = checkAccount;
    }

    @Basic
    @Column( name = "checktime" )
    public Timestamp getChecktime() {
        return checktime;
    }

    public void setChecktime(Timestamp checktime) {
        this.checktime = checktime;
    }

    @Basic
    @Column( name = "taketime" )
    public Timestamp getTaketime() {
        return taketime;
    }

    public void setTaketime(Timestamp taketime) {
        this.taketime = taketime;
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
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column( name = "type" )
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LzPurchaseOrderEntity that = (LzPurchaseOrderEntity) o;
        return id == that.id && type == that.type && Objects.equals(goodsId, that.goodsId) && Objects.equals(supplierId, that.supplierId) && Objects.equals(supplierName, that.supplierName) && Objects.equals(repoId, that.repoId) && Objects.equals(orderNumber, that.orderNumber) && Objects.equals(count, that.count) && Objects.equals(unitPrice, that.unitPrice) && Objects.equals(totalPrice, that.totalPrice) && Objects.equals(employeeId, that.employeeId) && Objects.equals(descs, that.descs) && Objects.equals(checkState, that.checkState) && Objects.equals(checkResult, that.checkResult) && Objects.equals(checkAccount, that.checkAccount) && Objects.equals(checktime, that.checktime) && Objects.equals(taketime, that.taketime) && Objects.equals(creater, that.creater) && Objects.equals(creatime, that.creatime) && Objects.equals(updater, that.updater) && Objects.equals(updatime, that.updatime) && Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, goodsId, supplierId, supplierName, repoId, orderNumber, count, unitPrice, totalPrice, employeeId, descs, checkState, checkResult, checkAccount, checktime, taketime, creater, creatime, updater, updatime, state, type);
    }
}
