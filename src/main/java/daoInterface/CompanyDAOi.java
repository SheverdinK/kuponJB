package daoInterface;

import dataSet.CompanyDataSet;
import dataSet.CouponDataSet;

import java.util.List;

/**
 * Created by Kostya on 22.11.2015.
 */
@SuppressWarnings ("ALL")
public interface CompanyDaoI {

    boolean        login               (String  compName, String password);
    CompanyDataSet getCompany          (long id);
    void           createCompany        (CompanyDataSet company);
    void           removeCompany       (CompanyDataSet company);
    void           updateCompany       (CompanyDataSet company);
    List <CouponDataSet>  getCouponlist       ();
    List <CompanyDataSet> getAllCompaniesList ();

}
