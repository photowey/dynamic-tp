package com.dtp.starter.adapter.dubbo.autoconfigure;

import com.dtp.adapter.dubbo.apache.ApacheDubboDtpAdapter;
import com.dtp.starter.common.autoconfigure.BaseBeanAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ApacheDubboTpAutoConfiguration related
 *
 * @author yanhom
 * @since 1.0.6
 */
@Configuration
@ConditionalOnBean(type = "org.apache.dubbo.config.ProtocolConfig")
@AutoConfigureAfter({BaseBeanAutoConfiguration.class})
@SuppressWarnings("all")
public class ApacheDubboTpAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public ApacheDubboDtpAdapter apacheDubboDtpHandler() {
        return new ApacheDubboDtpAdapter();
    }
}
