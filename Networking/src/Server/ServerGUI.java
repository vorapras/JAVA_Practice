package Server;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ServerGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnOpen;
	private JTextArea textArea;
	private JButton btnSEND;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerGUI frame = new ServerGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
Server xServer;
	/**
	 * Create the frame.
	 */
	public ServerGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnOpen = new JButton("OPEN");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				xServer = new Server(new MsgReceive(){

					@Override
					public void getMsg(String s) {
						// TODO Auto-generated method stub
						textArea.setText(textArea.getText()+"\r\n client :"+ s);
					}
				
				});	
			}
		});
		btnOpen.setBounds(16, 6, 117, 29);
		contentPane.add(btnOpen);
		
		textArea = new JTextArea();
		textArea.setBounds(16, 37, 415, 344);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(16, 405, 282, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnSEND = new JButton("SEND");
		btnSEND.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(xServer == null)
				{
					JOptionPane.showMessageDialog(ServerGUI.this, "Please Push Open Button First");
					return;
				}
				xServer.sendAll(textField.getText());
				textField.setText("");
			}
		});
		btnSEND.setBounds(310, 405, 117, 29);
		contentPane.add(btnSEND);
	}

}
