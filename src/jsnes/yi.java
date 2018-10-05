package jsnes;

import javax.swing.SwingUtilities;

final class yi extends Thread {
   // $FF: synthetic field
   final bi a;

   private yi(bi var1, byte var2) {
      this.a = var1;
   }

   public final void run() {
      while(this.a.a == this) {
         try {
            Thread.sleep(20000L);
         } catch (InterruptedException var3) {
            ;
         }

         if (ow.g && !this.a.c) {
            if (this.a.a != this) {
               return;
            }

            int var1;
            for(var1 = 0; var1 < this.a.a.b.length && this.a.a.b[var1] == this.a.a[var1]; ++var1) {
               ;
            }

            if (var1 < this.a.a.b.length) {
               try {
                  SwingUtilities.invokeAndWait(new cd(this));
               } catch (Throwable var2) {
                  ;
               }
            }
         }
      }

   }

   // $FF: synthetic method
   yi(bi var1) {
      this(var1, (byte)0);
   }
}
