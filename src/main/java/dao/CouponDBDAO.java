package dao;

import dataSet.CompanyDataSet;
import dataSet.CouponDataSet;
import daoInterface.CouponDaoI;

import java.util.List;

/**
 * Created by Kostya on 22.11.2015.
 */
public class CouponDBDAO  implements CouponDaoI {
    public CouponDataSet getCoupon (long id) {
        return null;
    }

    public void creatCoupon (CompanyDataSet company) {

    }

    public void removeCoupon (CompanyDataSet company) {

    }

    public void updateCoupon (CompanyDataSet company) {

    }

    public List<CouponDataSet> getCouponByType () {
        return null;
    }

    public List<CouponDataSet> getAllCouponlist () {
        return null;
    }
}
