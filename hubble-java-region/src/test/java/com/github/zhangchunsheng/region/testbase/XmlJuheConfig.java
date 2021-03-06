package com.github.zhangchunsheng.region.testbase;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import me.zhangchunsheng.hubble.common.config.JuheConfig;

/**
 * The type Xml juhe config.
 */
@XStreamAlias("xml")
public class XmlJuheConfig extends JuheConfig {
    private String key;

    /**
     * Gets openid.
     *
     * @return the openid
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets openid.
     *
     * @param openid the openid
     */
    public void setKey(String openid) {
        this.key = key;
    }

}
