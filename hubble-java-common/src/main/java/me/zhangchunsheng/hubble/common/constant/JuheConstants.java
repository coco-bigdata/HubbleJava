package me.zhangchunsheng.hubble.common.constant;

/**
 * <pre>
 * 聚合数据常量类
 * Created by Chunsheng Zhang on 2020/9/22.
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
public class JuheConstants {

    /**
     * 结果代码.
     */
    public static class ResultCode {
        /**
         * 成功.
         */
        public static final String SUCCESS = "200";

        /**
         * 失败.
         */
        public static final String FAIL = "0";
    }

    public static class Url {
        public static final String MOBILE_CITY = "/mobile/get?phone=%s&dtype=json&key=%s";
    }
}
