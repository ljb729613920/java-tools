package utils;

import java.util.*;
import java.util.function.Function;

public class StringUtils extends org.apache.commons.lang3.StringUtils{
    public static final String DEF_ENCODING = "utf-8";

    private static final String CHARSET_NAME = "UTF-8";

    /**
     * 把按逗号分隔的字符串转变为列表，同时会进行去重复，去空处理
     * 如："123,441,3242"转为[123,441,3242]
     *
     * @param target   目标字符串
     * @param function 实现类型转换
     * @param <T>      返回List中的元素类型
     * @return 分隔后的列表
     */
    public static List<String> splitCommaToList(String target) {
        return splitCommaToList(target, s -> s);
    }

    public static <T> List<T> splitCommaToList(String target, Function<String, T> function) {
        if (function == null) {
            throw new NullPointerException();
        }
        if (StringUtils.isNotEmpty(target)) {
            Set<String> temp = new HashSet<>(Arrays.asList(target.split(",")));
            List<T> result = new ArrayList<>(temp.size());
            for (String str : temp) {
                if (!"".equals(str)) {
                    result.add(function.apply(str));
                }
            }
            return result;
        } else {
            return Collections.emptyList();
        }
    }
}
