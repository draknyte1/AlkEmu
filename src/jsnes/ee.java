package jsnes;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Arrays;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

final class ee implements ActionListener, WindowListener, PropertyChangeListener, v {
   JFrame a;
   JPanel a;
   JTextArea a;
   JScrollPane a;
   ButtonGroup a;
   JToggleButton a;
   JToggleButton b;
   JToggleButton c;
   JButton a;
   JButton b;
   JComboBox a;
   rd a;
   JToggleButton[] a;
   private int a = 0;
   cb a;
   jp[] a;
   aei[] a;

   public ee(cb var1) {
      this.a = var1;
      this.a = var1.a();
      this.a = var1.a();
      SwingUtilities.invokeLater(new pf(this));
   }

   public final void actionPerformed(ActionEvent var1) {
      Object var8;
      if ((var8 = var1.getSource()) != this.a && var8 != this.b) {
         if (var8 == this.c) {
            if (this.c.isSelected()) {
               this.a.a(new fg("tracelog\\" + (this.a instanceof us ? "cpu" : (this.a instanceof kt ? "apu" : ""))));
            } else {
               this.a.a((fg)null);
            }
         }
      } else {
         this.a.a(this.b.isSelected());
         this.d();
      }

      if (this.a.a) {
         if (var8 == this.a) {
            this.a.b();
            return;
         }

         if (var8 == null) {
            this.a.a();
            this.d();
            return;
         }

         if (var8 == this.b) {
            cb var10000 = this.a;
            JButton var10001 = this.b;
            JFrame var10002 = this.a;
            cb var9 = this.a;
            int[] var10003 = this.a.a == null ? new int[0] : var9.a;
            int var3 = this.a.a();
            int[] var13 = var10003;
            JFrame var10 = var10002;
            Frame var6 = JOptionPane.getFrameForComponent(var10001);
            bt var7;
            (var7 = new bt(var6, var10, var13, var3)).setVisible(true);
            if (!var7.a) {
               bt var11 = var7;
               var13 = new int[8];
               var3 = 0;

               for(int var4 = 0; var4 < 8; ++var4) {
                  int var5;
                  if ((var5 = (int)var11.a[var4].a()) != 0) {
                     var13[var3] = var5;
                     ++var3;
                  }
               }

               var13 = Arrays.copyOf(var13, var3);
            }

            var7.a = null;
            var9 = var10000;
            if (var13 != null && var13.length != 0) {
               var9.a = var13;
            }

            var9.a = var13;
            var9.c();
            return;
         }

         if (var8 == this.a) {
            jp var12 = this.a();
            this.a.a(var12.a());
            this.a.setValue(var12.a());
            return;
         }

         for(int var2 = 0; var2 < this.a.length; ++var2) {
            if (this.a[var2] == var8) {
               this.a[var2].a(this.a[var2].isSelected());
               this.d();
               this.e();
               return;
            }
         }
      }

   }

   final void d() {
      boolean var1 = this.a.a;
      this.a.setSelected(!var1);
      this.b.setSelected(var1);
      this.a.setEnabled(var1);
      this.b.setEnabled(var1);
      this.a.setEnabled(var1);
      this.a.setEnabled(var1);
      if (var1) {
         this.a.a(this.a().a());
      }

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2].setSelected(var1 && this.a[var2].a());
         this.a[var2].setEnabled(var1);
      }

   }

   private jp a() {
      return this.a[this.a.getSelectedIndex()];
   }

   private void a(String var1) {
      this.a.append(var1 + fv.a);
      ++this.a;
      if (this.a > 150) {
         try {
            Document var4 = this.a.getDocument();

            int var2;
            while((var2 = var4.getText(0, 200).indexOf(fv.a)) == -1) {
               ;
            }

            var4.remove(0, var2 + fv.a.length());
         } catch (BadLocationException var3) {
            ;
         }
      }

      this.a.setCaretPosition(this.a.getDocument().getLength());
   }

   final void e() {
      this.a(this.a.b());
      this.a(this.a.c());
   }

   public final void a() {
      SwingUtilities.invokeLater(new ox(this));
   }

   public final void b() {
      SwingUtilities.invokeLater(new ou(this));
   }

   public final void c() {
      SwingUtilities.invokeLater(new oy(this));
   }

   public final void propertyChange(PropertyChangeEvent var1) {
      jp var2;
      if ((var2 = this.a()).a() != this.a.a()) {
         var2.a(this.a.a());
         this.a.a(var2.a());
         this.e();
      }

   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowClosing(WindowEvent var1) {
      this.a.a((v)null);
      this.a.dispose();
      this.a = null;
      this.a = null;
      this.a = null;
      this.a = null;
      this.a = null;
      this.a = null;
      this.b = null;
      this.a = null;
      this.b = null;
      this.a = null;
      this.a = null;
      this.a = null;
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }
}
