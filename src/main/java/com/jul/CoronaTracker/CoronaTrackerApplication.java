package com.jul.CoronaTracker;

import com.jul.CoronaTracker.config.DataUrlProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling //for the cron thing to work
@EnableConfigurationProperties(DataUrlProperties.class)
@SpringBootApplication
public class CoronaTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaTrackerApplication.class, args);
	}

}
