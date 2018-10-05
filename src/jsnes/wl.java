package jsnes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;

public final class wl {
   final Component a;
   final Graphics2D a;
   volatile boolean a;
   volatile boolean b;
   volatile float a;
   volatile boolean c;

   public wl(Component var1) {
      this.a = var1;
      var1.setBackground(Color.BLACK);
      this.a = (Graphics2D)var1.getGraphics();
      var1.addComponentListener(new dg(this));
      this.a(true);
      this.a(1.0F);
      this.b(true);
   }

   public final void a(boolean var1) {
      this.a = var1;
      this.c = true;
      this.a();
   }

   public final void b(boolean var1) {
      this.b = var1;
      this.c = true;
      this.a();
   }

   public final void a(float var1) {
      this.a = var1;
      this.c = true;
      this.a();
   }

   public final void a() {
      this.a.setColor(Color.BLACK);
      this.a.fillRect(0, 0, this.a.getWidth(), this.a.getHeight());
   }
}
