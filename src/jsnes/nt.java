package jsnes;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.filechooser.FileNameExtensionFilter;

final class nt extends JMenuBar implements ActionListener, MenuListener {
   private JMenu a;
   private JMenuItem a;
   private JMenu b;
   private JMenuItem[] a;
   private JMenuItem b;
   private JMenu c;
   private JMenuItem c;
   private JMenuItem d;
   private JMenuItem e;
   private JMenuItem f;
   private JMenuItem g;
   private JCheckBoxMenuItem a;
   private JMenuItem h;
   private JMenuItem i;
   private JMenu d;
   private JCheckBoxMenuItem b;
   private JCheckBoxMenuItem c;
   private JRadioButtonMenuItem a;
   private JRadioButtonMenuItem b;
   private JRadioButtonMenuItem c;
   private JCheckBoxMenuItem d;
   private JCheckBoxMenuItem e;
   private JCheckBoxMenuItem f;
   private JCheckBoxMenuItem g;
   private JCheckBoxMenuItem h;
   private JCheckBoxMenuItem i;
   private JCheckBoxMenuItem j;
   private JMenu e;
   private JCheckBoxMenuItem k;
   private JMenu f;
   private JMenuItem j;
   private JMenu g;
   private JMenuItem k;
   // $FF: synthetic field
   private bi a;

   public nt(bi var1) {
      this.a = var1;
      super();
      this.a = new JMenuItem[10];
      JPopupMenu.setDefaultLightWeightPopupEnabled(false);
      this.a = new JMenu("Game");
      this.a.setMnemonic(71);
      this.a.addMenuListener(this);
      this.add(this.a);
      this.a = new JMenuItem("Load");
      this.a.setMnemonic(76);
      this.a.setAccelerator(KeyStroke.getKeyStroke(76, 2));
      this.a.addActionListener(this);
      this.a.add(this.a);
      this.b = new JMenu("Recent");
      this.b.setMnemonic(82);
      this.a.add(this.b);

      for(int var2 = 0; var2 < 10; ++var2) {
         this.a[var2] = new JMenuItem(var2 + 1 + ". ");
         this.a[var2].setMnemonic(var2 != 9 ? var2 + 49 : 48);
         this.a[var2].addActionListener(this);
         this.b.add(this.a[var2]);
      }

      this.b.addSeparator();
      this.b = new JMenuItem("Clear");
      this.b.setMnemonic(67);
      this.b.addActionListener(this);
      this.b.add(this.b);
      this.a.addSeparator();
      this.c = new JMenu("SRAM");
      this.c.setMnemonic(83);
      this.a.add(this.c);
      this.c = new JMenuItem("Save");
      this.c.setMnemonic(83);
      this.c.addActionListener(this);
      this.c.add(this.c);
      this.d = new JMenuItem("Save as...");
      this.d.setMnemonic(65);
      this.d.addActionListener(this);
      this.c.add(this.d);
      this.e = new JMenuItem("Load from...");
      this.e.setMnemonic(76);
      this.e.addActionListener(this);
      this.c.add(this.e);
      this.c.addSeparator();
      this.f = new JMenuItem("Options...");
      this.f.setMnemonic(79);
      this.f.addActionListener(this);
      this.c.add(this.f);
      this.g = new JMenuItem("Load snapshot...");
      this.g.setMnemonic(78);
      this.g.addActionListener(this);
      this.a.add(this.g);
      this.a.addSeparator();
      this.a = new JCheckBoxMenuItem("Pause");
      this.a.setMnemonic(80);
      this.a.setAccelerator(KeyStroke.getKeyStroke(19, 0));
      this.a.addActionListener(this);
      this.a.add(this.a);
      this.h = new JMenuItem("Reset");
      this.h.setMnemonic(69);
      this.h.addActionListener(this);
      this.a.add(this.h);
      this.a.addSeparator();
      this.i = new JMenuItem("Power off");
      this.i.setMnemonic(80);
      this.i.setAccelerator(KeyStroke.getKeyStroke(115, 8));
      this.i.addActionListener(this);
      this.a.add(this.i);
      this.d = new JMenu("Graphics");
      this.d.addMenuListener(this);
      this.add(this.d);
      this.b = new JCheckBoxMenuItem("Stretch image");
      this.b.setMnemonic(83);
      this.b.addActionListener(this);
      this.d.add(this.b);
      this.c = new JCheckBoxMenuItem("Correct aspect ratio");
      this.c.setMnemonic(67);
      this.c.addActionListener(this);
      this.d.add(this.c);
      this.d.addSeparator();
      ButtonGroup var3 = new ButtonGroup();
      this.a = new JRadioButtonMenuItem("No filtering");
      this.a.addActionListener(this);
      var3.add(this.a);
      this.d.add(this.a);
      this.b = new JRadioButtonMenuItem("Bilinear filtering");
      this.b.addActionListener(this);
      var3.add(this.b);
      this.d.add(this.b);
      this.c = new JRadioButtonMenuItem("Bicubic filtering");
      this.c.addActionListener(this);
      var3.add(this.c);
      this.d.add(this.c);
      this.d.addSeparator();
      this.d = new JCheckBoxMenuItem("Alternate frame rendering method");
      this.d.addActionListener(this);
      this.d.add(this.d);
      this.d.addSeparator();
      this.e = new JCheckBoxMenuItem("Draw background 1");
      this.e.setAccelerator(KeyStroke.getKeyStroke(49, 0));
      this.e.addActionListener(this);
      this.d.add(this.e);
      this.f = new JCheckBoxMenuItem("Draw background 2");
      this.f.setAccelerator(KeyStroke.getKeyStroke(50, 0));
      this.f.addActionListener(this);
      this.d.add(this.f);
      this.g = new JCheckBoxMenuItem("Draw background 3");
      this.g.setAccelerator(KeyStroke.getKeyStroke(51, 0));
      this.g.addActionListener(this);
      this.d.add(this.g);
      this.h = new JCheckBoxMenuItem("Draw background 4");
      this.h.setAccelerator(KeyStroke.getKeyStroke(52, 0));
      this.h.addActionListener(this);
      this.d.add(this.h);
      this.i = new JCheckBoxMenuItem("Draw sprites");
      this.i.setAccelerator(KeyStroke.getKeyStroke(53, 0));
      this.i.addActionListener(this);
      this.d.add(this.i);
      this.d.addSeparator();
      this.j = new JCheckBoxMenuItem("Enable color arithmetic");
      this.j.addActionListener(this);
      this.d.add(this.j);
      this.e = new JMenu("Audio");
      this.e.setMnemonic(65);
      this.e.addMenuListener(this);
      this.add(this.e);
      this.k = new JCheckBoxMenuItem("Mute");
      this.k.setMnemonic(77);
      this.k.setAccelerator(KeyStroke.getKeyStroke(77, 2));
      this.k.addActionListener(this);
      this.e.add(this.k);
      this.f = new JMenu("Input");
      this.f.setMnemonic(73);
      this.f.addMenuListener(this);
      this.add(this.f);
      this.j = new JMenuItem("Configure keys...");
      this.j.setMnemonic(67);
      this.j.addActionListener(this);
      this.f.add(this.j);
      this.g = new JMenu("Tools");
      this.g.setMnemonic(84);
      this.g.addMenuListener(this);
      this.add(this.g);
      this.k = new JMenuItem("Debugger");
      this.k.setMnemonic(68);
      this.k.addActionListener(this);
      this.g.add(this.k);
   }

