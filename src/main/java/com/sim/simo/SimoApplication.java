package com.sim.simo;

import com.sim.simo.db.TicketRepository;
import com.sim.simo.model.Ticket;
import org.apache.geode.cache.client.ClientRegionShortcut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.cache.config.EnableGemfireCaching;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableCachingDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnableContinuousQueries;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnablePdx;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

/*@SpringBootApplication
@ClientCacheApplication(locators = {
    @ClientCacheApplication.Locator(host = "192.168.2.19", port = 10334)
},logLevel = "info")
@EnablePdx
*/
@SpringBootApplication
@ClientCacheApplication(name = "AccessingGemFireDataRestApplication", logLevel = "error")
@EnableEntityDefinedRegions(basePackageClasses = Ticket.class, clientRegionShortcut = ClientRegionShortcut.LOCAL)
@EnableGemfireRepositories
@SuppressWarnings("unused")
public class SimoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimoApplication.class, args);
                //SpringApplication.run(SpringBootGemfireRestfulApiApplication.class, args);
	}

}
