package com.github.zhangchunsheng.spring.starter.hubblejava.region.config;

import com.github.zhangchunsheng.region.service.RegionService;
import com.github.zhangchunsheng.region.service.impl.RegionServiceImpl;
import com.github.zhangchunsheng.spring.starter.hubblejava.region.properties.JuheRegionProperties;
import me.zhangchunsheng.hubble.common.config.JuheConfig;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 *  聚合数据自动配置
 *  Created by Chunsheng Zhang on 2020/9/22.
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
@Configuration
@EnableConfigurationProperties(JuheRegionProperties.class)
@ConditionalOnClass(RegionService.class)
@ConditionalOnProperty(prefix = "juhe", value = "enabled", matchIfMissing = true)
public class JuheRegionAutoConfiguration {
    private JuheRegionProperties properties;

    @Autowired
    public JuheRegionAutoConfiguration(JuheRegionProperties properties) {
        this.properties = properties;
    }

    /**
     * 构造聚合数据地理服务对象.
     *
     * @return 聚合数据地理service
     */
    @Bean
    @ConditionalOnMissingBean(RegionService.class)
    public RegionService regionService() {
        final RegionServiceImpl regionService = new RegionServiceImpl();
        JuheConfig regionConfig = new JuheConfig();
        regionConfig.setKey(StringUtils.trimToNull(this.properties.getKey()));

        regionService.setConfig(regionConfig);
        return regionService;
    }
}
