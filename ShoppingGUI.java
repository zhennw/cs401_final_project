import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ShoppingGUI implements insterface  {

	private ShoppingCart mycart;
	private ShoppingCart shopcart;
	private ShoppingCart hiscart;
	private JTable table = new JTable();
	private JTable table2 = new JTable();
	private JFrame frame = new JFrame();
	private JButton add = new JButton("Add");
	private JButton remove = new JButton("Remove");
	private JButton changeQty = new JButton("Change");
	private JButton payment = new JButton("Payment");
	private JButton storehistory = new JButton("History");
	private JButton StoreA = new JButton("Store A");
	private JButton StoreB = new JButton("Store B");
	private JButton StoreC = new JButton("Store C");
	private JLabel id = new JLabel();
	private JLabel quantity = new JLabel();
	private JLabel total = new JLabel();
	private JLabel pick = new JLabel();
	private JLabel pickAction = new JLabel();
	private JLabel Store = new JLabel();
	private JLabel Mycart = new JLabel();
	private JTextField idtext = new JTextField();
	private JTextField quantitytext = new JTextField();
	private JTextField totalcost = new JTextField();
	
	
	public ShoppingGUI(ShoppingCart sc1, ShoppingCart sc2, ShoppingCart sc3 )
	{
	 mycart = sc1;
	 shopcart = sc2;
	 hiscart = sc3;
	}
	public void processCommands()
	{
		 Object column[] = {"ID", "Name", "Price", "Quantity"};
		 DefaultTableModel model = new DefaultTableModel();
		 model.setColumnIdentifiers(column);
		 table.setModel(model);
		 DefaultTableModel model2 = new DefaultTableModel();
		 model2.setColumnIdentifiers(column);
		 table2.setModel(model2);

		 totalcost.setBounds(690, 500, 100, 25);
		 quantitytext.setBounds(680, 360, 100, 25);
		 total.setBounds(600, 500, 100, 25);
		 total.setText("Total Cost :");
		 total.setFont(new Font("Serif", Font.PLAIN, 20));
		 quantity.setBounds(600, 360, 100, 25);
		 quantity.setText("Quantity :");
		 quantity.setFont(new Font("Serif", Font.PLAIN, 20));
		 Store.setBounds(200, 0, 100, 25);
		 Store.setText("Store");
		 Store.setFont(new Font("Serif", Font.BOLD, 25));
		 Mycart.setText("My Cart");
		 Mycart.setFont(new Font("Serif", Font.BOLD, 25));
		 Mycart.setBounds(180, 260, 100, 100);
		 pick.setBounds(680, 0, 100, 25);
		 pick.setText("Pick a Store");
		 pick.setFont(new Font("Serif", Font.PLAIN, 20));
		 pickAction.setBounds(680, 130, 150, 25);
		 pickAction.setText("Pick an Action");
		 pickAction.setFont(new Font("Serif", Font.PLAIN, 20));
		 add.setBounds(590, 170, 100, 50);
		 remove.setBounds(690, 170, 100, 50);
		 changeQty.setBounds(790, 170, 100, 50);
		 payment.setBounds(640, 250, 100, 50);
		 storehistory.setBounds(740, 250, 100, 50);
		 StoreA.setBounds(600, 50, 90, 25);
		 StoreB.setBounds(690, 50, 90, 25);
		 StoreC.setBounds(780, 50, 90, 25);
		 
		 JScrollPane sp = new JScrollPane(table);
		 sp.setBounds(0, 50, 500, 200);
		 JScrollPane sp2 = new JScrollPane(table2);
		 sp2.setBounds(0, 350, 500, 200);
		 frame.setTitle("Shopping GUI");
		 frame.setLayout(null);
		 frame.add(sp2);
		 frame.add(sp);
		 frame.setSize(1000, 650);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		 //add textbox
		 frame.add(Store);
		 frame.add(Mycart);
		 frame.add(pick);
		 frame.add(pickAction);
		 frame.add(total);
		 frame.add(totalcost);
		 frame.add(quantity);
		 frame.add(StoreA);
		 frame.add(StoreB);
		 frame.add(StoreC);
		 frame.add(add);
		 frame.add(remove);
		 frame.add(changeQty);
		 frame.add(payment);
		 frame.add(storehistory);
		 frame.add(quantitytext);
		 
		 Object[] row = new Object[10];
		 
		 StoreA.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 File file = new File("storeA.txt");
				 try {
					 FileReader fr = new FileReader(file);
					 BufferedReader br = new BufferedReader(fr);
					 int rowCount = model.getRowCount();
					 if(rowCount != 0) {
						 for(int i = rowCount - 1; i  >= 0; i--) {
							 model.removeRow(i);
						 }
					 }
					 Object[] lines = br.lines().toArray();
					 for(int i = 0; i <lines.length; i++) {
						 String[] row = lines[i].toString().split(" ");
						 model.addRow(row);
					 }
					 br.close();
					 fr.close();
				 }catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Someting went wrong");
				 } 
			 }
		});
		 StoreB.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 File file = new File("storeB.txt");
				 try {
					 FileReader fr = new FileReader(file);
					 BufferedReader br = new BufferedReader(fr);
					 int rowCount = model.getRowCount();
					 if(rowCount != 0){
						 for(int i = rowCount - 1; i  >= 0; i--) {
							 model.removeRow(i);
						 }
					 }
					 Object[] lines = br.lines().toArray();
					 for(int i = 0; i <lines.length; i++) {
						 String[] row = lines[i].toString().split(" ");
						 model.addRow(row);
					 }
					 br.close();
					 fr.close();
					
				 }catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Someting went wrong");
				 } 
			 }
		});
		 StoreC.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 File file = new File("storeC.txt");
				 try {
					 FileReader fr = new FileReader(file);
					 BufferedReader br = new BufferedReader(fr);
					 int rowCount = model.getRowCount();
					 if(rowCount != 0) {
						 for(int i = rowCount - 1; i  >= 0; i--) {
							 model.removeRow(i);
						 }
					 }
					 Object[] lines = br.lines().toArray();
					 for(int i = 0; i <lines.length; i++) {
						 String[] row = lines[i].toString().split(" ");
						 model.addRow(row);
					 }
					 br.close();
					 fr.close();
					
				 }catch(Exception e1) {
					JOptionPane.showMessageDialog(null,"Someting went wrong");
				 } 
			 }
		});
		 add.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				
				 for(int i = 0; i < model.getRowCount(); i++) {
					row[0] = model.getValueAt(i, 0);
					row[1] = model.getValueAt(i, 1);
					row[2] = model.getValueAt(i, 2);
					row[3] = quantitytext.getText();
					model2.addRow(row);
					 
				 }
			}
		 });
		 remove.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
					int i = table2.getSelectedRow();
					if ( i >= 0)
					{
						model2.removeRow(i);
					}
					else {
						JOptionPane.showMessageDialog(null, "select an item");
					}

			 }
		 });
			changeQty.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int i = table2.getSelectedRow();
					if ( i >= 0)
					{
						model2.setValueAt(quantitytext.getText(), i, 3);

					}
					else {
						JOptionPane.showMessageDialog(null, "select an item");
					}
				}
			});
			payment.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double total = 0;
					int rowCount = model.getRowCount();
					int RowCount = model2.getRowCount();
					for(int i = 0; i < table2.getRowCount(); i++)
					{
						total += Double.parseDouble(table2.getValueAt(i, 2).toString()) * Double.parseDouble(table2.getValueAt(i, 3).toString());
					}
					totalcost.setText(Double.toString(total));
					 try {
						 File file = new File("History.txt");
						 PrintWriter pw = new PrintWriter(file);
						 for(int i = 0; i < table.getRowCount(); i++)
						 {
							 for(int j = 0; j < table.getColumnCount(); j++)
							 {
								 pw.write(table.getModel().getValueAt(i, j)+ " ");
							 }
							 pw.println("");
						 }
						 pw.close();
						 }catch(Exception e1)
						 {
							 JOptionPane.showMessageDialog(null,"Something went wrong during file save");
						 }
					 if(rowCount != 0){
						 for(int i = rowCount - 1; i  >= 0; i--) {
							 model.removeRow(i);
						 }
					 }
					 if(RowCount != 0){
						 for(int i = RowCount - 1; i  >= 0; i--) {
							 model2.removeRow(i);
						 }
					 }
				}
		
			});
			storehistory.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 File file = new File("History.txt");
					 try {
						 FileReader fr = new FileReader(file);
						 BufferedReader br = new BufferedReader(fr);
						 
						 Object[] lines = br.lines().toArray();
						 for(int i = 0; i <lines.length; i++)
						 {
							 String[] row = lines[i].toString().split(" ");
							 model2.addRow(row);
						 }
						 br.close();
						 fr.close();
						
					 }catch(Exception e1)
					 {
						JOptionPane.showMessageDialog(null,"Someting went wrong");
					 }
				}
			});
	}
}
