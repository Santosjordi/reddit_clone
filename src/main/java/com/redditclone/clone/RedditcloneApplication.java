package com.redditclone.clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RedditcloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedditcloneApplication.class, args);
	}

}
