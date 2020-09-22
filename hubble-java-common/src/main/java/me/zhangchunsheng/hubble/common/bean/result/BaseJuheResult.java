package me.zhangchunsheng.hubble.common.bean.result;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;
import me.zhangchunsheng.hubble.common.util.json.JuheGsonBuilder;
import org.apache.commons.lang3.StringUtils;

import lombok.Data;

/**
 * <pre>
 * 聚合数据结果共用属性类.
 * Created by Chunsheng Zhang on 2020/9/22.
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
@Data
public abstract class BaseJuheResult implements Serializable {
    private static final long serialVersionUID = 2101652152604850904L;
    protected String resultcode;
    protected String reason;
    @SerializedName("error_code")
    protected int errorCode;

    /**
     * 请求是否成功.
     */
    public boolean isSuccess() {
        return errorCode == 0;
    }

    public static BaseJuheResult fromJson(String json) {
        return JuheGsonBuilder.create().fromJson(json, BaseJuheResult.class);
    }

    @Override
    public String toString() {
        return JuheGsonBuilder.create().toJson(this);
    }
}
