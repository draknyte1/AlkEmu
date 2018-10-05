package jsnes;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

final class aec extends JDialog implements ActionListener {
   private JCheckBox a;
   private JCheckBox b;
   private JRadioButton a;
   private JRadioButton b;
   private JTextField a;
   private JButton a;
   private JButton b;
   private JButton c;

   aec(Frame var1, Component var2) {
      super(var1, "SRAM Options", true);
      Box var5;
      (var5 = new Box(3)).setBorder(new EmptyBorder(10, 10, 10, 10));
      this.a = new JCheckBox("Load automatically");
      this.a.setMnemonic(76);
      var5.add(this.a);
      this.b = new JCheckBox("Save automatically");
      this.b.setMnemonic(83);
      var5.add(this.b);
      var5.add(Box.createVerticalStrut(15));
      JLabel var3 = new JLabel("When saving new files, JSNES should use the following place:");
      var5.add(var3);
      ButtonGroup var4 = new ButtonGroup();
      this.a = new JRadioButton("the folder of the ROM");
      var5.add(this.a);
      var4.add(this.a);
      this.b = new JRadioButton("the custom folder below");
      var5.add(this.b);
      var4.add(this.b);
      var5.add(Box.createVerticalStrut(15));
      JLabel var7;
      (var7 = new JLabel("Custom SRAM folder:")).setDisplayedMnemonic(70);
      var5.add(var7);
      JPanel var8;
      (var8 = new JPanel()).setLayout(new FlowLayout());
      this.a = new JTextField(40);
      var8.add(this.a);
      var3.setLabelFor(this.a);
      this.a = new JButton("Browse...");
      this.a.setMnemonic(66);
      this.a.addActionListener(this);
      var8.add(this.a);
      var8.setAlignmentX(0.0F);
      var5.add(var8);
      var3 = new JLabel("(This can be an absolute path or relative to where JSNES is located.)");
      var5.add(var3);
      var5.add(Box.createVerticalStrut(15));
      JPanel var6;
      (var6 = new JPanel()).setLayout(new BoxLayout(var6, 2));
      this.b = new JButton("OK");
      this.b.setMnemonic(79);
      this.b.addActionListener(this);
      var6.add(this.b);
      this.getRootPane().setDefaultButton(this.b);
      var6.add(Box.createHorizontalStrut(10));
      this.c = new JButton("Cancel");
      this.c.setMnemonic(67);
      this.c.addActionListener(this);
      var6.add(this.c);
      this.b.setMaximumSize(this.c.getMaximumSize());
      var6.setAlignmentX(0.0F);
      var5.add(var6);
      this.add(var5);
      this.pack();
      this.setLocationRelativeTo(var2);
      this.a.setSelected(ow.f);
      this.b.setSelected(ow.g);
      this.a.setText(ow.a);
      if (ow.h) {
         this.a.setSelected(true);
      } else {
         this.b.setSelected(true);
      }
   }

   public final void actionPerformed(ActionEvent var1) {
      Object var2;
      if ((var2 = var1.getSource()) == this.a) {
         JFileChooser var3;
         (var3 = new JFileChooser()).setFileSelectionMode(1);
         var3.setAcceptAllFileFilterUsed(false);
         var3.addChoosableFileFilter(new iq());
         var3.setDialogTitle("Select folder");
         var3.setSelectedFile(new File(this.a.getText()));
         var3.setApproveButtonText("OK");
         if (var3.showOpenDialog(this) == 0) {
            this.a.setText(var3.getSelectedFile().getPath());
            this.a.requestFocusInWindow();
         }

      } else if (var2 == this.b) {
         ow.f = this.a.isSelected();
         ow.g = this.b.isSelected();
         ow.a = this.a.getText();
         ow.h = this.a.isSelected();
         this.setVisible(false);
      } else {
         if (var2 == this.c) {
            this.setVisible(false);
         }

      }
   }
}
