package tij;

public class InterThreadCommunication {

	public static void main(String[] args) {
		
				//Thread 1 Average of Numbers 1-50
				Runnable r1=()->{};
				Thread t1=new Thread(r1);
				t1.start();
				int sum=0;
				for(int i=1;i<50;i++)
				{
					sum +=i;
				}
				System.out.println("(Thread 1)Average is: "+sum);
				// Thread 2 Calculating square of Array elements
				Runnable r2=()->{};
				Thread t2=new Thread(r2);
				t2.start();
				int[] arr = {10, 15, 20, 25, 30};
				System.out.println("(Thread 2) Square of Array ");
				for (int number : arr) {
					
		            System.out.println(number + " is: " + (number * number));
		        }
				
			}

		


	}


