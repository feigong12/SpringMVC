package com.spring.mvc.cp2.service;

import org.springframework.stereotype.Service;

import com.spring.mvc.cp2.Person;

/**
 * IMvcService��ʵ���ࣻ
 * ��Ҫ����Model �� ʵ��ҵ���߼� �� Model�е�Data�ĸ�ֵ��ȡֵ��������
 */
@Service("mvcService")
public class MvcServiceImpl implements IMvcService {
	
	@Override
	public Person getPerson() {
		Person p = new Person();
		p.setAddress("�Ϻ�");
		p.setAge(20);
		p.setPassword("abcdefg");
		p.setUsername("jackma");
		p.setWeight(80);
		return p;
	}

}