   public final void menuCanceled(MenuEvent var1) {
   }

   public final void menuDeselected(MenuEvent var1) {
   }

   public final void menuSelected(MenuEvent var1) {
      yk var5 = ow.a;
      yk var2 = ow.a;
      synchronized(ow.a) {
         this.b.setEnabled(var5.a() > 0);

         for(int var3 = 0; var3 < 10; ++var3) {
            this.a[var3].setVisible(var3 < var5.a());
            if (var3 < var5.a()) {
               this.a[var3].setText(var3 + 1 + ". " + fv.a(var5.a(var3)));
            }
         }
      }

      this.c.setEnabled(this.a.b && this.a.a.b.length != 0);
      this.d.setEnabled(this.a.b && this.a.a.b.length != 0);
      this.e.setEnabled(this.a.b && this.a.a.b.length != 0);
      this.g.setEnabled(this.a.b);
      this.a.setEnabled(this.a.b);
      this.h.setEnabled(this.a.b);
      this.a.setState(this.a.a.a());
      boolean var6 = ow.c;
      this.b.setState(var6);
      this.c.setState(ow.d);
      this.c.setEnabled(var6);
      boolean var7 = false;
      switch(ow.b) {
      case 0:
         this.a.setSelected(true);
         var7 = true;
         break;
      case 1:
         this.b.setSelected(true);
         break;
      case 2:
         this.c.setSelected(true);
      }

      this.a.setEnabled(var6);
      this.b.setEnabled(var6);
      this.c.setEnabled(var6);
      this.d.setState(ow.e);
      this.d.setEnabled(var7);
      this.e.setState(this.a.a.a.a[0].a);
      this.f.setState(this.a.a.a.a[1].a);
      this.g.setState(this.a.a.a.a[2].a);
      this.h.setState(this.a.a.a.a[3].a);
      this.i.setState(this.a.a.a.a.b);
      this.j.setState(false);
      this.j.setEnabled(false);
      this.k.setState(true);
      this.k.setEnabled(false);
   }

