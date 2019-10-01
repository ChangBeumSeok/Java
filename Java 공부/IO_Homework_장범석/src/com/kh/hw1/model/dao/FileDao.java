package com.kh.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	Scanner sc = new Scanner(System.in);

	public FileDao() {}

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		System.out.println("���Ͽ� ������ ������ �ݺ��ؼ� �Է��Ͻÿ�." + "(exit)�� �Է��ϸ� ���� �Է� �� : ");
		while (true) {
			String str = sc.nextLine();
			if (str.equals("exit")) {
				break;
			}
			sb.append(str + "\n");
		}
		System.out.print("�����Ͻðڽ��ϱ�?(y/n)");
		String yn = sc.nextLine();
		if (yn.equalsIgnoreCase("y")) {
			BufferedWriter bw = null;
			try {
				System.out.print("���ϸ� �Է� : ");
				String name = sc.nextLine() + ".txt";
				bw = new BufferedWriter(new FileWriter(name));
				bw.write(sb.toString());
				System.out.println(name + " ���Ͽ� ���������� �����Ͽ����ϴ�.");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("�ٽ� �޴��� ���ư��ϴ�.");
		}
	}

	public void fileOpen() {
		System.out.print("���� �� ���ϸ� : ");
		String name = sc.nextLine() + ".txt";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(name));
			String read = "";
			while ((read = br.readLine()) != null) {
				System.out.println(read);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void fileEdit() {
		System.out.print("���� �� ���ϸ� : ");
		String name = sc.nextLine() + ".txt";
		try (BufferedReader br = new BufferedReader(new FileReader(name));
				BufferedWriter bw = new BufferedWriter(new FileWriter(name, true))) {
			String read = "";
			StringBuilder sb = new StringBuilder();
			while ((read = br.readLine()) != null) {
				System.out.println(read);
			}
			System.out.print("���Ͽ� �߰��� ������ �Է��Ͻÿ� : ");
			while (true) {
				String write = sc.nextLine();
				if (write.equals("exit")) {
					break;
				} else {
					sb.append(write + "\n");
				}
			}
			System.out.print("����� ������ ���Ͽ� �߰��Ͻðڽ��ϱ�?(y/n) : ");
			String yn = sc.nextLine();
			if (yn.equalsIgnoreCase("y")) {
				bw.write(sb.toString() + "\n");
				System.out.println(name + " ������ ������ ����Ǿ����ϴ�.");
			} else {
				System.out.println("����ϼ̽��ϴ�.");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
