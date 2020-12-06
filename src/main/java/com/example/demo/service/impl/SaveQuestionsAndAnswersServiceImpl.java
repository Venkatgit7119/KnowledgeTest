package com.example.demo.service.impl;


import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Answers;
import com.example.demo.entity.Questions;
import com.example.demo.entity.Topics;
import com.example.demo.entity.UserDetails;
import com.example.demo.model.QuestionsAndAnswersModel;
import com.example.demo.repository.AnswersRepository;
import com.example.demo.repository.QuestionsRepository;
import com.example.demo.repository.TopicsRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.QuestionsAndAnswersService;
import com.example.demo.service.SaveQuestionsAndAnswersService;
import com.example.demo.service.UsersService;


@Component
public class SaveQuestionsAndAnswersServiceImpl implements SaveQuestionsAndAnswersService {
	
	@Autowired
	QuestionsRepository questionsrepo;
	
	@Autowired
	AnswersRepository answersrepo;
	
	@Autowired
	TopicsRepository topicsrepo;
	
	@Override
	public String saveQuestionsAndAnswers(String sheetcount)
	{
		String comments = "Service up and Running in server. Dont worry";

		List<Topics> topicsList =new ArrayList<>();
		List<Questions> questionsList =new ArrayList<>();
		List<Answers> answersList =new ArrayList<>();
		
		///

		try {
			File file = new File("C:\\Users\\Venkat\\Desktop\\API\\DataBase\\DataBaseInput.xlsx"); 
			FileInputStream fis = new FileInputStream(file); 

			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			//Save Topics
			
			XSSFSheet sheet = wb.getSheetAt(0);
			Iterator<Row> itr = sheet.iterator();
			Boolean firstRow=true;
			while (itr.hasNext()) {
				Row row = itr.next();
				
				if(firstRow)
				{
					row=itr.next();
					firstRow=false;
				}
				Iterator<Cell> cellIterator = row.cellIterator(); 
				
				Topics topics =new Topics();
				int count=1;
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					
					switch(count)
					{
					case 1:
						topics.setId(BigInteger.valueOf((long) cell.getNumericCellValue()));
						break;
					case 2:
						topics.setTopics(cell.getStringCellValue());
						break;
					case 3:
						topics.setTopicstamil(cell.getStringCellValue());
						break;
					}
					
				count++;
				}
				
				topicsList.add(topics);
			}
			
	//Save Answers
			
			
			XSSFSheet answerSheet = wb.getSheetAt(1);
			Iterator<Row> answerSheetitr = answerSheet.iterator();
			Boolean answerSheetFirstRow=true;
			while (answerSheetitr.hasNext()) {
				Row row = answerSheetitr.next();
				
				if(answerSheetFirstRow)
				{
					row=answerSheetitr.next();
					answerSheetFirstRow=false;
				}
				Iterator<Cell> cellIterator = row.cellIterator(); 
				
				Answers answers=new Answers();
				int count=1;
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					
					switch(count)
					{
					case 1:
						answers.setId(BigInteger.valueOf((long) cell.getNumericCellValue()));
						break;
					case 2:
						answers.setTopicsid(BigInteger.valueOf((long) cell.getNumericCellValue()));
						break;
					case 3:
						answers.setQuestionsid(BigInteger.valueOf((long) cell.getNumericCellValue()));
						break;
					case 4:
						answers.setAnswers(cell.getStringCellValue());
						break;
					case 5:
						answers.setAnswerstamil(cell.getStringCellValue());
						break;
				
					}
					
				count++;
				}
				
				answersList.add(answers);
			}
			
			//Save Questions
			int questionsSheetCount=2;
			while(questionsSheetCount != Integer.parseInt(sheetcount)+1)
			{
				XSSFSheet questionSheet = wb.getSheetAt(questionsSheetCount);
				Iterator<Row> questionSheetitr = questionSheet.iterator();
				Boolean questionSheetFirstRow = true;
				while (questionSheetitr.hasNext()) {
					Row row = questionSheetitr.next();

					if (questionSheetFirstRow) {
						row = questionSheetitr.next();
						questionSheetFirstRow = false;
					}
					Iterator<Cell> cellIterator = row.cellIterator();

					Questions questions = new Questions();
					int count = 1;
					while (cellIterator.hasNext()) {
						Cell cell = cellIterator.next();

						switch (count) {
						case 1:
							questions.setId(BigInteger.valueOf((long) cell.getNumericCellValue()));
							break;
						case 2:
							questions.setTopicsid(BigInteger.valueOf((long) cell.getNumericCellValue()));
							break;
						case 3:
							questions.setQuestions(cell.getStringCellValue());
							break;
						case 4:
							questions.setQuestionstamil(cell.getStringCellValue());
							break;
						case 5:
							questions.setCorrectAnswers(cell.getStringCellValue());
							break;
						case 6:
							questions.setCorrectAnswersTamil(cell.getStringCellValue());
							break;
						}

						count++;
					}

					questionsList.add(questions);
				}
				questionsSheetCount++;
			}
			
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		topicsrepo.saveAll(topicsList);
		questionsrepo.saveAll(questionsList);
		answersrepo.saveAll(answersList);


		return "Saved Success";
	}

	
}
