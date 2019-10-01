package com.kh.chap04_assist.part04_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part04_object.model.vo.Phone;
import com.kh.chap04_assist.part04_object.model.vo.Student;

public class ObjectDao {
	private Student[] stList = new Student[10];
	{
		// »ùÇÃ µ¥ÀÌÅÍ
		stList[0] = new Student("¿ìº°¸²", 20, 'F', new Phone("»ï¼º", 990000));
		stList[1] = new Student("±èÃ¶¼ö", 21, 'M', new Phone("LG", 880000));
	}
	
	public void fileSave(){
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("student.dat"))){
			/*for(int i = 0; i < stList.length; i++){
				if(stList[i] == null){
					break;
				}
				oos.writeObject(stList[i]);
			}*/
			oos.writeObject(stList);
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public void fileRead(){
		try(ObjectInputStream oin = new ObjectInputStream(
				new FileInputStream("student.dat"))){
			/*for(int i = 0; i < stList.length; i++){
				stList[i] = (Student)oin.readObject();
			}*/
			stList = (Student[])oin.readObject();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(EOFException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		for(Student s : stList){
			if(s == null){
				break;
			}
			System.out.println(s);
		}
	}
}
