package ThreadLocal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


/**
 * @author wangqianlong
 * @create 2019-04-24 15:45
 */

public class SimpleFormatTest {
    //jdk8 线程安全
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");


    //jdk8 之前SimpleDateFormat要用ThreadLocal
    static ThreadLocal<DateFormat> threadLocal = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String FormatDate(Date date) {
       /* try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        //System.out.println(simpleDateFormat.format(date));
       // System.out.println(threadLocal.get().format(date));
        return threadLocal.get().format(date);

    }

    public void parse(String date) {
     /*   try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        try {
            //System.out.println(simpleDateFormat.parse("2020-04-16 13:01:01"));
            System.out.println(threadLocal.get().parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        SimpleFormatTest formatTest = new SimpleFormatTest();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int i=0;i<10000;i++) {
            executor.execute(() -> {
                String s= formatTest.FormatDate(new Date());
                formatTest.parse(s);
            });
        }
    }


}
