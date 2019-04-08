import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Demo1 {

	int row = 1;
	int row2 = 1;

	private JFrame frame;
	private JTextField nameField;
	private JButton btnNewButton;
	private JTextField txtJayApp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo1 window = new Demo1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Demo1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Jay's Demo Application");
		frame.getContentPane().setForeground(new Color(135, 113, 72));
		frame.setBounds(100, 100, 531, 373);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton nameButton = new JButton("Run Query 1");
		nameButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		nameButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				nameField.setText("Query Executed");
				System.out.println("running sql statement...");
				System.out.println("");
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr");
					Statement st = conn.createStatement();
					String sql = "select * from JOBS J";
					ResultSet rs = st.executeQuery(sql);
					while (rs.next())
						System.out.printf("%4s", row + "." + " " + rs.getString(1) + " " + rs.getString(2) + " "
								+ rs.getInt(3) + " " + rs.getInt(4) + "\n", row++);

					conn.close();
					System.out.println("Program End.");

				} catch (Exception e) {
					System.out.println(e.toString());

				}
			}
		});
		nameButton.setToolTipText("Click with Mouse");
		nameButton.setBounds(198, 18, 117, 34);
		frame.getContentPane().add(nameButton);

		nameField = new JTextField();
		nameField.setBackground(new Color(0, 0, 0));
		nameField.setEditable(false);
		//nameField.setForeground(Color.BLACK);
		nameField.setForeground(new Color(183, 146, 77));
		nameField.setFont(new Font("Tahoma", Font.PLAIN, 19));
		nameField.setHorizontalAlignment(SwingConstants.CENTER);
		nameField.setText("Oracle HR App");
		nameField.setBounds(114, 63, 281, 53);
		frame.getContentPane().add(nameField);
		nameField.setColumns(10);

		btnNewButton = new JButton("Run Query 2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtJayApp.setText("Query Executed");
				System.out.println("running sql statement...");
				System.out.println("");
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "oe", "oe");
					Statement st = conn.createStatement();
					String sql = "select c.DATE_OF_BIRTH, c.GENDER from CUSTOMERS C";
					ResultSet rs = st.executeQuery(sql);
					while (rs.next())
						System.out.printf(row2 + "." + " Date Of Birth: " + rs.getDate(1) + " Gender: " + rs.getString(2)
								+ " \n", row2++);

					conn.close();
					System.out.println("Program End.");

				} catch (Exception e2) {
					System.out.println(e2.toString());

				}
			}
		}); 

		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(198, 212, 117, 33);
		frame.getContentPane().add(btnNewButton);
		
		
		txtJayApp = new JTextField();
		txtJayApp.setEditable(false);
		txtJayApp.setHorizontalAlignment(SwingConstants.CENTER); 
		txtJayApp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtJayApp.setText("Oracle OE App");
		txtJayApp.setForeground(new Color(183, 146, 77));
		txtJayApp.setBackground(new Color(0, 0, 0));
		txtJayApp.setBounds(114, 256, 281, 53);
		frame.getContentPane().add(txtJayApp);
		txtJayApp.setColumns(10);

	}
}
