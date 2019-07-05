package com.kh.chap02_encapsulation.run;
import com.kh.chap02_encapsulation.model.vo.Student;
import com.kh.chap02_encapsulation.model.vo.Account;;
public class Run {
	/*
	 * ĸ��ȭ 
	 * : �߻�ȭ�� ���� ���ǵ� �Ӽ���� ����� �ϳ��� ���� �����ϴ� ���
	 * Ŭ������ ���� �߿��� ������ �������� ���� ������ ��Ģ���� �Ͽ�
	 * �ܺο��� ������ ���� ������ ����
	 * ��ſ� �����͸� ó���ϴ� �޼ҵ���� Ŭ���� ���ο� �ۼ��Ͽ�
	 * �����Ϳ� ���������� �����ϴ� ����� ����
	 * 
	 *   1) ��������(private)
	 *   �߻�ȭ�� ���� ������ �Ӽ���(��� ����)�� �ܺηκ����� ����
	 *   ������ ���� ���� private ���� ������ ���
	 *   
	 *   2) setter / getter 
	 *   -> ���������� �����Ͽ� ���� ����ϰ� ��ȸ�ؿ��� �޼ҵ� �߰�
	 *   
	 */
	public static void main(String[] args){
		//Student Class�� ��ü ����
		Student st = new Student();
		/*
		 * st.name = "�����";
		 * st.kor = 100;
		 * st.math = 90;
		 * st.eng = 80;
		 */
		// ���� ���� ���� ������ �ȵȴٸ� ��� ���� �־�� �ұ�?
		// ���� ������ ���Ҵٸ� �������ζ� ������ �� �ֵ��� ����� ��
		// -> setter / getter �޼ҵ�
		
		// ��ü �� ���� -> setter
		st.setName("�����");
		st.setKor(100);
		st.setMath(90);
		st.setEng(80);
		
		// ��ü�� �� �˾ƿ��� -> getter
		System.out.println("�̸� : " + st.getName());
		System.out.println("���� ���� : " + st.getKor());
		System.out.println("���� ���� : " + st.getMath());
		System.out.println("���� ���� : " + st.getEng());
		
		// �ѹ��� ����ϱ� ���� information�̶�� �޼ҵ嵵 ����
		System.out.println(st.information());
		
		//-----------------------------------------------
		
		// Account Class�� ��ü ����
		Account a = new Account();
		a.displayBalance(); // �ܾ� ��ȸ
		
		// 100���� �Ա�
		a.deposit(1000000);
		a.displayBalance();
		
		// 150���� �߰� �Ա�
		a.deposit(1500000);
		a.displayBalance();
		
		// �뵷�� �ʿ��ؼ� 50���� ����
		a.withdraw(500000);
		a.displayBalance();
		
		// ���ڱ� account ��ü�� ����� ����� �����ϰ�
		// �ܾ��� ��� ����Ѵٸ�?
		// a.balance -= 2000000;
		// -> ���� �߻�
		
		// ���۽��ο� ������� �ʿ��ؼ� 50���� ����
		a.withdraw(500000);
		a.displayBalance();
		
		// ���� �ʵ���� public�̶�� ���� �����ڷ� ����
		// �ٸ� �ܺο��� ������ �����ؼ� ���� ��������
		// �ݵ�� ĸ��ȭ ����!! public -> private
		
	}
}
