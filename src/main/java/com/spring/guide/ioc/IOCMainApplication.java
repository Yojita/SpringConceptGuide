package com.spring.guide.ioc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.guide.ioc.bean.WelcomeBean;
import com.spring.guide.ioc.config.SpringConfig;

public class IOCMainApplication {
	public static final Log LOGGER = LogFactory.getLog(SpringConfig.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		WelcomeBean wlcomeBean = applicationContext.getBean(WelcomeBean.class);
		LOGGER.info(wlcomeBean.printWelcome());
		((AnnotationConfigApplicationContext)applicationContext).close();
	}
}
