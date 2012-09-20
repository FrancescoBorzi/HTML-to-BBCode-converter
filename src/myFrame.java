import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame
{
	public static myFrame frame = new myFrame();
	private JMenuBar myMenuBar = new JMenuBar();

	private JMenu File = new JMenu();
	private JMenu Tools = new JMenu();

	// File
	private JMenuItem ImportHTML = new JMenuItem();
	private JMenuItem ImportBBCode = new JMenuItem();
	private JMenuItem SaveHTML = new JMenuItem();
	private JMenuItem SaveBBCode = new JMenuItem();
	private JMenuItem Exit = new JMenuItem();

	// Tools
	private JMenuItem Palette = new JMenuItem();
	
	// Panels
	private JPanel panelHTMLbuttons = new JPanel();
	private JPanel panelBBCodebuttons = new JPanel();
	
	// Texts
	private JTextArea textHTML = new JTextArea(10, 10);
	private JTextArea textBBCode = new JTextArea(10, 10);
	
	// Buttons
	private JButton check1 = new JButton("Check code");
	private JButton check2 = new JButton("Check code");
	private JButton convert1 = new JButton("Convert to BBCode");
	private JButton convert2 = new JButton("Convert to HTML");
	

	// TextArea

	private myFrame()	{ initFrame(); }
	private void initFrame()
	{
		Toolkit myKit=Toolkit.getDefaultToolkit();
		Dimension myScreenSize = myKit.getScreenSize();

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("HTML-BBCode converter");
		this.setVisible(true);
		this.setSize(myScreenSize.width/2, myScreenSize.height/2);
		this.setLocation(myScreenSize.width/4, myScreenSize.height/4);

		File.setText("File");
		Tools.setText("Tools");

		ImportHTML.setText("Import HTML..");
		ImportBBCode.setText("Import BBCode..");
		SaveHTML.setText("Save HTML");
		SaveBBCode.setText("Save BBCode");
		Exit.setText("Exit");
		Palette.setText("Palette");
		
		this.setJMenuBar(myMenuBar);
		this.add(panelHTMLbuttons, BorderLayout.LINE_START);
		this.add(panelBBCodebuttons, BorderLayout.LINE_END);
		
		panelHTMLbuttons.add(check1);
		panelHTMLbuttons.add(convert1);
		panelBBCodebuttons.add(check2);
		panelBBCodebuttons.add(convert2);
		

		/*Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
		Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit.png")));
		Exit.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				System.exit(0);
			}
		});

		TextArea.setLineWrap(true);*/

		this.setJMenuBar(myMenuBar);

		myMenuBar.add(File);
		myMenuBar.add(Tools);

		File.add(ImportHTML);
		File.add(ImportBBCode);
		File.add(SaveHTML);
		File.add(SaveBBCode);
		File.add(Exit);
		
		Tools.add(Palette);

		/* this.add(Scroll); */
	}

	public static myFrame getFrame()	{ return frame; }
}

