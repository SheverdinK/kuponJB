package daoInterface;

import dataSet.CouponDataSet;
import dataSet.CustomerDataSet;

import java.util.List;

/**
 * Created by sheverdinK on 22.11.2015.
 */
public interface CustomerDaoI {

    boolean         login               (String custName, String password);
    CustomerDataSet getCustomer         (long id);
    void            creatCustomer       (CustomerDataSet customer);
    void            removeCustomer      (CustomerDataSet customer);
    void            updateCustomer      (CustomerDataSet customer);
    List <CouponDataSet>   getCouponList       ();
    List <CustomerDataSet> getAllCustomersList ();
}
