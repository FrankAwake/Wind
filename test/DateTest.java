package test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by frank on 09/03/2017.
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        System.out.println(sdf.format(date).toString());
    }
}
