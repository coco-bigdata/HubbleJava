package com.github.zhangchunsheng.region.bean.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import me.zhangchunsheng.hubble.common.bean.result.BaseJuheResult;
import me.zhangchunsheng.hubble.common.util.json.JuheGsonBuilder;

import java.util.List;

/**
 * <pre>
 * 结果对象类
 * Created by Chunsheng Zhang on 2020/9/22.
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MobileCityResult extends BaseJuheResult {
    private static final long serialVersionUID = -7083914585539687746L;

    @SerializedName("result")
    private MobileCity result;

    public static MobileCityResult fromJson(String json) {
        return JuheGsonBuilder.create().fromJson(json, MobileCityResult.class);
    }

    @Override
    public String toString() {
        return JuheGsonBuilder.create().toJson(this);
    }

}
