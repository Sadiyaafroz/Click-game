import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Click extends JFrame implements Runnable,MouseListener,ActionListener
{
	
	private JLabel score, total;
	private JPanel panel;
	private Font f1;
	private Font f2;
    private JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnExit;
	
	public static int totalScore = 0;
	
	public Click()
	{
		
		super("Click");
		this.setSize(500,550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.PINK);
		
		f1 = new Font("Cambria", Font.BOLD, 20);
		f2 = new Font("Cambria", Font.BOLD, 30);
		
		score = new JLabel("Score: ");
		score.setForeground(Color.BLACK);
		score.setFont(f2);
		score.setBounds(160,50,150,35);
		panel.add(score);
		
		total = new JLabel(""+totalScore);
		total.setForeground(Color.BLUE);
		total.setFont(f2);
		total.setBounds(260,50,150,35);
		panel.add(total);
		
		btn0=new JButton("Click");
        btn1=new JButton("Click");
        btn2=new JButton("Click");
        btn3=new JButton("Click");
        btn4=new JButton("Click");
        btn5=new JButton("Click");
        btn6=new JButton("Click");
        btn7=new JButton("Click");
        btn8=new JButton("Click");
        btn9=new JButton("Click");	
		btnExit=new JButton("EXIT");
		
		btn0.setBounds(50,140,150,40);
		btn0.setFont(f1);
		btn0.setBackground(Color.WHITE);
		btn0.setForeground(Color.BLACK);
		
		btn1.setBounds(250,140,150,40);
		btn1.setFont(f1);
		btn1.setBackground(Color.WHITE);
		btn1.setForeground(Color.BLACK);
		
		btn2.setBounds(50,190,150,40);
		btn2.setFont(f1);
		btn2.setBackground(Color.WHITE);
		btn2.setForeground(Color.BLACK);
		
		btn3.setBounds(250,190,150,40);
		btn3.setFont(f1);
		btn3.setBackground(Color.WHITE);
		btn3.setForeground(Color.BLACK);
		
		btn4.setBounds(50,240,150,40);
		btn4.setFont(f1);
		btn4.setBackground(Color.WHITE);
		btn4.setForeground(Color.BLACK);
		
		btn5.setBounds(250,240,150,40);
		btn5.setFont(f1);
		btn5.setBackground(Color.WHITE);
		btn5.setForeground(Color.BLACK);
		
		btn6.setBounds(50,290,150,40);
		btn6.setFont(f1);
		btn6.setBackground(Color.WHITE);
		btn6.setForeground(Color.BLACK);
		
		btn7.setBounds(250,290,150,40);
		btn7.setFont(f1);
		btn7.setBackground(Color.WHITE);
		btn7.setForeground(Color.BLACK);
		
		btn8.setBounds(50,340,150,40);
		btn8.setFont(f1);
		btn8.setBackground(Color.WHITE);
		btn8.setForeground(Color.BLACK);
		
		btn9.setBounds(250,340,150,40);
		btn9.setFont(f1);
		btn9.setBackground(Color.WHITE);
		btn9.setForeground(Color.BLACK);
		
		btnExit.setBounds(150,420,200,50);
		btnExit.setFont(f1);
		btnExit.setBackground(Color.RED);
		btnExit.setForeground(Color.white);
		
		panel.add(btn0);
		panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
		panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
		panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
		panel.add(btnExit);
		
		btn1.addMouseListener(this);
        btn2.addMouseListener(this);
        btn3.addMouseListener(this);
        btn4.addMouseListener(this);
        btn5.addMouseListener(this);
        btn6.addMouseListener(this);
        btn7.addMouseListener(this);
        btn8.addMouseListener(this);
        btn9.addMouseListener(this);
        btn0.addMouseListener(this);
		btnExit.addMouseListener(this);
		
		btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);
		btnExit.addActionListener(this);
			
		this.add(panel);
    }
		
	
	public void run()
	{
		for(int i=0;i<50;i++)
		{
			try{
				
				Random ran = new Random();
				int num;
				num = ran.nextInt(9);
				
				if (num==0){
					btn0.setBackground(Color.BLUE);
					Thread.sleep(1000);
					btn0.setBackground(Color.WHITE);
				}
				else if (num==1){
					btn1.setBackground(Color.BLUE);
					Thread.sleep(1000);
					btn1.setBackground(Color.WHITE);
				}
				else if (num==2){
					btn2.setBackground(Color.BLUE);
					Thread.sleep(1000);
					btn2.setBackground(Color.WHITE);
				}
				else if (num==3){
					btn3.setBackground(Color.BLUE);
					Thread.sleep(1000);
					btn3.setBackground(Color.WHITE);
				}
				else if (num==4){
					btn4.setBackground(Color.BLUE);
					Thread.sleep(1000);
					btn4.setBackground(Color.WHITE);
				}
				else if (num==5){
					btn5.setBackground(Color.BLUE);
					Thread.sleep(1000);
					btn5.setBackground(Color.WHITE);
				}
				else if (num==6){
					btn6.setBackground(Color.BLUE);
					Thread.sleep(1000);
					btn6.setBackground(Color.WHITE);
				}
				else if (num==7){
					btn7.setBackground(Color.BLUE);
					Thread.sleep(1000);
					btn7.setBackground(Color.WHITE);
				}
				else if (num==8){
					btn8.setBackground(Color.BLUE);
					Thread.sleep(1000);
					btn8.setBackground(Color.WHITE);
				}
				else if (num==9){
					btn9.setBackground(Color.BLUE);
					Thread.sleep(1000);
					btn9.setBackground(Color.WHITE);
				}
				
			}
			catch(Exception e){}
		}
	}
	
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseClicked(MouseEvent me)
	{
		
		
		if(me.getSource() == btn0)
		{
			if (btn0.getBackground() == Color.BLUE)
			{
				totalScore = totalScore + 10;
			    total.setText(""+totalScore);
			}
			
			else
			{
			totalScore = totalScore - 5;
			total.setText(""+totalScore);
			}
		}
		
		if(me.getSource() == btn1)
		{
			if (btn1.getBackground() == Color.BLUE)
			{
				totalScore = totalScore + 10;
			    total.setText(""+totalScore);
			}
			
			else
			{
			totalScore = totalScore - 5;
			total.setText(""+totalScore);
			}
		}
		if(me.getSource() == btn2)
		{
			if (btn2.getBackground() == Color.BLUE)
			{
				totalScore = totalScore + 10;
			    total.setText(""+totalScore);
			}
			
			else
			{
			totalScore = totalScore - 5;
			total.setText(""+totalScore);
			}
		}
		if(me.getSource() == btn3)
		{
			if (btn3.getBackground() == Color.BLUE)
			{
				totalScore = totalScore + 10;
			    total.setText(""+totalScore);
			}
			
			else
			{
			totalScore = totalScore - 5;
			total.setText(""+totalScore);
			}
		}
		
		if(me.getSource() == btn4)
		{
			if (btn4.getBackground() == Color.BLUE)
			{
				totalScore = totalScore + 10;
			    total.setText(""+totalScore);
			}
			
			else
			{
			totalScore = totalScore - 5;
			total.setText(""+totalScore);
			}
		}
		
		if(me.getSource() == btn5)
		{
			if (btn5.getBackground() == Color.BLUE)
			{
				totalScore = totalScore + 10;
			    total.setText(""+totalScore);
			}
			
			else
			{
			totalScore = totalScore - 5;
			total.setText(""+totalScore);
			}
		}
		
		if(me.getSource() == btn6)
		{
			if (btn6.getBackground() == Color.BLUE)
			{
				totalScore = totalScore + 10;
			    total.setText(""+totalScore);
			}
			
			else
			{
			totalScore = totalScore - 5;
			total.setText(""+totalScore);
			}
		}
		
		if(me.getSource() == btn7)
		{
			if (btn7.getBackground() == Color.BLUE)
			{
				totalScore = totalScore + 10;
			    total.setText(""+totalScore);
			}
			
			else
			{
			totalScore = totalScore - 5;
			total.setText(""+totalScore);
			}
		}
		
		if(me.getSource() == btn8)
		{
			if (btn8.getBackground() == Color.BLUE)
			{
				totalScore = totalScore + 10;
			    total.setText(""+totalScore);
			}
			
			else
			{
			totalScore = totalScore - 5;
			total.setText(""+totalScore);
			}
		}
		
		if(me.getSource() == btn9)
		{
			if (btn9.getBackground() == Color.BLUE)
			{
				totalScore = totalScore + 10;
			    total.setText(""+totalScore);
			}
			
			else
			{
			totalScore = totalScore - 5;
			total.setText(""+totalScore);
			}
		}
			
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String exit = ae.getActionCommand();
		if(exit.equals(btnExit.getText()))
		{
			System.exit(0);
		}
	}
	
	
}