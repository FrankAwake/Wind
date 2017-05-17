package test;

import java.util.ArrayList;
import java.util.List;

/**
 * List相关工具类
 * Created by dingyy on 13/04/2017.
 */
public class TaxListUtils {
    /**
     * 将list按照eachPartSize分割成多个list
     * @param list 被分割的list
     * @param eachPartSize 每个部分的长度
     * @return
     */
    public static <T> List<List<T>> subList(List<T> list, Integer eachPartSize){
        //返回结果集
        List<List<T>> resultList = new ArrayList<>();
        //检查入参，list不可以为空
        if (isEmpty(list)){
            return resultList;
        }
        //检查入参，每个子list的长度不可以小于或等于0
        if (eachPartSize <= 0){
            return resultList;
        }
        Integer listSize = list.size();
        //开始分割
        for (int i = 0; i < listSize; i = i + eachPartSize) {
            //每一段的结束位置
            Integer endIndex = i + eachPartSize;
            if (endIndex > listSize) {
                //结束位置不能大于母List的长度
                endIndex = listSize;
            }
            List<T> subList = list.subList(i, endIndex);
            //加入到结果集
            resultList.add(subList);
        }
        //返回
        return resultList;
    }

    /**
     * 判断一个List是否为空
     * @param list
     * @param <T>
     * @return
     */
    private static <T> boolean isEmpty(List<T> list) {
        if (null == list || list.size() == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0 ; i < 102; i++){
            integerList.add(i);
        }
        List<List<Integer>> subIntegetList = subList(integerList, 100);
        for (List<Integer> list : subIntegetList){
            System.out.println("=============================");
            for (Integer integer : list){
                System.out.println(integer);
            }
        }
    }
}
