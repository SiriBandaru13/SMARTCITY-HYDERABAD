package smartcity;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java. io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class City extends JFrame {

    
    private JList citylist;
    private DefaultListModel listarray;
	private JPanel contentPane;
	private JButton btnCancel,sb;
	private JTextField txt;
	private JLabel back;
	JLabel pic,disp1,disp2,disp3,disp4;
	String[] cities={
			"Hyderabad"
	};
	/**
	 * Launch the application.
	 */
	public static void main(String []args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				   City frame = new City();
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
	
	public String store;
    Hyderabad h = new Hyderabad();

    private JLabel view;
    public void addlist()
     {
       listarray.addElement("Hyderabad");
       contentPane.add(view);
       citylist = new JList(listarray);
       contentPane.add(citylist);
       citylist.setVisibleRowCount(3);
       JScrollPane p=new JScrollPane(citylist);
      contentPane.add(p);
       this.add(txt);
       pic.add(sb);
       submithandler sth=new submithandler();
       sb.addActionListener(sth);
       
   }
    
    class submithandler implements ActionListener
    {
        @Override
       public void actionPerformed(ActionEvent e)
       {
           
            
         if(store.equals("Hyderabad"))
            {
                h.show();
            }
             
    }
    
}


    private JComboBox comboBox;
	public City() {
		setTitle("Choose City");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100, 1500, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	    setBackground(Color.BLACK);
	    pic=new JLabel();
		pic.setBounds(0, 0, 1500, 750);
		pic.setVisible(true);
		contentPane.add(pic);
		
		
		
		disp1=new JLabel();
		disp1.setBounds(50,50,500,500);
		disp1.setVisible(true);
		pic.add(disp1);
		SetImageSize(disp1,new ImageIcon("E:\\SmartCity\\smartcity\\images\\img1.jpg"));
		
	
		JTextArea textArea_1 = new JTextArea();

      
        
        String text1="Hyderabad is the capital of the southern Indian state of Telangana and de jure capital of Andhra Pradesh.[A] Occupying 650 square kilometres (250 sq mi) along the banks of the Musi River, it has a population of about 6.7 million and a metropolitan population of about 7.75 million, making it the fourth most populous city and sixth most populous urban agglomeration in India. At an average altitude of 542 metres (1,778 ft), much of Hyderabad is situated on hilly terrain around artificial lakes, including Hussain Sagar—predating the city's founding—north of the city centre.The historic city established by Muhammad Quli Qutb Shah on the southern side of the Musi River forms the heritage region of Hyderabad called the Purana Shahar (Old City), while the New City encompasses the urbanised area on the northern banks. The two are connected by many bridges across the river, the oldest of which is Purana Pul—(old bridge) built in 1578 AD. Hyderabad is twinned with neighbouring Secunderabad, to which it is connected by Hussain Sagar. Many historic and heritage sites lie in south central Hyderabad, such as the Charminar, Mecca Masjid, Salar Jung Museum, Nizam Museum, Telangana High Court, Falaknuma Palace, Chowmahalla Palace and the traditional retail corridor comprising the Pearl Market, Laad Bazaar and Madina Circle. North of the river are hospitals, colleges, major railway stations and business areas such as Begum Bazaar, Koti, Abids, Sultan Bazar and Moazzam Jahi Market, along with administrative and recreational establishments such as the Reserve Bank of India, the Telangana Secretariat, the India Government Mint, the Telangana Legislature, the Public Gardens, the Nizam Club, the Ravindra Bharathi, the State Museum, the Birla Temple and the Birla Planetarium. North of central Hyderabad lie Hussain Sagar, Tank Bund Road, Rani Gunj and the Secunderabad railway station.[135] Most of the city's parks and recreational centres, such as Sanjeevaiah Park, Indira Park, Lumbini Park, NTR Gardens, the Buddha statue and Tankbund Park are located here.[53] In the northwest part of the city there are upscale residential and commercial areas such as Banjara Hills, Jubilee Hills, Begumpet, Khairtabad, Tolichowki, Jagannath Temple and Miyapur";
        textArea_1.setBackground(Color.WHITE);
        textArea_1.setText(text1);
        textArea_1.setCaretPosition(0);
        JScrollPane scrollPane1 = new JScrollPane(textArea_1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pic.add(scrollPane1);
        scrollPane1.setBounds(595,50, 500,400);
        textArea_1.setLineWrap(true);
        textArea_1.setWrapStyleWord(true);
        textArea_1.setEditable(false);
        
		listarray=new DefaultListModel();
	    txt=new JTextField(15);
	    sb=new JButton("Submit");
	    sb.setBackground(Color.WHITE);
	    sb.setForeground(Color.BLACK);
	    sb.setBounds(595, 650, 80, 25);
	    sb.setVisible(true);
	    btnCancel=new JButton("CLOSE");
	    view=new JLabel("Select a city!");
	    view.setFont(getFont());
	    view.setForeground(Color.WHITE);
	    comboBox = new JComboBox();
	    comboBox.setBounds(595, 500, 189, 41);
		view.setBounds(595, 450, 200, 40);
	    view.setVisible(true);
	    int count=0;
	    for(int i = 0; i < cities.length; i++) 
	    	comboBox.addItem(cities[count++]); 
	
		sb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

			}
		});
	 sb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String selected=(String)comboBox.getSelectedItem();
				
			 if(selected.equals("Hyderabad")){
					h.show();
				}
			}
		});
	
		
	
	        
	        getContentPane().setLayout(null);

	        JLabel lblNewLabel = new JLabel("CHOOSE A CITY");
			contentPane.add(lblNewLabel);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setBounds(10, 7, 300, 25);
	        contentPane.add(pic);
	        contentPane.add(view);
	        contentPane.add(comboBox);
	
	        
	        comboBox.setVisible(true);
	       
	        pic.add(sb);
	        setLocationRelativeTo(null);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
			
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	
	
	}
	
	public void SetImageSize()
	{
		ImageIcon icon=new ImageIcon("E:\\SmartCity\\smartcity\\images\\img1.jpg");
		Image img=icon.getImage();
		Image newImg=img.getScaledInstance(back.getWidth(), back.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc=new ImageIcon(newImg);
		back.setIcon(newImc);
		
	}
	public void SetImageSize(JLabel label,ImageIcon im)
	{
		ImageIcon icon=im;
		Image img=icon.getImage();
		Image newImg=img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc=new ImageIcon(newImg);
		label.setIcon(newImc);
		
	}
	
	
}