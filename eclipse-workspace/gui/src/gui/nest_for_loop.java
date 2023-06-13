package gui;

import javax.swing.JOptionPane;

public class nest_for_loop
{
	public static void main(String[]ages)
	{
		String n = JOptionPane.showInputDialog("Enter n value");
        int n_num = Integer.parseInt(n);
        
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                JOptionPane.showMessageDialog(null, n_num + " ");
            }
            JOptionPane.showMessageDialog(null, " ");
        }
		
	}

}
