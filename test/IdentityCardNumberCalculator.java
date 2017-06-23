package test;

/**
 * Created by frank on 23/06/2017.
 */
public class IdentityCardNumberCalculator {
    /**
     * 系数，共17位
     */
    private static int[] coefficient = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
    /**
     * 结果集，共11种
     */
    private static String[][] resultSet = {{"0","1"}, {"1","0"},{"2","X"}, {"3","9"},{"4","8"},{"5","7"},
                            {"6","6"},{"7","5"},{"8","4"},{"9","3"},{"10","2"}};

    /**
     * 从前17位计算第18位
     * @param identityCardNumber
     * @return
     */
    public static String calculate(String identityCardNumber){
        //求和
        Integer sum = 0;
        //遍历前17位数字
        for (int i = 0; i < 17; i++){
            //取当前位
            Integer currentValue = Integer.parseInt(identityCardNumber.substring(i,i+1));
            //相乘并累加
            sum = sum + currentValue * coefficient[i];
        }
        //取余
        Integer remainder = sum % 11;
        //遍历结果集
        for (int i = 0; i < resultSet.length;i++){
            //用余数和结果集第一位进行比较
            if (resultSet[i][0].equals(remainder.toString())){
                //返回结果集第二位，即计算出来的第18位
                return resultSet[i][0];
            }
        }
        return "No result!";
    }

    //测试
    public static void main(String[] args) {
        System.out.println(calculate("111111111111111111"));
    }
}
