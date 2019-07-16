package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Parent;
import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;

public class Run {
	public static void main(String[] args) {
		// ����ص� ��!!
		// '=' �̶�� ���� �������� �� �� �ڷ���(Ÿ��)�� ���ƾ���
		
		// 1. �θ� Ÿ�� ���۷����� �θ� ��ü �ٷ�� ���
		System.out.println("1. �θ�Ÿ�� ���۷����� �θ� ��ü �ٷ�� ���");
		Parent p1 = new Parent();
		p1.printParent();
		// p1 ���۷����� Parent���� ���� ����
		
		// 2. �ڽ� Ÿ�� ���۷����� �ڽ� ��ü �ٷ�� ���
		System.out.println("2. �ڽ� Ÿ�� ���۷����� �ڽ� ��ü �ٷ�� ���");
		Child1 c1 = new Child1();
		c1.printParent();
		c1.printChild1();
		// c1 ���۷����� Parent, Child1 �Ѵ� ���� ����
		
		// ---------���� ���� ������ ����Ǵ� ���� ------------
		// 3. �θ� Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���
		Parent p2 = /*(Parent)*/new Child1();
		
		// ���� �����ڸ� �������� ���� ������ Ÿ���� �ٸ����� ����
		// -> �ڵ�����ȯ, ������ ����ȯ
		p2.printParent();
		// p2��� ���۷����� Parent���� ���� ���� -> ���� Parent Ÿ���̹Ƿ�
		// Child1�� �����ϰ� ������ ����ȯ -> ���� ����ȯ, ����� ����ȯ
		((Child1)p2).printChild1();
		
		/*
		 * ��� ������ Ŭ������ ������ ����ȯ ����
		 * 1. UpCasting
		 * Parent p = new Child();
		 * �ڽ� Ÿ�� -> �θ� Ÿ������ �ٲ�°�
		 * ���� ����
		 * 
		 * 2. DownCasting
		 * ((Child)p).printChild();
		 * �θ� Ÿ�� -> �ڽ� Ÿ��
		 * ���� �Ұ�
		 */
		
		// 4. �ڽ� Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���
		//Child1 c2 = new Parent(); // �����Ͽ��� : �ҽ����� ���� ����
		                            // Ÿ���� ���� �ʾ� ����� ����
		//Child1 c2 = (Child1)new Parent();
		//c2.printChild1();
		// ��Ÿ�� ���� : ���α׷� ���� �� �߻��ϴ� ����
		
		// ��ǻ� �������� ���Ǵ�
		// �θ� Ÿ�����κ��� �Ļ� �� �������� Ÿ���� �ڽ� ��ü��
		// �θ� Ŭ���� Ÿ�� �ϳ��� �ٷ� �� �ִ� ���
		// �� �������� 3���� ���� ���
		
		// �������� ���� ������?
		// �θ�Ÿ�� ���۷����� �پ��� �ڽ� Ÿ�Ե��� �� �޾� �� �� ����
		
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,4);
		arr1[1] = new Child1(2,3,5);
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2, 1, 5);
		arr2[1] = new Child2(5, 7, 2);
		
		System.out.println("=== ������ ������ ��ü �迭�� ===");
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(2, 1, 5);
		arr[2] = new Child2(5, 7, 5);
		arr[3] = new Child1(2, 3, 5);
		// �ϳ��� �θ� Ÿ������ �پ��� �ڽĵ��� ���� �� ����
		// -> �ڽĿ��� ������ �� �ϳ��� �θ� Ÿ������ ������ �� ����
		// -> ��, �ڵ� ���� ����, ������ �ڵ� ����
		
		// ������ �޼ҵ� �����غ���
		((Child1)arr[0]).printChild1();
		
		System.out.println("==== �ݺ����� �̿��� ��� ====");
		for(int i = 0; i < arr.length; i++){
			/*
			 * �� �ε��� ���� � �ڽ� ��ü�� �����ϰ� �ִ���
			 * �Ǻ��ϴ� ���
			 * < instanceof ������>
			 * ���� ���۷����� � Ŭ���� ���� �ּҸ� �����ϰ�
			 * �ִ��� Ȯ���� �� ���
			 * Ŭ���� Ÿ���� ��ġ�ϸ� true, �ƴϸ� false�� ����
			 */
			if(arr[i] instanceof Child1){
				((Child1)arr[i]).printChild1();
			}else{
				((Child2)arr[i]).printChild2();
			}
		}
		for(Parent p : arr){
			if(p instanceof Child1){
				((Child1)p).printChild1();
			}else{
				((Child2)p).printChild2();
			}
		}
		System.out.println("--------- �������̵� �����ؼ� ��� -----");
		for(int i = 0; i < arr.length; i++){
			arr[i].print();
			// -> �ڵ����� ���� ���� �����ϰ� �ִ� Ŭ������ �޼ҵ带 ã�ư��� ����
			// ���� ���ε� : ���α׷��� ����Ǳ� ���� �������� �Ǹ鼭
			// ��� �޼ҵ�� ���� ���ε� �Ǵµ� ������ �� ���� ���ε�
			// �� �޼ҵ带 ������ ����� ��ü Ÿ���� �������� ���ε� �Ǵ� ����
			// ���� ���ε�!!
			// -> ��Ӱ��迡�� ������ ����� ��� �������̵� �޼ҵ尡 �켱
			
		}
	}
}
