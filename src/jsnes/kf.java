package jsnes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

final class kf implements KeyListener {
   // $FF: synthetic field
   private bi a;

   private kf(bi var1, byte var2) {
      this.a = var1;
      super();
   }

   public final void keyPressed(KeyEvent var1) {
      vd var2;
      int var3;
      if ((var3 = bi.a(this.a, var1)) != 0 && (var2 = this.a.a.a.a) instanceof jq) {
         ((jq)var2).a(var3);
      }

   }

   public final void keyReleased(KeyEvent var1) {
      vd var2 = this.a.a.a.a;
      if (this.a.a.a.a instanceof jq) {
         ((jq)var2).b(bi.a(this.a, var1));
      }

   }

   public final void keyTyped(KeyEvent var1) {
   }

   // $FF: synthetic method
   kf(bi var1) {
      this(var1, (byte)0);
   }
}
