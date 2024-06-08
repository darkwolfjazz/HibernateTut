package map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {

public  static void main(String[] args){
    System.out.println("Project started!");

    Configuration cfg=new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory=cfg.buildSessionFactory();

    //Creating question
    Question question1=new Question();
    question1.setQuestion_id(1212);
    question1.setQuestion("What is Java?");
    //creating answer object

    Answer answer1=new Answer();
    answer1.setAnswer_id(343);
    answer1.setAnswer("Java is a programming language");
    answer1.setQuestion(question1);


    Answer answer2=new Answer();
    answer2.setAnswer_id(33);
    answer2.setAnswer("With java we can create softwares");
    answer2.setQuestion(question1);


    Answer answer3=new Answer();
    answer3.setAnswer_id(34);
    answer3.setAnswer("With java we can create classes");
    answer3.setQuestion(question1);

    List<Answer>answerList=new ArrayList<Answer>();
    answerList.add(answer1);
    answerList.add(answer2);
    answerList.add(answer3);

    question1.setAnswers(answerList);


  //session
    Session session=factory.openSession();
    Transaction transaction=session.beginTransaction();
     session.save(question1);
     session.save(answer1);
     session.save(answer2);
     session.save(answer3);
    transaction.commit();

    //Fetching data
//    Question newQuestion =(Question) session.get(Question.class,1212);
//    System.out.println(newQuestion);
    session.close();
    factory.close();


}


}
