package me.zhangchunsheng.hubble.common.service.impl;

import com.google.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import me.zhangchunsheng.hubble.common.exception.JuheException;
import me.zhangchunsheng.hubble.common.service.JuheService;
import me.zhangchunsheng.hubble.common.testbase.ApiTestModule;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.*;

/**
 * 测试相关接口
 * Created by Chunsheng Zhang on 2020/9/22.
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
@Slf4j
@Test
@Guice(modules = ApiTestModule.class)
public class BaseJuheServiceImplTest {

    @Inject
    private JuheService juheService;

    @Test
    public void testKey() throws JuheException {
        String key = this.juheService.getConfig().getKey();
        assertNotNull(key);
    }
}
