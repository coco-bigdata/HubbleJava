package com.github.zhangchunsheng.region.service;

import com.github.zhangchunsheng.region.bean.result.MobileCity;
import com.github.zhangchunsheng.region.bean.result.MobileCityResult;
import me.zhangchunsheng.hubble.common.exception.JuheException;
import me.zhangchunsheng.hubble.common.service.JuheService;

/**
 * <pre>
 * 手机归属地API
 * Created by Chunsheng Zhang on 2020/9/22.
 *
 * ttp://apis.juhe.cn/mobile/get?phone=13429667914&key=
 *
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
public interface RegionService extends JuheService {

    /**
     * http://apis.juhe.cn/mobile/get?phone=13429667914&key=6d19d637c5b0adb4cccdd04ab5e7b5d2
     * @param phone
     * @return
     * @throws JuheException
     */
    public MobileCityResult getMobileCity(String phone) throws JuheException;

}
