package me.zhangchunsheng.hubble.common.service.impl;

import me.zhangchunsheng.hubble.common.bean.JuheApiData;
import me.zhangchunsheng.hubble.common.config.JuheConfig;
import me.zhangchunsheng.hubble.common.service.JuheService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <pre>
 *  聚合数据接口请求抽象实现类
 *  Created by Chunsheng Zhang on 2020/9/22.
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
public abstract class BaseServiceImpl implements JuheService {
    /**
     * The Log.
     */
    final Logger log = LoggerFactory.getLogger(this.getClass());
    /**
     * The constant juheApiData.
     */
    static ThreadLocal<JuheApiData> juheApiData = new ThreadLocal<>();

    /**
     * The Config.
     */
    protected JuheConfig config;

    @Override
    public JuheConfig getConfig() {
        return this.config;
    }

    @Override
    public void setConfig(JuheConfig config) {
        this.config = config;
    }

    @Override
    public String getBaseUrl() {
        return this.getConfig().getBaseUrl();
    }
}
