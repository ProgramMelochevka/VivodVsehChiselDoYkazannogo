package by.home.maxzzzit;

import java.util.Scanner;

public class VivodVsehChiselDoYkazannogo {

	public static void main(String[] args) {
		// �������� �����, ������� ��������� � ���������� ����� ����� � ������� �� �����
		// ��� ����� ����� ����� 0 � ��������� ������ � ������� � ����������� ����������!
		// ���� ������: 6 �� �������� 1,2,3,4,5 ����: -6 �� ��������� -5,-4,-3,-2,-1
		int celchis, max;
		Scanner scn = new Scanner(System.in);
		System.out.print("������� ����� �����: ");
		celchis = scn.nextInt();
		System.out.println("�� ����� �����: " + celchis + " ��������: ");
		if (celchis > 0) {
			for (int i = 1; i < celchis; i++)
				System.out.print(i + " ");
		}
			else if (celchis < 0) {
			for	(int i=celchis+1;i<0;i++) {
//��� ���  	for (int i = -1; i > celchis; i--)
			System.out.print(i + " ");	//celchis-i	
			}
		}
		}
	}
