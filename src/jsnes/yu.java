package jsnes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import javax.swing.JPanel;

final class yu extends JPanel {
   private final ks a;
   private final BufferedImage a = new BufferedImage(128, 128, 2);

   public yu(ks var1) {
      this.a = var1;
      this.setPreferredSize(new Dimension(256, 256));
   }

   protected final void paintComponent(Graphics var1) {
      for(int var2 = 0; var2 < 128; ++var2) {
         byte[] var3 = this.a.a(var2);

         for(int var4 = 0; var4 < 128; ++var4) {
            int var5;
            int var10000 = var5 = (var3[var4] & '\uffff' & 15) << 4;
            var5 = var10000 | var10000 << 8 | var5 << 16 | -16777216;
            this.a.setRGB(var4, var2, var5);
         }
      }

      var1.drawImage(this.a, 0, 0, this.getWidth(), this.getHeight(), 0, 0, 128, 128, (Color)null, (ImageObserver)null);
   }
}
