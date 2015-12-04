package dataSet;

import java.util.List;

/**
 * Created by Kostya on 22.11.2015.
 */
public class CustomerDataSet {
    private long id;
    private String custName, password;
    private List<CouponDataSet> couponList;

    public CustomerDataSet() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<CouponDataSet> getCouponList() {
        return couponList;
    }

    public void setCouponList(List<CouponDataSet> couponList) {
        this.couponList = couponList;
    }

    @Override
    public String toString () {
        return "CustomerDataSet{ " +
                " id= "          + id          +
                ", custName= "   + custName    + '\'' +
                ", password=' "  + password    + '\'' +
                ", couponList= " + couponList  +
                '}';
    }
}
