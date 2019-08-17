package com.sim.simo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnablePdx;

@SpringBootApplication
@ClientCacheApplication(locators = {
    @ClientCacheApplication.Locator(host = "192.168.2.19", port = 10334)
},logLevel = "info")
@EnablePdx
public class SimoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimoApplication.class, args);
	}

}
