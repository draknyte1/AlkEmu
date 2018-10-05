package jsnes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

final class wp implements Runnable {
   // $FF: synthetic field
   private aee a;

   wp(aee var1) {
      this.a = var1;
      super();
   }

   public final void run() {
      aee var3 = this.a;
      Font var1 = new Font("Monospaced", 0, 14);
      var3.a = new JFrame("Memory view");
      var3.a.setDefaultCloseOperation(1);
      var3.a.setLayout(new BorderLayout());
      var3.a.add(var3.a = new JPanel(), "North");
      var3.a.add(new JLabel("Address space:"));
      var3.a.add(var3.a = new JComboBox());
      var3.a.addItem("Virtual");
      var3.a.addItem("Common bank area");
      var3.a.addItem("Work RAM");
      var3.a.addItem("ROM");
      var3.a.addItem("Video RAM");
      var3.a.addItem("OAM (Object Attribute Memory)");
      var3.a.addItem("CGRAM (Color Generator RAM)");
      var3.a.addItem("SPC700 RAM");
      var3.a.addItemListener(var3);
      Box var2;
      (var2 = new Box(0)).setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
      var3.a = new JList();
      var3.a.setFont(var1);
      var3.a.setSelectionMode(1);
      var3.a.addListSelectionListener(var3);
      var3.a = new JScrollPane(var3.a);
      var2.add(var3.a);
      var2.add(Box.createHorizontalStrut(4));
      var3.a = new aco();
      var3.b = new JScrollPane(var3.a);
      var3.a(new xl(var3.a.a));
      var2.add(var3.b);
      Dimension var4;
      (var4 = var2.getPreferredSize()).height = 500;
      var2.setPreferredSize(var4);
      var3.a.add(var2, "Center");
      var3.a.pack();
      var3.a.setVisible(true);
   }
}
