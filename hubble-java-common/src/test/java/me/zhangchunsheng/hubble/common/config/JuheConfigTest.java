package me.zhangchunsheng.hubble.common.config;

import org.testng.annotations.Test;

/**
 * <pre>
 *  Created by Chunsheng Zhang on 2020/9/22.
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
public class JuheConfigTest {
    private JuheConfig juheConfig = new JuheConfig();

    @Test
    public void test1() throws Exception {
        juheConfig.setKey("1");
    }
}
