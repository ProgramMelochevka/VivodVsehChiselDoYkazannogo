package by.home.maxzzzit;

import java.util.Scanner;

public class VivodVsehChiselDoYkazannogo {

	public static void main(String[] args) {
		// Написать класс, который принимает с клавиатуры целое число и выводит на экран
		// все целые числа между 0 и введенным числом – начиная с наименьшего возможного!
		// если вводим: 6 то получаем 1,2,3,4,5 если: -6 то выводится -5,-4,-3,-2,-1
		int celchis, max;
		Scanner scn = new Scanner(System.in);
		System.out.print("Введите целое число: ");
		celchis = scn.nextInt();
		System.out.println("Вы ввели число: " + celchis + " получите: ");
		if (celchis > 0) {
			for (int i = 1; i < celchis; i++)
				System.out.print(i + " ");
		}
			else if (celchis < 0) {
			for	(int i=celchis+1;i<0;i++) {
//или так  	for (int i = -1; i > celchis; i--)
			System.out.print(i + " ");	//celchis-i	
			}
		}
		}
	}
