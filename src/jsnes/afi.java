package jsnes;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.RenderingHints.Key;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.zip.GZIPInputStream;

final class afi {
   private static int a = 0;
   public final us a;
   public final xx a;
   public final kt a;
   public final afe a;
   private wl a;
   private ea a;
   private volatile ea b;
   private volatile byte[] a;
   private volatile Thread a;
   private volatile boolean a;
   private volatile boolean b;
   private volatile boolean c;
   private volatile boolean d;
   private volatile float a;
   private volatile int b;
   private volatile int c;
   private volatile int d;
   private long a;
   private int e;
   private int f;
   private int g;
   private final Object a = new Object();

   public afi() {
      ++a;
      this.a = new us();
      this.a = new xx();
      this.a = new kt();
      this.a = new afe();
      this.d = false;
      this.a(1.0F);
      us var1 = this.a;
      this.a.a = this.a;
      var1.a = this.a;
      var1.a = this.a;
      xx var3 = this.a;
      this.a.a = this;
      var3.a = this.a;
      this.a = true;
      this.b = false;
      this.c = false;
      this.a = new aeh(this, "SNES Thread " + a);
      this.a.setPriority(4);
      this.a.start();
   }

   public final void a(wl var1) {
      var1.a(1.1484375F);
      this.a = var1;
   }

   public final wl a() {
      return this.a;
   }

   public final synchronized void a(ea var1) {
      this.b = var1;
      this.notify();
   }

   public final ea a() {
      return this.b != null ? this.b : this.a;
   }

   public final synchronized void a(boolean var1) {
      this.a = var1;
      this.notify();
   }

   public final boolean a() {
      return this.a;
   }

   public final synchronized void a() {
      this.b = true;
      this.notify();
   }

   public final synchronized void b() {
      this.c = true;
      this.notify();
   }

   public final void a(float var1) {
      if (var1 < 0.1F) {
         var1 = 0.1F;
      }

      this.a = var1;
      if (this.d) {
         this.b = (int)(2.128137E7F * this.a);
         this.c = 50;
      } else {
         this.b = (int)(2.1477272E7F * this.a);
         this.c = 60;
      }
   }

   public final float a() {
      return this.a;
   }

   public final int a() {
      return (int)((float)this.c * this.a);
   }

   public final int b() {
      return this.e;
   }

   public final int c() {
      return this.f;
   }

   private boolean b() {
      while(this.a || this.a == null && this.b == null) {
         try {
            synchronized(this) {
               this.wait();
            }
         } catch (InterruptedException var4) {
            ;
         }

         if (this.c) {
            return false;
         }
      }

      if (this.c) {
         return false;
      } else {
         if (this.b != null) {
            this.a = this.b;
            this.b = null;
            this.d = this.a.a;
            this.a(this.a);
            this.a.a(this.a);
            ea var2 = this.a;
            xx var1 = this.a;
            this.a.e = var2.a;
            var1.a();
            if (var1.a.a != null) {
               var1.a.a.a();
            }

            this.a.f();
         }

         if (this.b) {
            this.b = false;
            this.a.f();
            this.a.g();
            this.a.a();
            this.d = 0;
            this.d = this.a.a;
         }

         if (this.a != null) {
            Exception var5 = this.a(this.a);
            this.a = null;
            if (var5 != null) {
               fv.a((Object)var5);
            }
         }

         return true;
      }
   }

   public final void a(byte[] var1) {
      this.a = Arrays.copyOf(var1, var1.length);
   }

   private Exception a(byte[] var1) {
      try {
         var1 = hu.a(new GZIPInputStream(new ByteArrayInputStream(var1)), (jn)null, 0, -1);
      } catch (Exception var11) {
         return var11;
      }

      vy var2;
      (var2 = new vy(var1)).a = true;
      Exception var3 = new Exception("Savestate corrupt or format unknown");

      try {
         if (!var2.a(9).equals("#!snes9x:")) {
            return var3;
         } else {
            int var4 = Integer.parseInt(var2.a(4));
            if ((char)var2.a() != '\n') {
               return var3;
            } else {
               HashMap var5 = new HashMap();
               ArrayList var6 = new ArrayList();

               do {
                  String var7 = var2.a(3);
                  if ((char)var2.a() != ':') {
                     return var3;
                  }

                  int var8;
                  if ((var8 = Integer.parseInt(var2.a(6))) < 0) {
                     return var3;
                  }

                  if ((char)var2.a() != ':') {
                     return var3;
                  }

                  vy var9;
                  (var9 = new vy(var1, var2.b)).a = true;
                  var6.add(var7);
                  var5.put(var7, var9);
                  var2.a(var8);
               } while(var2.a + var2.b < var2.a.length);

               this.a.a(var4, (vy)var5.get("CPU"), (vy)var5.get("REG"), (vy)var5.get("DMA"), (vy)var5.get("RAM"), (vy)var5.get("SRA"), (vy)var5.get("FIL"), (vy)var5.get("PPU"));
               ((vy)var5.get("FIL")).b = 0;
               ((vy)var5.get("PPU")).b = 0;
               this.a.a(var4, (vy)var5.get("PPU"), (vy)var5.get("VRA"), (vy)var5.get("FIL"));
               kt var10000 = this.a;
               vy var10002 = (vy)var5.get("APU");
               vy var10003 = (vy)var5.get("ARE");
               vy var10004 = (vy)var5.get("ARA");
               var5.get("SOU");
               var10000.a(var4, var10002, var10003, var10004);
               return null;
            }
         }
      } catch (Throwable var10) {
         return var3;
      }
   }

