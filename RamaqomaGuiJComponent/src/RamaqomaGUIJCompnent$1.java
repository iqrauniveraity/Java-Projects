import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RamaqomaGUIJCompnent$1 {
	  RamaqomaGUIJCompnent$1(RamaqomaGUIJCompnent var1) {
	        this.this$0 = var1;
	    }
	  public void run() {
	        JTable table = new JTable(this.this$0.rows, this.this$0.headers);
	        table.setBackground(Color.yellow);
	        RamaqomaGUIJCompnent.frame.setSize(1065, 559);
	        JScrollPane scrollPane = new JScrollPane(table);
	        RamaqomaGUIJCompnent.frame.add(scrollPane, "East");
	        RamaqomaGUIJCompnent$1$1 printAction = new RamaqomaGUIJCompnent$1$1(this, table);
	        this.this$0.print.addActionListener(printAction);
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
