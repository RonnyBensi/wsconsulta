package com.br.rbensi;


import java.util.concurrent.Executor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;




@EnableAsync
@AutoConfigurationPackage
@SpringBootApplication



public class WSConsulta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.setProperty("server.servlet.conext-path","/teste-ec");
        SpringApplication.run(WSConsulta.class, args);
        
        System.out.println("MDS");
        
        
	}
    @Bean
    public Executor taskExecutor() {
    	ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
    	executor.setCorePoolSize(2);
    	executor.setMaxPoolSize(2);
    	executor.setQueueCapacity(500);
    	executor.setThreadNamePrefix("Assincrono");
    	executor.initialize();
    	return executor;
    }
 
}
