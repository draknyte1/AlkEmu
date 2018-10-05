package jsnes;

import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

final class aee implements ItemListener, ListSelectionListener {
   afi a;
   JFrame a;
   JPanel a;
   JComboBox a;
   JList a;
   JScrollPane a;
   aco a;
   JScrollPane b;
   dk a;

   public aee(afi var1) {
      this.a = var1;
      SwingUtilities.invokeLater(new wp(this));
   }

   final void a(dk var1) {
      this.a = var1;
      this.a.setModel(var1);
      int var4;
      if ((var4 = var1.a()) < 65536) {
         this.a.setVisible(false);
      } else {
         String[] var2 = new String[var4 = (var4 + 65536) / 65536];

         for(int var3 = 0; var3 < var4; ++var3) {
            var2[var3] = fv.a(var3);
         }

         this.a.setListData(var2);
         this.a.setSelectionInterval(0, var4 - 1);
         this.a.setVisible(true);
      }

      this.a.doLayout();
      this.a.setMaximumSize(new Dimension(this.a.getBounds().width + 15, Integer.MAX_VALUE));
      this.a.getParent().doLayout();
   }

   public final void itemStateChanged(ItemEvent var1) {
      if (var1.getStateChange() == 1) {
         switch(this.a.getSelectedIndex()) {
         case 0:
            this.a(new xl(this.a.a));
            return;
         case 1:
            this.a(new uj(this.a.a));
            return;
         case 2:
            this.a(new vr(this.a.a));
            return;
         case 3:
            this.a(new ut(this.a.a()));
            return;
         case 4:
            this.a(new ve(this.a.a));
            return;
         case 5:
            this.a(new dl(this.a.a));
            return;
         case 6:
            this.a(new dh(this.a.a));
            return;
         case 7:
            this.a(new tu(this.a.a));
         }
      }

   }

   public final void valueChanged(ListSelectionEvent var1) {
      this.a.a(this.a.getMinSelectionIndex() << 16, (this.a.getMaxSelectionIndex() << 16) + '\uffff');
   }
}
