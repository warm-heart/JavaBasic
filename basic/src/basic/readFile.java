package basic;

import java.io.*;

/**
 * @author wangqianlong
 * @create 2019-11-28 18:50
 */

public class readFile {

    public int da() {
        File file = new File("E:\\demo.txt");
        try {
            InputStream inputStream = new FileInputStream(file);
            return 1;
        } catch (FileNotFoundException e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {

        File file = new File("E:\\demo.txt");

        try {
            //字节流
            InputStream inputStream = new FileInputStream(file);
            byte[] buf = new byte[1024]; //1k大小

            int length = 0;
            while ((length = inputStream.read(buf)) != -1) {

                System.out.print(new String(buf, 0, length));

            }
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("jisajfkjdsh");


    }
}
