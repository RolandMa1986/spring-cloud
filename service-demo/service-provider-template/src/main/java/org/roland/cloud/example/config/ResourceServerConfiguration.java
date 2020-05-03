package org.roland.cloud.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;

@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

//    private static final String RESOURCE_ID = "my_rest_api";
//
//    @Override
//    public void configure(ResourceServerSecurityConfigurer resources) {
//        resources.resourceId(RESOURCE_ID).stateless(false);
//    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.
                authorizeRequests()
                .anyRequest().authenticated()
//                .antMatchers("/divide/**").access("hasRole('ADMIN')")
                .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
    }

//    @Primary
//    @Bean
//    public RemoteTokenServices remoteTokenServices() {
//
//        final RemoteTokenServices tokenServices = new RemoteTokenServices();
//        //设置授权服务器check_token端点完整地址
//        //TODO: Inject remote token service with load balance
//        tokenServices.setCheckTokenEndpointUrl("http://localhost:6008/oauth/check_token");
//        //TODO: inject client oauth config
//        tokenServices.setClientId("my-trusted-client");
//        tokenServices.setClientSecret("secret");
//        return tokenServices;
//    }
}
