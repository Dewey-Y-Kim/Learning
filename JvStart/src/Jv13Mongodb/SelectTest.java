package Jv13Mongodb;

import java.util.Date;
import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class SelectTest {
	private final String URI ="localhost";
	private final int PORT = 27017;
	private final String DATABASE = "mydb";
	private final String COLLECTION = "employee";
	
	MongoClient mongoClient;
	MongoDatabase mongoDB;
	MongoCollection<Document> collection;
	
	public SelectTest() {
		// TODO Auto-generated constructor stub
		
	}
	public void selectAll() {
		try {
			mongoClient=new MongoClient(URI, PORT);
			mongoDB= mongoClient.getDatabase(DATABASE);
			collection=mongoDB.getCollection(COLLECTION);
			
			Iterator<Document> cursor=collection.find().iterator();
			while(cursor.hasNext()) {
				// System.out.println(cursor.next().toJson());
				Document document = cursor.next();
				int empno = document.getInteger("empno");
				String ename = document.getString("ename");
				int sal = document.getInteger("sal");
				System.out.printf("사번 :%d\t 사원명 : %s\t 급여 : %d\n",empno, ename, sal );
			}
			mongoClient.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void selectSearch() {
		try {
			mongoClient = new MongoClient(URI,PORT);
			mongoDB = mongoClient.getDatabase(DATABASE);
			collection = mongoDB.getCollection(COLLECTION);
			//eq:{:}
			Iterator<Document> cursor=collection.find(Filters.eq("job", "개발자")).iterator();
			while(cursor.hasNext()) {
				Document document = cursor.next();
				int empno= document.getInteger("empno");
				String ename=document.getString("ename");
				String job = document.getString("job");
				int sal = document.getInteger("sal");
				Date date = document.getDate("hiredate");
				System.out.println("사번 : "+empno+"\t 사원명 : "+ename+"\t 직책:"+job+"\t 급여"+sal+"\t날짜 :"+date.toString());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void selectSearch2() {
		try {
			mongoClient = new MongoClient(URI,PORT);
			mongoDB = mongoClient.getDatabase(DATABASE);
			collection = mongoDB.getCollection(COLLECTION);
			// $in{,}
			// Iterator<Document> cursor=collection.find(Filters.in("dname", "영업부","개발팀")).iterator();
			// $get:{:}
			Iterator<Document> cursor=collection.find(Filters.gte("sal", 4000)).iterator();
			while(cursor.hasNext()) {
				Document document = cursor.next();
				int empno= document.getInteger("empno");
				String ename=document.getString("ename");
				String job = document.getString("job");
				int sal = document.getInteger("sal");
				Date date = document.getDate("hiredate");
				String dname = document.getString("dname");
				System.out.println("사번 : "+empno+"\t 사원명 : "+ename+"\t 직책:"+job+"\t 급여:"+sal+"\t 부서명:"+dname+"\t날짜 :"+date.toString());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectTest test = new SelectTest();
		//test.selectAll();
		test.selectSearch2();
	}

}
