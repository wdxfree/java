package study.reflect;

import java.util.Date;

/**
 * @Author
 */
public class genericClassImpl  implements genericApi{
    private Date date;


    public genericClassImpl(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "genericClassImpl{" +
                "date=" + date +
                '}';
    }
}
