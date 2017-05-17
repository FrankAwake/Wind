package test;

import java.util.regex.Pattern;

/**
 * Created by frank on 16/05/2017.
 */
public class RegexTest {
    private static final String CHINESE_CHARACTER_REGEX = "^[^\\u4e00-\\u9fa5]{0,}$"; //有中文的正则

    public static void main(String[] args) {
        boolean matchResult = Pattern.matches(CHINESE_CHARACTER_REGEX, "123.1_+_#+@!($(!@");
        System.out.println(matchResult);
    }
}
