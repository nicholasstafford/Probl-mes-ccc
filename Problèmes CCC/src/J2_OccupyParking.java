import java.util.Scanner;
/*
* Author : nicopicko
* Date : Jan. 7, 2021
*/
public class J2_OccupyParking
	{

		public static void main(String[] args)
			{
				Scanner sc = new Scanner(System.in);
				int counter = 0;
				int number = sc.nextInt(); 
				sc.nextLine();
				String today = sc.nextLine();
				String yesterday = sc.nextLine();
				
				
				for(int i = 0; i < number; i++)
				{
					if(yesterday.charAt(i) == today.charAt(i) && today.charAt(i) == 'C')
					{
						counter++;
					}
				
				}
				System.out.println(counter);
				

			}

	}
