package Manage;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Guest {
    String fullName;
    Date date;
    int IdNumberGust;

    public Guest() {
    }

    public Guest(String fullName, Date date, int idNumberGust) {
        this.fullName = fullName;
        this.date = date;
        this.IdNumberGust = idNumberGust;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdNumberGust() {
        return IdNumberGust;
    }

    public void setIdNumberGust(int idNumberGust) {
        IdNumberGust = idNumberGust;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Guest: " +
                "fullName: " + getFullName() +
                ", Date: " +dateFormat.format(getDate()) +
                ", IdNumberGust: " + getIdNumberGust()
                ;
    }
}
