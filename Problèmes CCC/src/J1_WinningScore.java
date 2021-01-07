import java.util.Scanner;
/*
* Author : nicopicko
* Date : Jan. 6, 2021
*/
public class J1_WinningScore
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				int pointsA = sc.nextInt()*3 + sc.nextInt()*2 + sc.nextInt();
				int pointsB = sc.nextInt()*3 + sc.nextInt()*2 + sc.nextInt();
				
				if (pointsA>pointsB)
				{
					System.out.println("A");
				}
				else if(pointsA<pointsB)
				{
					System.out.println("B");
				}
				else
				{
					System.out.println("T");
				}
				sc.close();
			}

	}
