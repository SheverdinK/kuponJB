package dataSet;

import java.util.Date;

/**
 * Created by Kostya on 22.11.2015.
 */
public class CouponDataSet {
    private long id;
    private String title, message, imageURL;
    private Date startDate, endDate;
    private int amount;
    private double price;
    CouponType type;

    public CouponDataSet() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString () {
        return "CouponDataSet { " +
                "  id= "         + id       +
                ",  title=' "    + title    + '\'' +
                ",  message=' "  + message  + '\'' +
                ",  imageURL=' " + imageURL + '\'' +
                ",  startDate= " + startDate+
                ",  endDate= "   + endDate  +
                ",  amount= "    + amount   +
                ",  price= "     + price    +
                ",  type= "      + type     +
                '}';
    }
}
