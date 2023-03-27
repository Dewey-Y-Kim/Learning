package Jv13Mongodb;

import java.util.Date;
import java.util.Scanner;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

// https://repo1.maven.org/maven2/org/mongodb/mongo-java-driver/3.9.1/
public class InsertOneTest {
	private final String URI ="localhost";
	private final int PORT = 27017;
	private final String DATABASE = "mydb";
	private final String COLLECTION = "employee";
	public InsertOneTest() {
		// MongoDB Connection Framework
		/* 몽db에 데이터베이스와 컬렉션이 생성되어 있어야 한다.
		 * 
		 * MongoDb Server : localhost
		 * port number : 27017
		 * DB : mydb
		 * Collection : employee
		 */
	}
	Scanner sc=new Scanner(System.in);
	//DB 연결
	MongoClient mongoClient;
	MongoDatabase mongoDB;
	MongoCollection<Document> collection;
	public void start() {
		try {
			// 1 DB연결(mongoDB)			
			mongoClient = new MongoClient(URI, PORT);
			System.out.println("접속 완료");
			
			//2. DB가져오기
			mongoDB = mongoClient.getDatabase(DATABASE);
			//3. Collection 가져오기
			collection= mongoDB.getCollection(COLLECTION);
			System.out.print("사원번호 : ");
			int empno= Integer.parseInt(sc.nextLine());
			System.out.print("사원 명 : ");
			String ename= sc.nextLine();
			System.out.print("업무 : ");
			String job = sc.nextLine();
			System.out.print("급여 : ");
			int sal = Integer.parseInt(sc.nextLine());
			System.out.print("부서명 : ");
			String dname = sc.nextLine();
			// Document 객체생성 Collection 이용 insert수행
			Document document = new Document();
			document.append("empno", empno);
			document.append("ename",ename);
			document.append("job",job);
			document.append("sal", sal);
			document.append("dname", dname);
			document.append("hiredate", new Date());
			collection.insertOne(document);
			System.out.println("Document 추가 완료");
			mongoClient.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InsertOneTest().start();
	}

}
