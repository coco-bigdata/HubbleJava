package com.github.zhangchunsheng.spring.starter.hubblejava.region.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <pre>
 *  聚合数据属性配置类
 *  Created by Chunsheng Zhang on 2020/9/22.
 * </pre>
 *
 * @author <a href="https://github.com/zhangchunsheng">Chunsheng Zhang</a>
 */
@Data
@ConfigurationProperties(prefix = "juhe")
public class JuheRegionProperties {
  /**
   * 聚合数据key.
   */
  private String key;
}
