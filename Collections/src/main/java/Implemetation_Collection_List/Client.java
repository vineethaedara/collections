package Implemetation_Collection_List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



import java.util.ArrayList;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Logger logger=LogManager.getLogger(Client.class);
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> l=new ArrayList<Integer>();
		List_Implementations operations=new List_Implementations();
		for(int i=0;i<10;i++) {
		l.add(i);
		}
		int choice;
		logger.info("Initially The Elements in the list are:"+l);
		while(true) {
			
			try {
				logger.info("Enter choice\n1.Add\n2.Remove\n3.Fetch\n4.Print\n5.exit");
				String choice1=scan.next();
				choice=Integer.parseInt(choice1);
				if (choice==5) {
					logger.info(".....You exited.....");
					return ;
				}
				if(choice>5||choice<=0) {
					logger.warn("...please enter valid choices given in menu...");
					continue;
				}
				
				
				
				if (choice==1) {
					logger.info("Enter element:");
					
					int ele=scan.nextInt();
					logger.info("Before adding the element:\nThe List is:"+l);
					operations.Add(l,ele);
					
					logger.info("You Successfully added the element into the list");
					logger.info("After adding the element:\nThe List is:"+l);
					
				}
				else if(choice==2) {
					logger.info("Enter the element that you have to remove the element from the list:");
					int ele=scan.nextInt();
					logger.info("Before removing the element:\nThe List is:"+l);
					String s=operations.Remove(l,ele);
					if(s.equals("yes")) {
						logger.info("yes.The Element "+ele+" is removed from the list");
						logger.info("After removing the element:\nThe List is:"+l);
					}
					else {
						logger.info(s);
					}
				}
				else if(choice==3) {
					logger.info("Enter the index that you have to remove the element from the list:");
					int index=scan.nextInt();
					
					if(index>l.size()) {
						logger.info("Sorry.You have only the size of the list is"+l.size());
					}
					else {
						int element=operations.Fetch(l, index);
					logger.info("The Element "+element+" is at the position"+index);
					}
				}
				else if(choice==4) {
					logger.info("The Elements in the list are:");
					logger.info(l);
				}
		
			}
			catch(Exception e) {
				logger.info("....enter values in numbers only...");
			}
		}
	}

}
