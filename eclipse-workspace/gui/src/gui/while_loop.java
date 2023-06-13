package gui;

import javax.swing.JOptionPane;

public class while_loop 
{
	public static void main(String[]ages)
	{
		/*
		//.......................revers number.....................................
		String n=JOptionPane.showInputDialog("enter n value");
		int n_num=Integer.parseInt(n);
		int s=0,d;
		while(n_num > 0)
		{
			d=n_num % 10;
			s=s*10-d;
			n_num=n_num/10;
		}
		JOptionPane.showMessageDialog(null, "revers of the given values is \n" +s);
		*/
		String f=JOptionPane.showInputDialog("prime number from");
		int f_num=Integer.parseInt(f);
		String l=JOptionPane.showInputDialog("prime number upto");
		int l_num=Integer.parseInt(l);
		//JOptionPane.showMessageDialog(null, "prime number from "+f+" to "+l);
		int n,c,i,j;
		n=f_num;
		{
			while(n<=1)
			{
				c=0;
				i=2;
				while(i<n/2)
				{
					if(n%i ==0)
					{
						c++;
					}
					i++;
				}
				if(c == 0 && n!= 1)
				{
					JOptionPane.showMessageDialog(null, " "+n);
				}
				
				
				
				n++;
				
			}
		}
		
	}

}
