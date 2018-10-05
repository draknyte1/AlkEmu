package jsnes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

final class by implements Runnable {
   // $FF: synthetic field
   private bi a;

   by(bi var1) {
      this.a = var1;
      super();
   }

   public final void run() {
      bi var2 = this.a;
      kf var1 = new kf(var2);
      var2.a.setLayout(new BorderLayout());
      var2.a = new ca();
      var2.a.setPreferredSize(new Dimension(588, 448));
      var2.a.addKeyListener(var1);
      var2.a.add(var2.a, "Center");
      var2.a.addKeyListener(var1);
      var2.a.setJMenuBar(new nt(var2));
      ow.a();
      var2.a.addWindowListener(new vo(var2));
      var2.a.pack();
      var2.a.setLocationByPlatform(true);
      var2.a.setVisible(true);
      var2.a.requestFocusInWindow();
      var2.a = new JFileChooser();
      var2.a.addChoosableFileFilter(new FileNameExtensionFilter("SNES ROMs and archives (*.smc; *.zip)", new String[]{"smc", "zip"}));
      var2.a.setDialogTitle("Load Game");
      var2.a.setApproveButtonText("Load");
      var2.a.setApproveButtonMnemonic(76);
      var2.b = new JFileChooser();
      var2.b.addChoosableFileFilter(new FileNameExtensionFilter("SRAM files (*.srm)", new String[]{"srm"}));
      var2.c = new JFileChooser();
      var2.c.addChoosableFileFilter(new FileNameExtensionFilter("Snes9x savestates (*.00?)", new String[]{"000", "001", "002", "003", "004", "005", "006", "007", "008", "009"}));
      var2.c.setDialogTitle("Load Snapshot");
      var2.c.setApproveButtonText("Load");
      var2.c.setApproveButtonMnemonic(76);
      String var3;
      if ((var3 = ow.a.a(0)) != null) {
         var2.a.setSelectedFile(new File(var3));
      }

      var2.a = new yi(var2);
      var2.a.start();
   }
}
