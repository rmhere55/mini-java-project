package digital_cllock;
import java.awt.Font;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class My_window  extends JFrame
{
	private JLabel heading;
	private JLabel clockLabel;
	private Font  font = new Font ( "", Font.BOLD ,   35);
My_window(){
	super.setTitle("MY Clock");
	super.setSize(400, 400);
	super.setLocation(600, 300);
//    super.setVisible(true);
    this.createGUI();
    this.startClock();
    super.setVisible(true);
}
public void createGUI() {
	heading = new JLabel ( " MY Clock");
	clockLabel =new JLabel("Clock");
	heading.setFont(font);
	
	
   clockLabel.setFont(font);
   
   
       
   
   this.setLayout(new GridLayout(2,1));
   this.add(heading);
   this.add(clockLabel);
}
public void startClock() {
	Timer  timer = new Timer(1000 , new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
//			String dateTimer = new Date().toLocaleString();
			Date d = new Date();
			SimpleDateFormat  sfd = new SimpleDateFormat("hh:mm:ss:"+"dd:mm:y");
			
			String dateTime = sfd.format(d);
			clockLabel.setText(dateTime);
		}
		
	});
	timer.start();
}






}
