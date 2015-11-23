package dbDAO;

import dbDAOInterface.CompanyDAOi;
import javaBeans.Company;
import javaBeans.Coupon;

import java.util.List;

/**
 * Created by Kostya on 22.11.2015.
 */
public class CompanyDBDAO  implements CompanyDAOi{
    public boolean login (String compName, String password) {
        return false;
    }

    public Company getCompany (long id) {
        return null;
    }

    public void creatCompany (Company company) {

    }

    public void removeCompany (Company company) {

    }

    public void updateCompany (Company company) {

    }

    public List<Coupon> getCouponlist () {
        return null;
    }

    public List<Company> getAllCompaniesList () {
        return null;
    }
}
