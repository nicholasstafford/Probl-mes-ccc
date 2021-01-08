import java.util.Scanner;
/*
* Author : nicopicko
* Date : Jan. 7, 2021
*/
public class J2_TimeToDecompress
	{

		public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);
				int lines = sc.nextInt();
				int nombre[] = new int [lines];
				String character[] = new String [lines];
				
				for(int i = 0; i < lines; i++)
				{
				nombre[i] = sc.nextInt();
				character[i] = sc.next();
				}
				
				for(int i = 0; i < lines; i++)
				{
					for(int j = 0; j < nombre[i]; j++)
					{
						System.out.print(character[i]);
					}
				System.out.println();
				}
				sc.close();
			}

	}
