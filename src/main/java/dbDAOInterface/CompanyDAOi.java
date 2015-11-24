package dbDAOInterface;

import javaBeans.Company;
import javaBeans.Coupon;

import java.util.List;

/**
 * Created by Kostya on 22.11.2015.
 */
@SuppressWarnings ("ALL")
public interface CompanyDAOi {

    boolean        login               (String  compName, String password);
    Company getCompany          (long id);
    void           createCompany        (Company company);
    void           removeCompany       (Company company);
    void           updateCompany       (Company company);
    List <Coupon>  getCouponlist       ();
    List <Company> getAllCompaniesList ();

}
