package snippet;

public class Snippet {
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
}

