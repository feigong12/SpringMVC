package com.spring.mvc.cp2.service;

import org.springframework.stereotype.Service;

import com.spring.mvc.cp2.Person;

/**
 * IMvcService的实现类；
 * 主要用于Model ： 实现业务逻辑 和 Model中的Data的赋值和取值、操作；
 */
@Service("mvcService")
public class MvcServiceImpl implements IMvcService {
	
	@Override
	public Person getPerson() {
		Person p = new Person();
		p.setAddress("上海");
		p.setAge(20);
		p.setPassword("abcdefg");
		p.setUsername("jackma");
		p.setWeight(80);
		return p;
	}

}