   // $FF: synthetic method
   static void a(afi var0) {
      fv.a("SNES: Beginning execution");
      afi var1 = var0;
      boolean var3 = false;
      int var4 = 0;
      long var6 = System.nanoTime();

      while(true) {
         if (var1.a == null) {
            var3 = true;
         }

         ++var1.d;
         if (!var1.b()) {
            var0.a = null;
            return;
         }

         xx var2 = var1.a;
         var1.a.p = 0;
         var2.g = !var2.g;
         var2.a.f = false;
         var2.a.e = false;
         var1.a.i = var3;
         var2 = var1.a;
         int var8 = !var1.a.e ? 357368 : 425568;
         if (var2.f && var2.g) {
            var8 += 1364;
         }

         long var10 = System.nanoTime();
         var1.a.c(var8);
         int var34 = var1.a.c() - var8;
         var1.a.d(var34);
         long var12 = System.nanoTime();
         var1.a.a(var8);
         long var14 = System.nanoTime();
         var1.a.c(var8);
         var34 = var1.a.c() - var8;
         var1.a.b(var34);
         long var16 = System.nanoTime();
         if (!var3) {
            BufferedImage var37 = var1.a.a;
            wl var35 = var1.a;
            Graphics2D var9 = var1.a.a;
            int var18 = var37.getWidth((ImageObserver)null);
            int var19 = var37.getHeight((ImageObserver)null);
            int var20 = var35.a.getWidth();
            int var21 = var35.a.getHeight();
            AffineTransform var23 = var9.getTransform();
            double var28 = 1.0D;
            double var30 = 1.0D;
            if (var35.a) {
               float var24;
               if ((var24 = var35.b ? var35.a : 1.0F) < 0.01F) {
                  var24 = 1.0F;
               }

               float var25 = (float)var20 / (float)var18;
               int var22;
               if ((var22 = (int)((float)var19 * var25 / var24)) > var21) {
                  var25 = (float)var21 / (float)var19;
                  var21 = (int)((float)var18 * var25 * var24);
                  var20 = (var20 - var21) / 2;
                  var21 = 0;
                  var28 = (double)(var25 * var24);
                  var30 = (double)var25;
               } else {
                  var20 = 0;
                  var21 = (var21 - var22) / 2;
                  var28 = (double)var25;
                  var30 = (double)(var25 / var24);
               }
            } else {
               var20 = (var20 - var18) / 2;
               var21 = (var21 - var19) / 2;
            }

            AffineTransform var44 = AffineTransform.getTranslateInstance((double)var20, (double)var21);
            if (var35.a) {
               var44.scale(var28, var30);
            }

            label127: {
               var9.transform(var44);
               if (ow.e) {
                  Key var43 = RenderingHints.KEY_INTERPOLATION;
                  Object var36;
                  if (((var36 = var35.a.getRenderingHint(var43)) == RenderingHints.VALUE_INTERPOLATION_BILINEAR ? 1 : (var36 == RenderingHints.VALUE_INTERPOLATION_BICUBIC ? 2 : 0)) == 0) {
                     for(var34 = 0; var34 < var19 - 4 + 1; var34 += 4) {
                        var9.drawImage(var37, 0, var34, var18, var34 + 4, 0, var34, var18, var34 + 4, (ImageObserver)null);
                     }

                     if (var19 % 4 != 0) {
                        var34 = var19 - var19 % 4;
                        var9.drawImage(var37, 0, var34, var18, var19, 0, var34, var18, var19, (ImageObserver)null);
                     }
                     break label127;
                  }
               }

               var9.drawImage(var37, 0, 0, (ImageObserver)null);
            }

            var9.setTransform(var23);
         }

         long var42 = System.nanoTime();
         boolean var38 = !var3;
         if (var38) {
            ++var1.g;
         }

         if (var1.d % 60 == 0) {
            var1.e = (int)(1000000000L / ((System.nanoTime() - var1.a) / 60L));
            var1.f = (int)((float)var1.g * ((float)var1.c * var1.a / 60.0F));
            var1.g = 0;
            var1.a = System.nanoTime();
         }

         long var40;
         var34 = (int)((var40 = System.nanoTime()) - var6) / 1000;
         var6 = var40;
         int var5 = var8 * 1000 / (var1.b / 1000);
         if ((var4 += var5 - var34) > 200000) {
            var4 = 0;
         }

         if (var4 <= 2000) {
            if (var4 < -2000) {
               var3 = !var3;
               if (var4 < -200000) {
                  var4 = 0;
               }
            } else {
               var3 = false;
            }

            Thread.yield();
         } else {
            long var45 = (long)var4 * 1000L;
            long var26 = System.nanoTime();

            try {
               Object var41 = var1.a;
               synchronized(var1.a) {
                  var1.a.wait((long)(var4 / 1000) - 1L);
               }
            } catch (InterruptedException var33) {
               ;
            }

            while(System.nanoTime() - var26 < var45) {
               ;
            }

            var3 = false;
         }

         int var46 = (int)(var12 - var10) / 1000;
         int var47 = (int)(var14 - var12) / 1000;
         int var48 = (int)(var16 - var14) / 1000;
         int var27 = (int)(var42 - var16) / 1000;
         var8 = (int)(var42 - var10) / 1000;
         int var39 = var5 - var8;
         fv.a("[%d:%02d]: C %05d; P %05d; A %05d; R %05d; Total %05d / %05d; Free %05d; Offset %+06d/%+06d", var1.d / var1.c, var1.d % var1.c, var46, var47, var48, var27, var8, var34, var39, var4, var5 - var34);
      }
   }
}
