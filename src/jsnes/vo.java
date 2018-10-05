package jsnes;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

final class vo implements WindowListener {
   // $FF: synthetic field
   private bi a;

   private vo(bi var1, byte var2) {
      this.a = var1;
      super();
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
      this.a.a();
      this.a.b();
      this.a.a.setVisible(false);
   }

   public final void windowClosed(WindowEvent var1) {
      System.exit(0);
   }

   public final void windowOpened(WindowEvent var1) {
      bi var2;
      if (!(var2 = this.a).a) {
         var2.a = true;
         var2.a.a(new wl(var2.a));
         var2.c();
      }

      var2.a.a(false);
   }

   // $FF: synthetic method
   vo(bi var1) {
      this(var1, (byte)0);
   }
}
