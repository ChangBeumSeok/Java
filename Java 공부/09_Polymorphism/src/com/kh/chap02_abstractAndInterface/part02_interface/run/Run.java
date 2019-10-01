package com.kh.chap02_abstractAndInterface.part02_interface.run;

import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.GalaxyS10;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.Phone;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.SmartPhone;
import com.kh.chap02_abstractAndInterface.part02_interface.model.vo.V50;

// SmartPhone���� ��ȭ, ī�޶�, ��ġ ����� ����
// �ش� ����� ���� interface�� �����Ͽ� Smartphone Ŭ��������
// ���� ��� ���� ��, �߻� Ŭ������ SmartPhone�� ��� �޾�
// GalaxyS10�� V50�� ����

// 1. Phone(interface) -> ��ȭ����
// 2. Camera(interface) -> ī�޶� ���
// 3. cellPhone(interface) -> �޴���ȭ(phone, camera ���)
// 4. touchDisplay(interface) -> ��ġ ���
// 5. SmartPhoe(abstract class) -> ����Ʈ��(cellphone, touchdisplay)
// 6. Galaxy s10 -> smartPhone ��� ���� Ŭ����
// 7. V50 -> SmartPhone�� ��� ���� Ŭ����
public class Run {
	
	public static void main(String[] args) {
		// Phone �������̽��� ��� �ʵ忡 ���� ����
		System.out.println(Phone.NUM);
		//SmartPhone sp = new SmartPhone();
		// -> �̿ϼ� Ŭ������ �߻� Ŭ�����δ� �����Ұ�
		//Phone p = new Phone();
		// -> �������̽��� ��ü ���� �Ұ�
		SmartPhone s1; // ���۷����δ� ����
		s1 = new GalaxyS10();
		// -> ������ ����
		
		// ��ü �迭 ����� ������ �ε����� GalaxyS10, v50��ü ����
		SmartPhone[] phone = new SmartPhone[2];
		phone[0] = new GalaxyS10();
		phone[1] = new V50();
		
		// �ݺ����� ���� �� ��ü�� ��� �޼ҵ� ȣ���Ͽ� ���� ���
		for(int i = 0; i < phone.length; i++){
			// ���� �� ���� ���ε��� ����Ǿ�
			// �ش� ��ü���� �������̵� �� �޼ҵ尡 ȣ�� ��
			phone[i].printMaker();
			phone[i].makeaCall();
			phone[i].takeaCall();
			phone[i].touch();
			phone[i].charge();
			phone[i].picture();
			System.out.println();
		}
		
		/*
		 * �������̽� ����ϴ� ����
		 * ��ȭ, ī�޶�, ��ġ ���� ���߾�� �� ����� �������̽��� 
		 * �޼ҵ�� �����صθ� �� �������̽��� ��� ���� ��� Ŭ����
		 * ���� �ݵ�� �� �޼ҵ带 �����ؾ��Ѵ�
		 * -> ���� ��� ���� �ϰ��� ����(ǥ��ȭ)
		 * 
		 * ��ȭ, ī�޶�, ��ġ �� ���� �������̽��� �����Ͽ� �����
		 * ���� �� ����
		 * -> ���� ��ӿ� ���� ������ �غ� ����
		 * 
		 * ���� Ÿ�� ���ҷ� �������� �����Ͽ� ����
		 * -> �޼ҵ��� �Ű�����, ���� Ÿ�����ε� Ȱ���Ͽ�
		 *    �޼ҵ� ���� ���� �� ����
		 *    
		 * ���� �۾��� ���� �������̽� ����( ���� �ð� ����)
		 * -> �޼ҵ� ȣ�� �� ����θ� �˸� �Ǳ� ������ ���� ������
		 *    �ְ� �޴� ���� �۾��� ������ �޼ҵ尡 �ϼ����� �ʴ���
		 *    ������ ���� ���� ����
		 *    
		 * �������̽��� ��� �޼ҵ�� �������̵� �Ǿ�� �ϹǷ�
		 * �߻� Ŭ�������� �� ����ȭ �� �Ծ��� ������
		 * 
		 * ���(�������̵��� ����) -> �߻�Ŭ����(�߻�޼ҵ� ���� �������̵�)
		 * -> �������̽�(��� �޼ҵ带 ���� �������̵�)
		 */
	}
}
