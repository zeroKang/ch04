package org.zerock.ch04;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.ch04.service.SampleService;

@SpringBootTest
@Log4j2
class Ch04ApplicationTests {

	@Autowired
	private SampleService sampleService;

	@Test
	public void testSerive(){

		log.info(sampleService.getClass().getName());
		log.info(sampleService);

		sampleService.doA();

	}

	@Test
	void contextLoads() {

		log.info("context loads.............");
		log.info("context loads.............");
		log.info("context loads.............");

	}

}
