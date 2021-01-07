import java.util.Scanner;
/*
* Author : nicopicko
* Date : Jan. 6, 2021
*/
public class J2_HappyOrSad
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				String message = sc.nextLine();
				int counter = 0;
				boolean isThere = false;
				
				for(int i = 0; i < message.length(); i++)
				{
					if(message.charAt(i) == ':' && message.charAt(i+1) == '-')
					{
						if(message.charAt(i + 2) == ')')
						{
							counter ++;
							isThere = true;
						}
						else if(message.charAt(i + 2) == '(')
						{
							counter --;
							isThere = true;
						}
					}
					if(counter > 0)
					{
						System.out.println("happy");
					}
					else if(counter < 0)
					{
						System.out.println("sad");
					}
					else if(counter == 0 && isThere)
					{
						System.out.println("unsure");
					}
					else
					{
						System.out.println("none");
					}
				}
			}

	}
