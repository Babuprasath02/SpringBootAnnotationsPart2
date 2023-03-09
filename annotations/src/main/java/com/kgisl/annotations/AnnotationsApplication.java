package com.kgisl.annotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kgisl.annotations.controller.BeanController;
import com.kgisl.annotations.controller.MyController;
import com.kgisl.annotations.lazy.EagerLoader;
import com.kgisl.annotations.lazy.LazyLoader;
import com.kgisl.annotations.scope.PrototypeBean;
import com.kgisl.annotations.scope.SingletonBean;
import com.kgisl.annotations.service.BeanService;
import com.kgisl.annotations.service.MyService;

@SpringBootApplication
public class AnnotationsApplication {
	
	public static void main(String[] args) {
		
		//SpringApplication.run(AnnotationsApplication.class, args);
		ConfigurableApplicationContext cac = SpringApplication.run(AnnotationsApplication.class, args);
		BeanService bs = cac.getBean(BeanService.class);
		System.out.println(bs.beanExample());
		BeanController bc = cac.getBean(BeanController.class);
		System.out.println(bc.getBeanExample());
		MyController mc = cac.getBean(MyController.class);
		System.out.println(mc.sayHello());
		MyService ms = cac.getBean(MyService.class);
		System.out.println(ms.myRepository());
		EagerLoader el = cac.getBean(EagerLoader.class);
		LazyLoader ll = cac.getBean(LazyLoader.class);
		System.out.println(el.eager());
		SingletonBean sb1 =cac.getBean(SingletonBean.class);
		SingletonBean sb2 =cac.getBean(SingletonBean.class);
		SingletonBean sb3 =cac.getBean(SingletonBean.class);
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(sb3.hashCode());
		PrototypeBean pb1 = cac.getBean(PrototypeBean.class);
		PrototypeBean pb3 = cac.getBean(PrototypeBean.class);
		PrototypeBean pb2 = cac.getBean(PrototypeBean.class);
		System.out.println(pb1.hashCode());
		System.out.println(pb2.hashCode());
		System.out.println(pb3.hashCode());
		




	}

}