   public final void actionPerformed(ActionEvent var1) {
      Object var5 = var1.getSource();
      boolean var2 = false;
      if (var5 instanceof JCheckBoxMenuItem) {
         var2 = ((JCheckBoxMenuItem)var5).getState();
      }

      bi var4;
      File var9;
      if (var5 == this.a) {
         if ((var4 = this.a).a.showOpenDialog(var4.a) == 0) {
            var9 = var4.a.getSelectedFile();
            var4.a((Object)var9);
         }

      } else if (a(this.a, var5) != -1) {
         String var12;
         if ((var12 = ow.a.a(a(this.a, var5))) != null) {
            this.a.a((Object)(new File(var12)));
         }

      } else if (var5 == this.b) {
         ow.a.a();
      } else if (var5 == this.c) {
         this.a.e();
      } else if (var5 == this.d) {
         (var4 = this.a).b.setDialogTitle("Save SRAM");
         var4.b.setApproveButtonText("Save");
         var4.b.setApproveButtonMnemonic(83);
         if (var4.a != null) {
            var4.b.setSelectedFile(var4.a);
         }

         if (var4.b.showSaveDialog(var4.a) == 0) {
            var9 = var4.b.getSelectedFile();
            if (var4.b.getFileFilter() instanceof FileNameExtensionFilter) {
               var9 = new File(fv.a(var9.toString(), "srm"));
            }

            var4.a = var9;
            var4.e();
         }

      } else if (var5 == this.e) {
         (var4 = this.a).b.setDialogTitle("Load SRAM");
         var4.b.setApproveButtonText("Load");
         var4.b.setApproveButtonMnemonic(76);
         if (var4.a != null) {
            var4.b.setSelectedFile(var4.a);
         }

         if (var4.b.showOpenDialog(var4.a) == 0) {
            var4.a = var4.b.getSelectedFile();
            var4.d();
         }

      } else if (var5 == this.f) {
         JRootPane var11 = this.a.a;
         Frame var13 = JOptionPane.getFrameForComponent(this.a.a);
         (new aec(var13, var11)).setVisible(true);
      } else if (var5 != this.g) {
         if (var5 == this.a) {
            this.a.a.a(this.a.getState());
         } else if (var5 == this.h) {
            this.a.a.a();
         } else if (var5 == this.i) {
            this.a.a();
            this.a.b();
         } else if (var5 == this.b) {
            ow.c = var2;
            this.a.c();
         } else if (var5 == this.c) {
            ow.d = var2;
            this.a.c();
         } else if (var5 != this.a && var5 != this.b && var5 != this.c) {
            if (var5 == this.d) {
               ow.e = var2;
            } else if (var5 == this.e) {
               this.a.a.a.a[0].a = var2;
            } else if (var5 == this.f) {
               this.a.a.a.a[1].a = var2;
            } else if (var5 == this.g) {
               this.a.a.a.a[2].a = var2;
            } else if (var5 == this.h) {
               this.a.a.a.a[3].a = var2;
            } else if (var5 == this.i) {
               this.a.a.a.a.b = var2;
            } else {
               if (var5 != this.j && var5 == this.k) {
                  if ((var4 = this.a).a == null) {
                     var4.a = new xn(var4);
                  }

                  var4.a.a();
               }

            }
         } else {
            byte var10;
            if (this.b.isSelected()) {
               var10 = 1;
            } else if (this.c.isSelected()) {
               var10 = 2;
            } else {
               var10 = 0;
            }

            ow.b = var10;
            this.a.c();
         }
      } else {
         if ((var4 = this.a).c.showOpenDialog(var4.a) == 0) {
            var9 = var4.c.getSelectedFile();
            bi var10000 = var4;
            File var6 = var9;
            var4 = var4;
            var10000.c = true;

            try {
               byte[] var7 = hu.a(var6, (jn)null);
               var4.a.a(var7);

               for(int var8 = 0; var8 < var4.a.b.length; ++var8) {
                  var4.a[var8] = var4.a.b[var8];
               }
            } catch (Throwable var3) {
               bi.a("There was an error loading the snapshot file.", var3);
            }

            var4.c = false;
         }

      }
   }

   private static int a(Object[] var0, Object var1) {
      for(int var2 = 0; var2 < var0.length; ++var2) {
         if (var0[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }
}
