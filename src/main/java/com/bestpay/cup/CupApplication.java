package com.bestpay.cup;

import com.bestpay.cup.mapper.CityMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.bestpay.cup.mapper")
public class CupApplication {

	public static void main(String[] args) {
		SpringApplication.run(CupApplication.class, args);
	}
}
