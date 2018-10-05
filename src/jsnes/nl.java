package jsnes;

import javax.swing.SwingUtilities;

final class nl extends Thread {
   private int a;
   // $FF: synthetic field
   private xn a;

   private nl(xn var1, byte var2) {
      this.a = var1;
      super();
      this.a = 0;
   }

   public final synchronized void run() {
      for(; xn.a(this.a) == Thread.currentThread(); xn.a(this.a, this.a)) {
         try {
            Thread.sleep(200L);
         } catch (InterruptedException var6) {
            ;
         }

         if (xn.a(this.a) != Thread.currentThread()) {
            return;
         }

         ++this.a;
         aee var1;
         boolean var3;
         int var4;
         int var5;
         dk var9;
         if (xn.a(this.a) != null && (var1 = xn.a(this.a)).a != null && (var9 = var1.a).a) {
            try {
               dk var2 = var9;
               var3 = true;

               for(var4 = 0; var4 < var2.a.length; ++var4) {
                  var5 = var2.a(var2.c + var4);
                  if (var2.a[var4] != var5) {
                     var2.a[var4] = var5;
                     var3 = false;
                  }
               }

               if (!var3) {
                  SwingUtilities.invokeLater(new vm(var9));
               }
            } catch (NullPointerException var8) {
               ;
            }
         }

         hm var10;
         cg var11;
         if (xn.a(this.a) != null && (var10 = xn.a(this.a)).a != null && (var11 = var10.a).a != null) {
            zy var12 = var11.a;

            try {
               zy var13 = var12;
               var3 = true;

               for(var4 = 0; var4 < 256; ++var4) {
                  var5 = var13.a(var4);
                  if (var13.a[var4] != var5) {
                     var13.a[var4] = var5;
                     var3 = false;
                  }
               }

               if (!var3) {
                  SwingUtilities.invokeLater(new pz(var12));
               }
            } catch (NullPointerException var7) {
               ;
            }
         }
      }

   }

   // $FF: synthetic method
   nl(xn var1) {
      this(var1, (byte)0);
   }
}
