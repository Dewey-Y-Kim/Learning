package Jv13Mongodb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class InsertManyTest {
	
	private final String URI ="localhost";
	private final int PORT = 27017;
	private final String DATABASE = "mydb";
	private final String COLLECTION = "employee";
	
	Scanner sc=new Scanner(System.in);
	//DB 연결
	MongoClient mongoClient;
	MongoDatabase mongoDB;
	MongoCollection<Document> collection;
	
	public InsertManyTest() {
		// TODO Auto-generated constructor stub
		start();
	}
	public void start() {
		
		try {
			//document 담을 Collection 생성 : List
			List<Document> empList= new ArrayList<Document>();
			System.out.print("입력할 사원 수 : ");
			int count = Integer.parseInt(sc.nextLine());
			for (int idx=0;idx<count;idx++) {
				//사번 사원명 업무 급여 부서
				Document document = new Document();
				System.out.print("사원 번호 : ");
				document.append("empno", Integer.parseInt(sc.nextLine()));
				System.out.print("사원 명 : ");
				document.append("ename", sc.nextLine());
				System.out.print("업무 : ");
				document.append("job", sc.nextLine());
				System.out.print("급여 : ");
				document.append("sal", Integer.parseInt(sc.nextLine()));
				System.out.print("부서명 : ");
				document.append("dname", sc.nextLine());
				document.append("hiredate", new Date());
				empList.add(document);
			}
			mongoClient = new MongoClient(URI, PORT);
			System.out.println("접속성공");
			mongoDB = mongoClient.getDatabase(DATABASE);
			collection=mongoDB.getCollection(COLLECTION);
			collection.insertMany(empList);
			mongoClient.close();
			System.out.println(count+"명의 데이터가 입력되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InsertManyTest();
	}

}
