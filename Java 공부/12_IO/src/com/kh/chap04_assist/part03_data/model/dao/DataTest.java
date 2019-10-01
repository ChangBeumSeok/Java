package com.kh.chap04_assist.part03_data.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataTest {
	// DataInputStream
	// DataOutputStream
	// -> ����Ʈ ��� '����' ��Ʈ��
	// -> ��� �����͸� �дµ� 1byte ������ �ƴ϶�
	// �츮�� �˰� �ִ� 8������ �⺻ �ڷ������� �ٷ� ��
	// String ���� �ڷ��� �����ε� �а� �� �� ����
	
	// ȸ�� �߰�
	public void fileSave(){
		try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("member.txt"))){
			// Data ���� ��Ʈ���� ��������ν� write+�ڷ���() �߰�
			dout.writeUTF("�캰��"); // String�� UTF()
			dout.writeInt(1);
			dout.writeChar('F');
			dout.writeDouble(171.5);
			// ������ ���� ����
			// int�� 4byte, double�� 8byte ��� ���� �ٸ� ũ���
			// �����ϱ� ������ txt(���ڱ������) �� ���� Ȯ���ϸ�
			// �츮 ���� ���̴� ������� Ȯ�� �Ұ���
			// -> Ÿ�Կ� �°� �ٽ� �о�;� ������ Ȯ�� ����
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	} 
	public void fileOpen(){
		try(DataInputStream din = new DataInputStream(new FileInputStream("member.txt"))){
			String name = din.readUTF();
			int age = din.readInt();
			char gender = din.readChar();
			double height = din.readDouble();
			// ���� �ٲ� �� x
			// ���Ͽ� �Է��� ������� ������ Ÿ�� ���༭
			// �о�;� ��
			
			
			System.out.println(name + "/" + age + "/" + gender + "/" + height);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void fileSave2(){
		Scanner sc = new Scanner(System.in);
		try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("member.txt"))){
			// Data ���� ��Ʈ���� ��������ν� write+�ڷ���() �߰�
			while(true){
				System.out.print("�̸��� �Է��ϼ��� : ");
				dout.writeUTF(sc.nextLine());
				System.out.print("���̸� �Է��ϼ��� : ");
				dout.writeInt(sc.nextInt());
				sc.nextLine();
				System.out.print("������ �Է��ϼ��� : ");
				dout.writeChar(sc.nextLine().charAt(0));
				System.out.print("Ű�� �Է��ϼ��� : ");
				dout.writeDouble(sc.nextDouble());
				sc.nextLine();
				System.out.print("�Է��� �����ðڽ��ϱ�?(y/n) : ");
				String yn = sc.nextLine();
				if(yn.equalsIgnoreCase("y")){
					break;
				}
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public void fileOpen2(){
		try(DataInputStream din = new DataInputStream(new FileInputStream("member.txt"))){
			while(true){
				String name = din.readUTF();
				int age = din.readInt();
				char gender = din.readChar();
				double height = din.readDouble();
				System.out.println(name + "/" + age + "/" + gender + "/" + height);
			}
				
			// ���ѷ����� ����ϸ鼭 ������ ���� ���� EOFException�� �߻��ϸ�
			// try ~ catch�� �̿��ؼ� �����
		}catch(EOFException e){
			// End Of File : ���Ͽ� �� �̻� ���� ������ ���� �� �߻��ϴ�
			// exception -> �߻� �� �� �ۿ� ���� ������
			// �߻� ���� ���� ������ �ۼ�
			System.out.println("������ ���о�Խ��ϴ�.");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
