package test;

/**
 * Created by frank on 11/05/2017.
 */
public class ForeachTest {
    public static void main(String[] args) {
        int pageSize = 16;
        int size = 0;
        int pageNum = (size - 1) / pageSize + 1;
        for (int i = 0; i < pageNum; i++) {
            System.out.println(i);
        }
    }
}
