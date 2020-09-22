package com.github.zhangchunsheng.region.service.impl;

import com.github.zhangchunsheng.region.bean.result.MobileCityResult;
import com.github.zhangchunsheng.region.service.RegionService;
import com.github.zhangchunsheng.region.testbase.ApiTestModule;
import com.google.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import me.zhangchunsheng.hubble.common.exception.JuheException;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertEquals;

/**
 * 测试相关接口
 * Created by Chunsheng Zhang on 2020/9/22.
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
@Slf4j
@Test
@Guice(modules = ApiTestModule.class)
public class BaseJuheRegionServiceImplTest {

    @Inject
    private RegionService regionService;

    @Test
    public void testMobileCity() throws JuheException {
        MobileCityResult result = this.regionService.getMobileCity("13429667914");
        assertEquals(0, result.getErrorCode());
    }
}
