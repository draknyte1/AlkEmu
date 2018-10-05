package jsnes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import javax.swing.ActionMap;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.KeyStroke;

final class pf implements Runnable {
   // $FF: synthetic field
   private ee a;

   pf(ee var1) {
      this.a = var1;
      super();
   }

   public final void run() {
      ee var7;
      (var7 = this.a).a = new JFrame(var7.a.a());
      var7.a.addWindowListener(var7);
      var7.a.setDefaultCloseOperation(2);
      var7.a.setLayout(new BoxLayout(var7.a.getContentPane(), 3));
      var7.a = new JPanel();
      var7.a.setLayout(new FlowLayout(0));
      JPanel var1;
      (var1 = new JPanel()).setBorder(fv.a("Mode"));
      var7.a = new ButtonGroup();
      var7.a = new JToggleButton("Run");
      var7.a.setToolTipText("Resume running the CPU (F5)");
      var7.a.setMnemonic(82);
      var7.a.addActionListener(var7);
      var7.a.add(var7.a);
      var1.add(var7.a);
      var7.b = new JToggleButton("Break");
      var7.b.setToolTipText("Pause the CPU to enter debug mode (ESC)");
      var7.b.setMnemonic(66);
      var7.b.addActionListener(var7);
      var7.a.add(var7.b);
      var1.add(var7.b);
      var7.a.add(var1);
      (var1 = new JPanel()).setBorder(fv.a("Actions"));
      var7.a = new JButton("Step");
      var7.a.setToolTipText("Execute the next instruction (F8)");
      var7.a.setMnemonic(83);
      var7.a.addActionListener(var7);
      var1.add(var7.a);
      var7.b = new JButton("Breakpoints");
      var7.b.setToolTipText("Configure instruction breakpoints");
      var7.b.setMnemonic(66);
      var7.b.addActionListener(var7);
      var1.add(var7.b);
      var7.c = new JToggleButton("Trace");
      var7.c.setToolTipText("Log instructions to file");
      var7.c.setMnemonic(84);
      var7.c.addActionListener(var7);
      var7.c.setEnabled(false);
      var1.add(var7.c);
      var7.a.add(var1);
      int var2;
      if (var7.a != null) {
         (var1 = new JPanel()).setBorder(fv.a("Registers"));
         var7.a = new JComboBox();
         var2 = 0;
         jp[] var3 = var7.a;
         int var4 = var7.a.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            jp var6 = var3[var5];
            var7.a.addItem(var6.a());
            if (var6.a() > var2) {
               var2 = var6.a();
            }
         }

         var7.a.addActionListener(var7);
         var1.add(var7.a);
         var7.a = new rd(var2);
         var7.a.addPropertyChangeListener("value", var7);
         var1.add(var7.a);
         var7.a.add(var1);
      }

      if (var7.a != null) {
         (var1 = new JPanel()).setLayout(new FlowLayout(0, 0, 5));
         var1.setBorder(fv.a("Flags"));
         var1.add(Box.createRigidArea(new Dimension(5, 0)));
         var7.a = new JToggleButton[var7.a.length];

         for(var2 = 0; var2 < var7.a.length; ++var2) {
            JToggleButton var9;
            (var9 = new JToggleButton(var7.a[var2].b())).setToolTipText(var7.a[var2].a());
            var9.addActionListener(var7);
            Insets var11;
            Insets var10000 = var11 = var9.getMargin();
            var10000.left /= 2;
            var11.right /= 2;
            var9.setMargin(var11);
            var7.a[var2] = var9;
            var1.add(var9);
         }

         var1.add(Box.createRigidArea(new Dimension(5, 0)));
         var7.a.add(var1);
      }

      var7.a = new JTextArea(15, var7.a.b().length());
      var7.a.setEditable(false);
      var7.a.setFont(fv.a);
      var7.a.setMargin(new Insets(5, 5, 5, 5));
      var7.a.setBackground(new Color(3816021));
      var7.a.setForeground(new Color(16777215));
      var7.a = new JScrollPane(var7.a);
      var7.a.setVerticalScrollBarPolicy(22);
      var7.a.doLayout();
      var7.a.setMinimumSize(var7.a.getPreferredSize());
      var7.a.setMaximumSize(var7.a.getPreferredSize());
      var7.a.add(var7.a);
      var7.a.add(var7.a);
      var7.a.pack();
      var7.a.setVisible(true);
      InputMap var8;
      (var8 = var7.a.getRootPane().getInputMap(1)).put(KeyStroke.getKeyStroke(116, 0), "asdfdsfdsf");
      ActionMap var10;
      (var10 = var7.a.getRootPane().getActionMap()).put("asdfdsfdsf", new pd(var7));
      var8.put(KeyStroke.getKeyStroke(27, 0), "JAVA FUCKING SUCKS");
      var10.put("JAVA FUCKING SUCKS", new pb(var7));
      var8.put(KeyStroke.getKeyStroke(119, 0), "GO. TO. FUCKING. HELL.");
      var10.put("GO. TO. FUCKING. HELL.", new oz(var7));
      var7.a.a((v)var7);
      var7.d();
   }
}
