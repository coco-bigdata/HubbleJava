package com.github.zhangchunsheng.region.bean.result;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import me.zhangchunsheng.hubble.common.util.json.JuheGsonBuilder;

import java.io.Serializable;

@Data
public class MobileCity implements Serializable {
    private static final long serialVersionUID = -1070939403109776555L;
    @SerializedName("province")
    private String province;

    @SerializedName("city")
    private String city;

    @SerializedName("areacode")
    private String areacode;

    @SerializedName("zip")
    private String zip;

    @SerializedName("company")
    private String company;

    @SerializedName("card")
    private Object card;

    @Override
    public String toString() {
        return JuheGsonBuilder.create().toJson(this);
    }
}