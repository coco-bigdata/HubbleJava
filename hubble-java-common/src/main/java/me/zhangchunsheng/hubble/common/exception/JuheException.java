package me.zhangchunsheng.hubble.common.exception;

import com.google.common.base.Joiner;
import lombok.Data;
import lombok.EqualsAndHashCode;
import me.zhangchunsheng.hubble.common.bean.result.BaseJuheResult;

/**
 * <pre>
 * 聚合数据异常结果类
 * Created by Chunsheng Zhang on 2020-4-20.
 * </pre>
 *
 * @author ChunshengZhang
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class JuheException extends Exception {
    private static final long serialVersionUID = 2214381471513460742L;

    /**
     * 自定义错误讯息.
     */
    private String customErrorMsg;
    /**
     * 返回状态码.
     */
    private int errorCode;
    /**
     * 返回信息.
     */
    private String reason;

    /**
     * 业务结果.
     */
    private String resultcode;

    /**
     * Instantiates a new Juhe exception.
     *
     * @param customErrorMsg the custom error msg
     */
    public JuheException(String customErrorMsg) {
        super(customErrorMsg);
        this.customErrorMsg = customErrorMsg;
    }

    /**
     * Instantiates a new Juhe exception.
     *
     * @param customErrorMsg the custom error msg
     * @param tr             the tr
     */
    public JuheException(String customErrorMsg, Throwable tr) {
        super(customErrorMsg, tr);
        this.customErrorMsg = customErrorMsg;
    }

    private JuheException(Builder builder) {
        super(builder.buildErrorMsg());
        errorCode = builder.errorCode;
        reason = builder.reason;
        resultcode = builder.resultcode;
    }

    /**
     * 通过BaseJuheResult生成异常对象.
     *
     * @param baseResult the base result
     * @return the juhe exception
     */
    public static JuheException from(BaseJuheResult baseResult) {
        return JuheException.newBuilder()
                .errorCode(baseResult.getErrorCode())
                .reason(baseResult.getReason())
                .resultcode(baseResult.getResultcode())
                .build();
    }

    /**
     * New builder builder.
     *
     * @return the builder
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * The type Builder.
     */
    public static final class Builder {
        private int errorCode;
        private String reason;
        private String resultcode;

        private Builder() {
        }

        /**
         * Return status builder.
         *
         * @param errorCode the return status
         * @return the builder
         */
        public Builder errorCode(int errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Return info builder.
         *
         * @param reason the return info
         * @return the builder
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Result code builder.
         *
         * @param resultcode the result code
         * @return the builder
         */
        public Builder resultcode(String resultcode) {
            this.resultcode = resultcode;
            return this;
        }

        /**
         * Build juhe exception.
         *
         * @return the juhe exception
         */
        public JuheException build() {
            return new JuheException(this);
        }

        /**
         * Build error msg string.
         *
         * @return the string
         */
        public String buildErrorMsg() {
            return Joiner.on("，").skipNulls().join(
                    String.format("返回代码：[%s]", errorCode),
                    reason == null ? null : String.format("返回信息：[%s]", reason),
                    resultcode == null ? null : String.format("结果代码：[%s]", resultcode)
            );
        }
    }
}
