package me.zhangchunsheng.hubble.common.service;

import me.zhangchunsheng.hubble.common.config.JuheConfig;
import me.zhangchunsheng.hubble.common.exception.JuheException;

/**
 * <pre>
 * 聚合数据
 * Created by Chunsheng Zhang on 2020/9/22.
 *
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
public interface JuheService {

    /**
     * 获取聚合数据请求url前缀
     *
     * @return the juhe base url
     */
    String getBaseUrl();

    public JuheConfig getConfig();

    public void setConfig(JuheConfig config);

    public byte[] postForBytes(String url, String requestStr) throws JuheException;

    public String post(String url, String requestStr) throws JuheException;

    public String get(String url) throws JuheException;

}
