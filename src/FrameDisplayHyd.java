package smartcity;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class FrameDisplayHyd 
{
    /*
     * Creating an object of JFrame instead of extending it 
     * has no side effects.
     */
    static JFrame frame;
    static JPanel panel, panel1;
    private JButton hotels;
	private JButton b_l,goback;
	private JLabel back,back1;
	JButton ptv ;
    public FrameDisplayHyd()
    {
        frame = new JFrame("Tourism");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        
        panel = new JPanel();
        JScrollPane scrPane = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		         JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
       
       scrPane.setVisible(true);
      
        
		panel.setLayout(new BorderLayout(5,5));
		back= new JLabel("");
		back.setBounds(0, 0, 1500, 750);
		panel.add(back);
		panel.setBackground(Color.BLACK);

		ptv= new JButton("PLACES TO VISIT");
		ptv.setFont(new Font("Dialog", Font.ITALIC, 15));
		ptv.setForeground(Color.WHITE);
		ptv.setBackground(Color.black);
		ptv.setBounds(0, 0, 200, 34);
		back.add(ptv);
		ptv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frame.remove(panel);
	                frame.setContentPane(new PlacesHyderabad());
	                frame.setVisible(true);
			}
		});
		ptv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
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
		hotels = new JButton("HOTELS");
		hotels.setForeground(Color.WHITE);
		hotels.setFont(new Font("Dialog", Font.ITALIC, 15));
		hotels.setBackground(Color.black);
		hotels.setBounds(199, 0, 200, 34);
		back.add(hotels);
		
		hotels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frame.remove(panel);
	                frame.setContentPane(new HotelsHyd());
	                frame.setVisible(true);
			}
		});
		hotels.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		b_l = new JButton("BOARDING AND LODGING");
		b_l.setForeground(Color.WHITE);
		b_l.setFont(new Font("Dialog", Font.ITALIC, 15));
		b_l.setBackground(Color.BLACK);
		b_l.setBounds(397, 0, 250, 34);
		back.add(b_l);
	
		b_l.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameDisplayHyd.frame.remove( FrameDisplayHyd.panel);
				 FrameDisplayHyd.frame.setContentPane(new BLHyd());
				 FrameDisplayHyd. frame.setVisible(true);
			}
		});
		b_l.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrameDisplayHyd.frame.remove( FrameDisplayHyd.panel);
				 FrameDisplayHyd.frame.setContentPane(new BLHyd());
				 FrameDisplayHyd. frame.setVisible(true);
			}
		});
		
		
	    frame.setBounds(0,0,1500,800);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
    public void SetImageSize()
	{
		ImageIcon icon=new ImageIcon("C:\\Users\\siri\\OneDrive\\Pictures\\pics\\img3.jpg");
		Image img=icon.getImage();
		Image newImg=img.getScaledInstance(back.getWidth(), back.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc=new ImageIcon(newImg);
		back.setIcon(newImc);
		
	}
    

    public static void main(String[] args)
    {   
       
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new FrameDisplayHyd();
            }
        });
    }
}