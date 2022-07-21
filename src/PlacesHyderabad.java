package smartcity;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class PlacesHyderabad extends JPanel {
    JButton ptv,hotels,b_l,goback; 
    JLabel back1;
	/**
	 * Create the panel.
	 */
	public PlacesHyderabad() {
		setLayout(null);
		String text=" Birla Mandir is a Hindu temple, built on a 280 feet (85 m) high hillock called Naubath Pahad on a 13 acres (53,000 m2) plot. The construction took 10 years and was constructed in 1976 by Swami Ranganathananda of Ramakrishna Mission. The temple was constructed by Birla Foundation, which has also constructed several similar temples across India, all of which are known as Birla Mandir.";	
       setBackground(Color.BLACK);
        back1= new JLabel("");
		back1.setBounds(0, 0, 1362, 739);
		back1.setVisible(true);
	    ptv= new JButton("PLACES TO VISIT");
		
		ptv.setFont(new Font("Liberation Serif", Font.ITALIC, 15));
		ptv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 FrameDisplayHyd.frame.remove(FrameDisplayHyd.panel);
				 FrameDisplayHyd.frame.setContentPane(new PlacesHyderabad());
				 FrameDisplayHyd.frame.setVisible(true);
			}
		});
		ptv.setForeground(Color.WHITE);
		ptv.setBackground(Color.BLACK);
		ptv.setBounds(0, 0, 200, 34);
		back1.add(ptv);
		

		
		hotels = new JButton("HOTELS");
        hotels.setForeground(Color.WHITE);
		hotels.setFont(new Font("Dialog", Font.ITALIC, 15));
		hotels.setBackground(Color.BLACK);
		hotels.setBounds(199, 0, 200, 34);
		back1.add(hotels);
		hotels.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 FrameDisplayHyd.frame.remove( FrameDisplayHyd.panel);
				 FrameDisplayHyd.frame.setContentPane(new HotelsHyd());
				 FrameDisplayHyd. frame.setVisible(true);
			}
		});
		hotels.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		goback= new JButton("BACK");
		goback.setFont(new Font("Dialog", Font.ITALIC, 15));
		goback.setForeground(Color.WHITE);
		goback.setBackground(Color.gray);
		goback.setBounds(1150, 0, 200, 34);
		back1.add(goback);
		goback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hyderabad b=new Hyderabad();
				 b.Slideshow();
				b.show();
			}
		});
		b_l = new JButton("BOARDING AND LODGING");
		b_l.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameDisplayHyd.frame.remove( FrameDisplayTest.panel);
				 FrameDisplayHyd.frame.setContentPane(new BLHyd());
				 FrameDisplayHyd. frame.setVisible(true);
			}
		});
		b_l.setForeground(Color.WHITE);
		b_l.setFont(new Font("Dialog", Font.ITALIC, 15));
		b_l.setBackground(Color.BLACK);
		b_l.setBounds(397, 0, 250, 34);
		back1.add(b_l);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setText(text);
		textArea_1.setLineWrap(true);
		textArea_1.setWrapStyleWord(true);
		textArea_1.setEditable(false);
		textArea_1.setCaretPosition(0);
		 JScrollPane scrollPane1 = new JScrollPane(textArea_1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane1.setBounds(300, 100, 250,150);
		 back1.add(scrollPane1);
		add(back1);
		
		JLabel lalbagh = new JLabel("");
		lalbagh.setBounds(100, 100, 200, 150);
		SetImageSize(lalbagh,new ImageIcon("E:\\SmartCity\\smartcity\\images\\birla-mandir.jpg"));
		back1.add(lalbagh);
		
		JLabel title1 = new JLabel("GARDENS");
		title1.setBounds(101,68, 55, 14);
		
		JLabel title2 = new JLabel("AMUSEMENT PARKS");
		title2.setBounds(101,268, 155, 14);
		
		String text2="Makkah Masjid, is one of the oldest mosques in Hyderabad, Telangana in India, and it is one of the largest masajids in India. Makkah Masjid is a listed heritage building in the old city of Hyderabad, close to the historic landmarks of Chowmahalla Palace, Laad Bazaar, and Charminar. ";
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBackground(Color.WHITE);
		textArea_2.setText(text2);
		textArea_2.setLineWrap(true);
		textArea_2.setWrapStyleWord(true);
		textArea_2.setEditable(false);
		textArea_2.setCaretPosition(0);
		 JScrollPane scrollPane2 = new JScrollPane(textArea_2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane2.setBounds(1000,100,250,150);
		 back1.add(scrollPane2);
		
		JLabel cubbonpark = new JLabel("");
		cubbonpark.setBounds(800, 100, 200, 150);
		SetImageSize(cubbonpark,new ImageIcon("E:\\SmartCity\\smartcity\\images\\Makkah-Masjid.jpg"));
		back1.add(cubbonpark);
		
		String text3="Hussain Sagar is a lake in Hyderabad, Telangana, India, built by Hazrat Hussain Shah Wali in 1562, during the rule of Ibrahim Quli Qutub Shah. It is spread across an area of 5.7 square kilometers and is fed by River Musi. A large monolithic statue of the Gautama Buddha, erected in 1992, stands on an island in the middle of the lake. It also separates Hyderabad from its twin citySecunderabad.The maximum depth of the lake is 32 feet.";
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBackground(Color.WHITE);
		textArea_3.setText(text3);
		textArea_3.setLineWrap(true);
		textArea_3.setWrapStyleWord(true);
		textArea_3.setEditable(false);
		textArea_3.setCaretPosition(0);
		 JScrollPane scrollPane3 = new JScrollPane(textArea_3,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane3.setBounds(300,300,250,150);
		 back1.add(scrollPane3);
		
		JLabel wonderla = new JLabel("");
		wonderla.setBounds(100, 300, 200, 150);
		SetImageSize(wonderla,new ImageIcon("E:\\SmartCity\\smartcity\\images\\hussain sagar.jpg"));
		back1.add(wonderla);
		
		String text4="Golconda, also known as Golkonda or Golla konda, is a citadel and fort in Southern India and was the capital of the medieval sultanate of the Qutb Shahi dynasty (c.1518–1687), is situated 11 kilometres (6.8 mi) west of Hyderabad. It is also atehsil of Hyderabad district, Telangana, India. The region is known for the mines that have produced some of the world's most famous gems, including the Koh-i-Noor, the Hope Diamond and the Nassak Diamond.";
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBackground(Color.WHITE);
		textArea_4.setText(text4);
		textArea_4.setLineWrap(true);
		textArea_4.setWrapStyleWord(true);
		textArea_4.setEditable(false);
		textArea_4.setCaretPosition(0);
		 JScrollPane scrollPane4 = new JScrollPane(textArea_4,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane4.setBounds(1000,300,250,150);
		 back1.add(scrollPane4);
		
		JLabel ifc = new JLabel("");
		ifc.setBounds(800, 300, 200, 150);
		SetImageSize(ifc,new ImageIcon("E:\\SmartCity\\smartcity\\images\\Golconda-Fort.jpg"));
		
		back1.add(ifc);
		
		JLabel title3 = new JLabel("TEMPLES");
		title3.setBounds(101,468, 55, 14);
		
		JLabel dg = new JLabel("");
		dg.setBounds(100, 500, 200, 150);
		SetImageSize(dg,new ImageIcon("E:\\SmartCity\\smartcity\\images\\salar-jung-museum.jpg"));
		back1.add(dg);
		
		String text6=" The Salar Jung Museum is an art museum located at Darushifa, on the southern bank of the Musi river in the city of Hyderabad,Telangana, India. It is one of the three National Museums of India.[2] It has a collection of sculptures, paintings, carvings, textiles, manuscripts, ceramics, metallic artefacts, carpets, clocks, and furniture from Japan, China, Burma, Nepal, India, Persia, Egypt,Europe, and North America. The museum's collection was sourced from the property of the Salar Jung family. It is one of the largestmuseums in the country.";
		JTextArea textArea_6 = new JTextArea();
		textArea_6.setBackground(Color.WHITE);
		textArea_6.setText(text6);
		textArea_6.setLineWrap(true);
		textArea_6.setWrapStyleWord(true);
		textArea_6.setEditable(false);
		textArea_6.setCaretPosition(0);
		 JScrollPane scrollPane6 = new JScrollPane(textArea_6,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		 scrollPane6.setBounds(300,500,250,150);
		 back1.add(scrollPane6);
		
		 JLabel iskcon = new JLabel("");
			iskcon.setBounds(800, 500, 200, 150);
			SetImageSize(iskcon,new ImageIcon("E:\\SmartCity\\smartcity\\images\\charminar.jpg"));
			back1.add(iskcon);
			
			String text7="The Charminar, constructed in 1591 CE, is a monument and mosque located in Hyderabad, Telangana, India. The landmark has become a global icon of Hyderabad, listed among the most recognized structures of India.The Charminar is situated on the east bank of Musi river. To the west lies the Laad Bazaar, and to the southwest lies the richly ornamented granite Makkah Masjid. It is listed as an archaeological and architectural treasure on the official  prepared by the Archaeological Survey of India under the The Ancient Monuments and Archaeological Sites and Remains Act.";
			JTextArea textArea_7 = new JTextArea();
			textArea_7.setBackground(Color.WHITE);
			textArea_7.setText(text7);
			textArea_7.setLineWrap(true);
			textArea_7.setWrapStyleWord(true);
			textArea_7.setEditable(false);
			textArea_7.setCaretPosition(0);
			 JScrollPane scrollPane7 = new JScrollPane(textArea_7,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			 scrollPane7.setBounds(1000,500,250,150);
			 back1.add(scrollPane7);

	}
	public void SetImageSize(JLabel label,ImageIcon im)
	{
		ImageIcon icon=im;
		Image img=icon.getImage();
		Image newImg=img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc=new ImageIcon(newImg);
		label.setIcon(newImc);
		
	}
	public static void main(String[] args)
    {   
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
             
            }
        });
    }
}
