package dbDAO;

import dbDAOInterface.CustomerDAOi;
import javaBeans.Coupon;
import javaBeans.Customer;

import java.util.List;

/**
 * Created by Kostya on 22.11.2015.
 */
public class CustomerDBDAO implements CustomerDAOi {
    public boolean login (String custName, String password) {
        return false;
    }

    public Customer getCustomer (long id) {
        return null;
    }

    public void creatCustomer (Customer customer) {

    }

    public void removeCustomer (Customer customer) {

    }

    public void updateCustomer (Customer customer) {

    }

    public List<Coupon> getCouponList () {
        return null;
    }

    public List<Customer> getAllCustomersList () {
        return null;
    }
}
