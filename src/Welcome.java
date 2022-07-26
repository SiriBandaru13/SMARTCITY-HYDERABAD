package smartcity;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class Welcome extends JFrame {

	private JPanel contentPane;
	int x=0;
	Timer tm;JLabel pic;
	String[] list=
		{
				
				"C:\\Users\\siri\\OneDrive\\Pictures\\pics\\pic7.jpg"
				
			
			
	};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Welcome() {
		setTitle("Smart City");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1500, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.lightGray);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	    setBackground(Color.BLACK);
	    pic=new JLabel();
		pic.setBounds(0, 0, 1500, 750);
		pic.setVisible(true);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("Serif", Font.BOLD, 18));
		label.setForeground(Color.black);
		label.add(pic);
		 tm = new Timer(20,new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent e) {
	                SetImageSize(x);
	                x += 1;
	                if(x >= list.length )
	                    x = 0; 
	            }
	        });
		
	        tm.start();
		label.setBounds(0, 50, 1500, 750);
		contentPane.add(label);
        JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBackground(Color.WHITE);
		contentPane.add(btnLogin);
		btnLogin.setBounds(1120, 11, 89, 23);
		

		
		JButton btnSignup = new JButton("Signup");
		btnSignup.setForeground(Color.BLACK);
		btnSignup.setBackground(Color.WHITE);
		contentPane.add(btnSignup);
		btnSignup.setBounds(1219, 11, 89, 23);
		
		JLabel lblNewLabel = new JLabel("SMART CITY");
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setForeground(Color.black);
		lblNewLabel.setBounds(10, 7, 350, 25);
		btnSignup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

			}
		});
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Signup s = new Signup();
				s.show();
			}
		});
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

			}
		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login l = new Login();
				l.show();
			}
		});
	}
	public void SetImageSize(int i)
	{
		ImageIcon icon=new ImageIcon(list[i]);
		Image img=icon.getImage();
		Image newImg=img.getScaledInstance(2000, 1000, Image.SCALE_SMOOTH);
		ImageIcon newImc=new ImageIcon(newImg);
		pic.setIcon(newImc);
		
	}

}
