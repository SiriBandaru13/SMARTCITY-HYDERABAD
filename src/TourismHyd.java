package smartcity;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import smartcity.Hyderabad;

public class TourismHyd extends JFrame {

	private JPanel contentPane;
	JLabel back ,disp1,pic;
	private JButton hotels,goback;
	private JButton b_l;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new TourismHyd();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TourismHyd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 800);
		contentPane = new JPanel();
		JScrollPane scrPane = new JScrollPane(contentPane,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		         JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		getContentPane().add(scrPane);
		
		
		back= new JLabel("");
		back.setBounds(0, 0, 1362, 739);
		contentPane.add(back);
		
		JButton ptv = new JButton("PLACES TO VISIT");
		
		ptv.setFont(new Font("Liberation Serif", Font.ITALIC, 15));
		ptv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ptv.setForeground(Color.BLACK);
		ptv.setBackground(Color.WHITE);
		ptv.setBounds(0, 0, 200, 34);
		back.add(ptv);
		
		hotels = new JButton("HOTELS");
		back.add(hotels);
		hotels.setForeground(Color.BLACK);
		hotels.setFont(new Font("Dialog", Font.ITALIC, 15));
		hotels.setBackground(Color.WHITE);
		hotels.setBounds(199, 0, 200, 34);
		
		goback= new JButton("BACK");
		goback.setFont(new Font("Dialog", Font.ITALIC, 15));
		goback.setForeground(Color.WHITE);
		goback.setBackground(Color.gray);
		goback.setBounds(1150, 0, 200, 34);
		back.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hyderabad b=new Hyderabad();
				 b.Slideshow();
				b.show();
			}
		});
		
		b_l = new JButton("BOARDING AND LODGING");
		back.add(b_l);
		b_l.setForeground(Color.BLACK);
		b_l.setFont(new Font("Dialog", Font.ITALIC, 15));
		b_l.setBackground(Color.WHITE);
		b_l.setBounds(397, 0, 250, 34);
		setLocationRelativeTo(null);
		
		
		
		ptv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
	
			}
		});
		ptv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}
	public void SetImageSize()
	{
		ImageIcon icon=new ImageIcon("E:\\SmartCity\\smartcity\\images\\img4.jpg");
		Image img=icon.getImage();
		Image newImg=img.getScaledInstance(back.getWidth(), back.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc=new ImageIcon(newImg);
		back.setIcon(newImc);
		
	}
}
