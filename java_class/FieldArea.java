package com.java.classes;

public class FieldArea {
	
	int k = 100;
//	float k; ���� �Ұ�. �������� ���� ����.
	
//	�޼ҵ���� ���Ƽ� ���� �Ұ�
//	-> System.out.print : str, int, float ��� ��� ����
//	-> �޼ҵ�� �ٸ����� �޼ҵ���� ���Ƽ� ��� ����
//	overloading : �� Ŭ���� ������ Ÿ�Ժ��� ���� ����� �ϵ��� ��
	public void  print() {
		int k = 10;
		System.out.println(k); // ���� ����� k�� ����ϱ� ������ �� �Է����� ������ ���� �߻���
		System.out.println(this.k); // �޼ҵ忡�� ����� �ν��Ͻ� ������ �� ���
	}
//	private void  print() {
//		int k = 100;
//		System.out.println();
//	}
//	public int print() {
//		return 0;
//	}
	
	
	public static void main(String[] args) {
		
		new FieldArea().print();
		
	}
}