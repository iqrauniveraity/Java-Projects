import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class NewPhoneBook extends javax.swing.JFrame {

	JScrollPane jScrollPane1;
	JTable thePhoneBook;
	JLabel Jlabel1;
	JLabel Jlabel2;
	JLabel Jlabel3;
	JComboBox Address;
	JTextField TextName;
	JTextField PhoneNumber;
	JButton Add;
	JButton update;
	JButton delete;
	JLabel Message;
	
	public NewPhoneBook() {
        itsComponents();
    }
	public void itsComponents() {
		 setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		 thePhoneBook.setModel(new javax.swing.table.DefaultTableModel(
		            new Object [][] {

		            },
		            new String [] {
		                "Name", "Address", "Phone"
		            }
		        ));
		 jScrollPane1.setViewportView(thePhoneBook);

		 Jlabel1.setText("Name");

		 Jlabel2.setText("Address");

		 Jlabel3.setText("Phone");
		 Address.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Karachi", "Islamabad", "Lahore", "Rawalpindi", "Hyderabad", "Faisalabad", "others" }));
		 
		 Add.setText("Add");
	        Add.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	            	Add.ActionPerformed(evt);
	            }
	        });

	        update.setText("Update");
	        update.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                updateActionPerformed(evt);
	            }
	        });

	        delete.setText("Delete");
	        delete.addMouseListener(new java.awt.event.MouseAdapter() {
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                deleteMouseClicked(evt);
	            }
	        });
	        delete.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	               deleteActionPerformed(evt);
	            }
	        });
	        private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonaddActionPerformed
	            Message.setText("");
	            DefaultTableModel model =(DefaultTableModel) tbphonebook.getModel();
	            if(!TextName.getText().trim().equals("")){
	            model.addRow(new Object[]{TextName.getText(),Address.getSelectedItem().toString(),PhoneNumber.getText()});
	            }else{
	                Message.setText("Name Should not be blank");
	            }
	        }//GEN-LAST:event_buttonaddActionPerformed
	        private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonupdateActionPerformed
	            Message.setText("");
	            DefaultTableModel model =(DefaultTableModel) thePhoneBook.getModel();
	            if(thePhoneBook.getSelectedRow()==-1){
	            if(thePhoneBook.getRowCount()==0){
	            Message.setText("Table is empty");
	            }else{
	            Message.setText("You must select a name");
	            }
	            }else{
	            model.setValueAt(TextName.getText(), thePhoneBook.getSelectedRow(), 0);
	            model.setValueAt(TextName.getSelectedItem().toString(), thePhoneBook.getSelectedRow(), 1);
	            model.setValueAt(TextName.getText(), thePhoneBook.getSelectedRow(), 2);
	            }
	        }//GEN-LAST:event_buttonupdateActionPerformed

	        private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttondeleteMouseClicked
	            DefaultTableModel model =(DefaultTableModel) thePhoneBook.getModel();
	            TextName.setText(model.getValueAt(thePhoneBook.getSelectedRow(), 0).toString());
	            Address.setSelectedItem(model.getValueAt(thePhoneBook.getSelectedRow(), 1).toString());
	            PhoneNumber.setText(model.getValueAt(thePhoneBook.getSelectedRow(), 2).toString());;
	            
	            
	        }//GEN-LAST:event_buttondeleteMouseClicked

	        private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondeleteActionPerformed
	            DefaultTableModel model =(DefaultTableModel) thePhoneBook.getModel();
	                if(thePhoneBook.getSelectedRow()==-1){
	            if(thePhoneBook.getRowCount()==0){
	            Message.setText("Table is empty");
	            }else{
	            Message.setText("You must select a name");
	            }
	            }else{
	                    model.removeRow(thePhoneBook.getSelectedRow());
	                }
	        }//GEN-LAST:event_buttondeleteActionPerformed

	        /**
	         * @param args the command line arguments
	         */

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
       * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try {
          for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
              if ("Nimbus".equals(info.getName())) {
                  javax.swing.UIManager.setLookAndFeel(info.getClassName());
                  break;
              }
          }
      } catch (ClassNotFoundException ex) {
          java.util.logging.Logger.getLogger(NewPhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
          java.util.logging.Logger.getLogger(NewPhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
          java.util.logging.Logger.getLogger(NewPhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
          java.util.logging.Logger.getLogger(NewPhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
              new NewPhoneBook().setVisible(true);
          }
      });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
 
  // End of variables declaration//GEN-END:variables

}
