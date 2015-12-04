package dao;

import dataSet.CustomerDataSet;
import daoInterface.CustomerDaoI;
import dataSet.CouponDataSet;

import java.util.List;

/**
 * Created by Kostya on 22.11.2015.
 */
public class CustomerDBDAO implements CustomerDaoI {
    public boolean login (String custName, String password) {
        return false;
    }

    public CustomerDataSet getCustomer (long id) {
        return null;
    }

    public void creatCustomer (CustomerDataSet customer) {

    }

    public void removeCustomer (CustomerDataSet customer) {

    }

    public void updateCustomer (CustomerDataSet customer) {

    }

    public List<CouponDataSet> getCouponList () {
        return null;
    }

    public List<CustomerDataSet> getAllCustomersList () {
        return null;
    }
}
