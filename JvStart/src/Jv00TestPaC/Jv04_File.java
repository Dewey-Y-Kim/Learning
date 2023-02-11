package Jv00TestPaC;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Jv04_File {

	public Jv04_File() {
		// File : 저장장치의 드라이브, 폴더, 파일을 처리할 수 있는 객체
		File f1= new File("/users/do-hyoungkim/documents");
		File f2 = new File("/users/do-hyoungkim/documents/java.rtf");
		File f3 = new File(f1,"EX01_carendarOBJ.java");
		File f4 = new File("/users/do-hyoungkim/documents","EX01_carendarOBJ.java");
		/* 폴더 생성
		 * mkdir() : 하위 폴더 없을때 폴더 생성
		 * mkdirs() : 하위 폴더까지 폴더 생성
		 * isDirectory() : 있는지 어떤지 확인
		 * exists() : 폴더 또는 파일이 존재하는지
		 */
		File f5 = new File("/users/do-hyoungkim/documents/sample"); //mkdir()
		File f6 = new File("/users/do-hyoungkim/documents/test/tti"); //mkdirs()
		
		
		//  파일생성
		File f7 = new File(f5,"ddd.txt");
		f5.mkdirs();
		try {
			boolean result = f7.createNewFile();
			if(result) {
				System.out.println("파일 생성");
			} else {
				System.out.println("파일 실패");
			}
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		
		System.out.println(f3.exists());
		long last = f4.lastModified();
		//last modified : 기준점 1970년 0시 0분 0초 기준
		//밀리초 단위...
		//밀리초로 calendar 객체 만들기
		Calendar dateTime = Calendar.getInstance();
		dateTime.setTimeInMillis(last);
		// 2023 1월 4일 11:??
		
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-DD a HH:mm");
		String dateStr=fmt.format(dateTime.getTime());
		System.out.println(dateStr);
		//특정 위치(드라이브, 폴더)
		File f8 = new File("/");
		File[] filelist = f8.listFiles();
		/*
		for(File f9 : filelist) {
			//getPath() : 드라이브/경로/파일명
			//getName() : 파일명(확장자)
			//getAbsolutePath() : 드라이브/경로/파일명
			//getParent() : 드라이브/경로
			if (f9.isDirectory()) {//폴더
				if(f9.isHidden()) {//숨김
					System.out.println(f9.getPath()+"[숨김폴더]");
				} else {
					System.out.println(f9.getPath()+"[폴더]");
				}
			} else
				if(f9.isHidden()) {
					System.out.println(f9.getPath()+"[숨김파일]");
				}else {
					System.out.println(f9.getPath()+"[파일]");
				}
			// String pathFile = f9.getPath();
			// System.out.println(pathFile);
		}
		*/
		//현재 컴퓨터의 드라이브 목록
		File[] drive = File.listRoots();
		for(File f9 : drive) {
			System.out.println(f9.getPath());
		}
		System.out.println("파일크기 : "+ f2.length());
		// 파일 삭제
		System.out.println(f7.delete());
		System.out.println(f5.delete());
		
	}
	
	
	public static void main(String[] args) {
		new Jv04_File();
	}
}
