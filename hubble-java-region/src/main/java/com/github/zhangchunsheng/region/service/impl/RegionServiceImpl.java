package com.github.zhangchunsheng.region.service.impl;

import com.github.zhangchunsheng.region.bean.result.MobileCity;
import com.github.zhangchunsheng.region.bean.result.MobileCityResult;
import com.github.zhangchunsheng.region.service.RegionService;
import me.zhangchunsheng.hubble.common.constant.JuheConstants;
import me.zhangchunsheng.hubble.common.exception.JuheException;
import me.zhangchunsheng.hubble.common.service.impl.JuheServiceApacheHttpImpl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * <pre>
 * 聚合数据接口请求实现类，默认使用Apache HttpClient实现
 * Created by Chunsheng Zhang on 2020/9/22.
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
public class RegionServiceImpl extends JuheServiceApacheHttpImpl implements RegionService {
    @Override
    public MobileCityResult getMobileCity(String phone) throws JuheException {
        try {
            // URL 编码
            phone = URLEncoder.encode(phone, "utf-8");
        } catch (UnsupportedEncodingException e) {
            // do nothing
        }

        String responseContent = this.get(String.format(this.getConfig().getBaseUrl() + JuheConstants.Url.MOBILE_CITY, phone, this.getConfig().getKey()));
        return MobileCityResult.fromJson(responseContent);
    }
}
