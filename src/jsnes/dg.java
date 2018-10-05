package jsnes;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

final class dg implements ComponentListener {
   // $FF: synthetic field
   private wl a;

   private dg(wl var1, byte var2) {
      this.a = var1;
      super();
   }

   public final void componentHidden(ComponentEvent var1) {
   }

   public final void componentMoved(ComponentEvent var1) {
      this.a.c = true;
   }

   public final void componentResized(ComponentEvent var1) {
      this.a.c = true;
   }

   public final void componentShown(ComponentEvent var1) {
   }

   // $FF: synthetic method
   dg(wl var1) {
      this(var1, (byte)0);
   }
}
