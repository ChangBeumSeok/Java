package com.kh.chap01_inherit.run;

import com.kh.chap01_inherit.model.vo.Airplane;
import com.kh.chap01_inherit.model.vo.Car;
import com.kh.chap01_inherit.model.vo.Ship;

public class Run {
	public static void main(String[] args) {
		// ��� �� for��, for - each�� �ٽ� ����
		
		// 1. �迭�� ���
		double[] arr = {0.1, 0.2, 0.3, 0.4, 0.5};
		for(double num : arr){ // Ÿ�� ������ : �ݺ��� ���� ���� ��ü
			System.out.println(num);
		}
		// 2. ��ü �迭�� ���
		Airplane[] list = {new Airplane("p-01", 0.03, "������", 16, 5),
				new Airplane("p-02", 0.03, "������", 16, 5),
				new Airplane("p-03", 0.03, "������", 16, 5)};
		
		for(Airplane ap : list){
			System.out.println(ap.getName());
		}
		//-------------------------------------
		Airplane airplane = new Airplane("�����1", 0.021, "��Ʈ��", 16, 5);
		Car car = new Car("BMW", 12.5, "����", 4);
		Ship ship = new Ship("���ù�", 3, "�", 1);
		
		// information�� Overring �Ǿ� �־��� ��
		System.out.println(airplane.information());
		System.out.println(car.information());
		System.out.println(ship.information());
		
		airplane.howToMove();
		car.howToMove();
		ship.howToMove();
		// ������̼��� �Ⱦ��ٸ�
		// �ƹ� �������  - Overriding �� ���� ������ �Ǽ��� ��� �� �� ����
		// �θ� �޼ҵ尡 ����ǰų� �ڽ� �޼ҵ忡�� ��Ÿ�� ���
		// ������ �߻����� ����ش�
	}
}
