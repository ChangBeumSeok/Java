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
	// �ڹ� ���α׷�(��ü ����) --- ����ȭ ---> ����(����Ʈ ����)
	// ����(����Ʈ ����) --- ������ȭ ---> �ڹ� ���α׷�(��ü ����)
	
	public void fileSave(){
		Phone ph = new Phone("�Ｚ", 990000);
		Phone ph2 = new Phone("LG", 880000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("phone.dat"))){
			oos.writeObject(ph);
			oos.writeObject(ph2);
			// ����ȭ �� �Ǿ��ٴ� ���� �߻�
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
			// �о �ٷ� ���
			//System.out.println(ois.readObject());
			//System.out.println(ois.readObject());
			// -> ClassNotFoundException
			
			// ������ ��Ƽ� ���
			// readObject()�� ��ȯ���� Object�̹Ƿ�
			// Phone�� ��� ���� �ٿ� ĳ���� �ʿ�!
			Phone ph = (Phone) ois.readObject();
			System.out.println(ph);
			Phone ph2 = (Phone) ois.readObject();
			System.out.println(ph2);
			// ���࿡ �� �������� �Ѵٸ�?
			Phone ph3 = (Phone) ois.readObject();
			System.out.println(ph3); // EOFException �߻�
			
			
		}catch(EOFException e){
			System.out.println("������ �� �о����ϴ�.");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// ���� BufferdInput / OutputStream�� �ϳ� �� �ܴٸ�??
	// BufferedInputStream bis = new BufferedInputStream(
	//   new ObjectInputStream(...))
	// ObjectInputStream ois = new ObjectInputStream(
	//   new BufferedInputStream(...))
	// ���������� Ȱ���ؾ� �ϴ� ��Ʈ���� readObject()�� �����ϴ� ois
	// �̹Ƿ� ���ڰ� ����!
	// new Data~/Object~(Buffered~(File~))
	
	// 2. SerialversionUID
	// �ʵ� ������ ��������� ������ jvm�� �⺻ �� ����
	// ������ ������ ���� �ʰ����� ���߿� ���������� ���� ���׷��̵��
	// PhoneŬ������ �����ϴ� ���(�ʵ��� �߰��� ������ �Ͼ�� ���)
	// �ʵ�� ���� ���̵� ��������� ������ Ŭ������ ������ ��
	// JVM�� ���� ���̵� �ٲ� -> ���Ͽ��� �ҷ��� �� ���� ���̵� ������ �޶�
	// -> �ʵ�� ��������� ���� ���̵� ǥ�����ָ�
	//    Ŭ���� ������ ������ ���� ������ �������� ��� ����
	
	
	
	
	
	
	
}
