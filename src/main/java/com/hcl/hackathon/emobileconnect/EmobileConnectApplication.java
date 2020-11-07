package com.hcl.hackathon.emobileconnect;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
@ComponentScan
public class EmobileConnectApplication implements CommandLineRunner{
	
	@Autowired
    JobLauncher jobLauncher;
     
    @Autowired
    Job job;

	public static void main(String[] args) {
		SpringApplication.run(EmobileConnectApplication.class, args);
	}
	
	@Scheduled(cron = "* */5 * * * *")
	public void run(String... args) throws Exception {
		JobParameters params = new JobParametersBuilder().addString("JobID", String.valueOf(System.currentTimeMillis()))
				.toJobParameters();
		jobLauncher.run(job, params);
		
	}

}
