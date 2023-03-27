package Jv13Mongodb;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class mongodb {
	private final String URI ="localhost";
	private final int PORT = 27017;
	private final String DATABASE = "mydb";
	private final String COLLECTION = "employee";
	
	MongoClient mongoClient;
	MongoDatabase mongoDB;
	MongoCollection<Document> collection;
	
	public MongoClient getMongoClient() {
		return mongoClient;
	}

	public void setMongoClient(MongoClient mongoClient) {
		this.mongoClient = mongoClient;
	}

	public MongoDatabase getMongoDB() {
		return mongoDB;
	}

	public void setMongoDB(MongoDatabase mongoDB) {
		this.mongoDB = mongoDB;
	}

	public MongoCollection<Document> getCollection() {
		return collection;
	}

	public void setCollection(MongoCollection<Document> collection) {
		this.collection = collection;
	}

	public String getURI() {
		return URI;
	}

	public int getPORT() {
		return PORT;
	}

	public String getDATABASE() {
		return DATABASE;
	}

	public String getCOLLECTION() {
		return COLLECTION;
	}

	public mongodb() {
		// TODO Auto-generated constructor stub
	}

}
