package Jv00TestPaC;

import java.util.ArrayList;

public class BookDTO {

	public BookDTO() {
		// TODO Auto-generated constructor stub
	}
	public BookDTO(String code, String type, String title, String writer, String publisher, int cost) {
		this.code = code;
		this.type = type;
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.cost = cost;
	}
	private String code;
	private String title;
	private int cost;
	private String writer;
	private String publisher;
	private String type;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void listString() {
		System.out.printf( "%9s\t%20s\t%15s\t%10s\t%9d\n", code, type,title,writer,publisher,cost); 
	}
	
}
