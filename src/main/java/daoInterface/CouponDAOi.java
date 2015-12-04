package daoInterface;

import dataSet.CompanyDataSet;
import dataSet.CouponDataSet;

import java.util.List;

/**
 * Created by Kostya on 22.11.2015.
 */
public interface CouponDaoI {
    CouponDataSet getCoupon        (long id);
    @SuppressWarnings ("EmptyMethod")
    void          creatCoupon      (CompanyDataSet company);
    void          removeCoupon     (CompanyDataSet company);
    void          updateCoupon     (CompanyDataSet company);
    List <CouponDataSet> getCouponByType  ();
    List <CouponDataSet> getAllCouponlist ();
}
