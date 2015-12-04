package dao;

import dataSet.CompanyDataSet;
import daoInterface.CompanyDaoI;
import dataSet.CouponDataSet;

import java.util.List;

/**
 * Created by Kostya on 22.11.2015.
 */
public class CompanyDBDAO  implements CompanyDaoI {
    public boolean login (String compName, String password) {
        return false;
    }

    public CompanyDataSet getCompany (long id) {
        return null;
    }

    public void createCompany (CompanyDataSet company) {

    }

    public void removeCompany (CompanyDataSet company) {

    }

    public void updateCompany (CompanyDataSet company) {

    }

    public List<CouponDataSet> getCouponlist () {
        return null;
    }

    public List<CompanyDataSet> getAllCompaniesList () {
        return null;
    }
}
