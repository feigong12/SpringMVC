package com.spring.mvc.xcx;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.mvc.xcx.vo.Answer;
import com.spring.mvc.xcx.vo.Question;
import com.spring.mvc.xcx.vo.QuestionAndAnswer;

/**
 * ����С����-Сʫ�ʵ�rest����
 */
@Controller
@RequestMapping("/xcx/rest")
public class RestController {
	
	@RequestMapping("/getSc")
	@ResponseBody
	public String getSc(){
		List<QuestionAndAnswer> data = new ArrayList<QuestionAndAnswer>();
		this.prepareScData(data);
		return JSONArray.fromObject(data).toString();
	}
	
	//���������Ǵ����ݿ��ж�ȡ��mysql��redis
	public void prepareScData(List<QuestionAndAnswer> data){
		QuestionAndAnswer item1 = new QuestionAndAnswer();
		Question question = new Question();
		question.setTitle("�����յ���");
		question.setContent("�����յ��磬���κ�������˭֪���вͣ�����������");
		
		item1.setQuestion(question);
		
		List<Answer> answers =new ArrayList<Answer>();
		Answer a0 = new Answer();
		a0.setAnswer("���κ�����");
		a0.setAnswerType("primary");
		a0.setId(0);
		answers.add(a0);
		
		Answer a1 = new Answer();
		a1.setAnswer("���κ�����");
		a1.setAnswerType("warn");
		a1.setId(1);
		answers.add(a1);
		
		Answer a2 = new Answer();
		a2.setAnswer("���κ�����");
		a2.setAnswerType("warn");
		a2.setId(2);
		answers.add(a2);
		
		Answer a3 = new Answer();
		a3.setAnswer("���κ���ͼ");
		a3.setAnswerType("warn");
		a3.setId(3);
		answers.add(a3);
		
		item1.setAnswers(answers);
		data.add(item1);//�����ݼӵ��б���
	}
	
}
