/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sim.simo.config;

/**
 *
 * @author alok
 */


import java.util.Collections;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.PartitionedRegionFactoryBean;
import org.springframework.data.gemfire.config.annotation.ClientCacheConfigurer;
import org.springframework.data.gemfire.support.ConnectionEndpoint;

@Configuration
public class GemConfig {
    
 
    @Bean
    ClientCacheConfigurer clientCachePoolPortConfigurer(
          @Value("${gemfire.cache.server.host:192.168.2.19}") String cacheServerHost,
          @Value("${gemfire.cache.server.port:40411}") int cacheServerPort) {

      return (beanName, clientCacheFactoryBean) ->
          clientCacheFactoryBean.setServers(Collections.singletonList(
              new ConnectionEndpoint(cacheServerHost, cacheServerPort)));
  }
    
  
    
    
    
}
