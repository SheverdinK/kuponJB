package dataSet;

import java.util.List;

/**
 * Created by Kostya on 22.11.2015.
 */
public class CompanyDataSet {
  private long id;
  private String compName, password, email;
  private List <CouponDataSet> couponList;

    public CompanyDataSet() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<CouponDataSet> getCouponList() {
        return couponList;
    }

    public void setCouponList(List<CouponDataSet> couponList) {
        this.couponList = couponList;
    }

    @Override
    public String toString () {
        return "CompanyDataSet { " +
                "id= " + id +
                ", compName=' "  + compName   + '\'' +
                ", password=' "  + password   + '\'' +
                ", email=' "     + email      + '\'' +
                ", couponList= " + couponList +
                '}';
    }
}
