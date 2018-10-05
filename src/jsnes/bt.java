package jsnes;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

final class bt extends JDialog implements ActionListener {
   rd[] a = new rd[8];
   boolean a = false;

   bt(Frame var1, Component var2, int[] var3, int var4) {
      super(var1, "Breakpoints", true);
      Box var6 = new Box(3);

      for(int var5 = 0; var5 < 8; ++var5) {
         this.a[var5] = new rd(var4);
         if (var3.length > var5) {
            this.a[var5].a((long)var3[var5]);
         } else {
            this.a[var5].a(0L);
         }

         var6.add(this.a[var5]);
      }

      var6.setBorder(new EmptyBorder(10, 10, 10, 10));
      JButton var10;
      (var10 = new JButton("Cancel")).addActionListener(this);
      JButton var7;
      (var7 = new JButton("Set")).setActionCommand("Set");
      var7.addActionListener(this);
      this.getRootPane().setDefaultButton(var7);
      JPanel var9;
      (var9 = new JPanel()).setLayout(new BoxLayout(var9, 2));
      var9.setBorder(new EmptyBorder(10, 10, 10, 10));
      var9.add(Box.createHorizontalGlue());
      var9.add(var10);
      var9.add(Box.createRigidArea(new Dimension(10, 0)));
      var9.add(var7);
      Container var8;
      (var8 = this.getContentPane()).add(var6, "Center");
      var8.add(var9, "Last");
      this.pack();
      this.setLocationRelativeTo(var2);
   }

   public final void actionPerformed(ActionEvent var1) {
      if (var1.getActionCommand() != "Set") {
         this.a = true;
      }

      this.setVisible(false);
   }
}
