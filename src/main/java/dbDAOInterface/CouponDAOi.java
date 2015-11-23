package dbDAOInterface;

import javaBeans.Company;
import javaBeans.Coupon;

import java.util.List;

/**
 * Created by Kostya on 22.11.2015.
 */
public interface CouponDAOi {
    Coupon        getCoupon        (long id);
    @SuppressWarnings ("EmptyMethod")
    void          creatCoupon      (Company company);
    void          removeCoupon     (Company company);
    void          updateCoupon     (Company company);
    List <Coupon> getCouponByType  ();
    List <Coupon> getAllCouponlist ();
}
