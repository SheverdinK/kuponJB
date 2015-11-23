package dbDAOInterface;

import javaBeans.Coupon;
import javaBeans.Customer;

import java.util.List;

/**
 * Created by sheverdinK on 22.11.2015.
 */
public interface CustomerDAOi {

    boolean         login               (String custName, String password);
    Customer        getCustomer         (long id);
    void            creatCustomer       (Customer customer);
    void            removeCustomer      (Customer customer);
    void            updateCustomer      (Customer customer);
    List <Coupon>   getCouponList       ();
    List <Customer> getAllCustomersList ();
}
