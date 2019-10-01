package com.kh.chap04_assist.part04_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part04_object.model.vo.Phone;

public class SimpleDao {
	// ObjectInput/OutputStream
	// 자바 프로그램(객체 단위) --- 직렬화 ---> 파일(바이트 단위)
	// 파일(바이트 단위) --- 역직렬화 ---> 자바 프로그램(객체 단위)
	
	public void fileSave(){
		Phone ph = new Phone("삼성", 990000);
		Phone ph2 = new Phone("LG", 880000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("phone.dat"))){
			oos.writeObject(ph);
			oos.writeObject(ph2);
			// 직렬화 안 되었다는 오류 발생
			// : java.io.NotSerializableException
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public void fileOpen(){
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("phone.dat"))){
			// 읽어서 바로 출력
			//System.out.println(ois.readObject());
			//System.out.println(ois.readObject());
			// -> ClassNotFoundException
			
			// 변수에 담아서 출력
			// readObject()의 반환형은 Object이므로
			// Phone에 담기 위해 다운 캐스팅 필요!
			Phone ph = (Phone) ois.readObject();
			System.out.println(ph);
			Phone ph2 = (Phone) ois.readObject();
			System.out.println(ph2);
			// 만약에 더 읽으려고 한다면?
			Phone ph3 = (Phone) ois.readObject();
			System.out.println(ph3); // EOFException 발생
			
			
		}catch(EOFException e){
			System.out.println("파일을 다 읽었습니다.");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// 만약 BufferdInput / OutputStream을 하나 더 단다면??
	// BufferedInputStream bis = new BufferedInputStream(
	//   new ObjectInputStream(...))
	// ObjectInputStream ois = new ObjectInputStream(
	//   new BufferedInputStream(...))
	// 최종적으로 활용해야 하는 스트림은 readObject()를 제공하는 ois
	// 이므로 후자가 정답!
	// new Data~/Object~(Buffered~(File~))
	
	// 2. SerialversionUID
	// 필드 값으로 명시해주지 않으면 jvm이 기본 값 지정
	// 당장은 오류가 나지 않겠지만 나중에 유지보수나 버전 업그레이드로
	// Phone클래스를 수정하는 경우(필드의 추가나 삭제가 일어나는 경우)
	// 필드로 버전 아이디를 명시해주지 않으면 클래스가 수정될 때
	// JVM이 버전 아이디를 바꿈 -> 파일에서 불러올 때 버전 아이디 대조시 달라
	// -> 필드로 명시적으로 버전 아이디를 표기해주면
	//    클래스 수정할 때마다 내가 지정한 버전으로 계속 유지
	
	
	
	
	
	
	
}
