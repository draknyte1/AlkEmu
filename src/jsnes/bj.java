package jsnes;

public final class bj extends kr {
   private int c;
   int a;
   int b;
   private int d;
   private int e;
   private int f;
   private int g;
   private boolean d;
   boolean a;
   boolean b;
   boolean c;
   private int h;
   private int i;
   private int j;
   private boolean e;
   private int k;
   private qm a;
   // $FF: synthetic field
   private xx a;

   public bj(xx var1, int var2) {
      this.a = var1;
      super();
      this.c = var2;
      this.a = true;
   }

   public final void a() {
      this.a = 0;
      this.b = 0;
      this.d = 0;
      this.e = 0;
      this.g = 0;
      this.d = false;
      this.b = true;
      this.c = false;
      this.b();
      this.d();
      super.a();
   }

   public final boolean a() {
      return this.b || this.c;
   }

   public final void a(int var1) {
      if (this.e != var1) {
         this.e = var1;
         this.e();
      }

   }

   public final void a(boolean var1) {
      int var2 = this.a.k;
      if (this.a.k != 5 && var2 != 6) {
         if (var2 == 7) {
            var1 = false;
         }
      } else {
         var1 = true;
      }

      if (this.d != var1) {
         this.d = var1;
         this.d();
      }

   }

   public final void b(int var1) {
      int var3 = var1 & 3;
      if (this.g != var3) {
         this.g = var3;
         this.d();
      }

      var3 = (var1 & 252) << 8;
      if (this.d != var3) {
         this.d = var3;
         this.e();
      }

   }

   public final void b() {
      byte var1 = 0;
      int var2 = 0;
      switch(this.a.k) {
      case 0:
         this.f = 2;
         var1 = 4;
         var2 = this.c << 5;
         break;
      case 1:
         if (this.c == 2) {
            this.f = 2;
            var1 = 4;
         } else {
            this.f = 4;
            var1 = 16;
         }
         break;
      case 2:
         this.f = 4;
         var1 = 16;
         break;
      case 3:
         if (this.c == 0) {
            this.f = 8;
            var1 = 0;
         } else {
            this.f = 4;
            var1 = 16;
         }
         break;
      case 4:
         if (this.c == 0) {
            this.f = 8;
            var1 = 0;
         } else {
            this.f = 2;
            var1 = 4;
         }
         break;
      case 5:
      case 6:
         if (this.c == 0) {
            this.f = 4;
            var1 = 16;
         } else {
            this.f = 2;
            var1 = 4;
         }
         break;
      case 7:
         if (this.c == 0) {
            this.f = 8;
            var1 = 0;
         } else {
            this.f = 7;
            var1 = 0;
         }
      }

      this.i = var1;
      this.j = var2;
      this.a(this.d);
      this.c();
      switch(this.f) {
      case 2:
         this.a = this.a.a;
         break;
      case 4:
         this.a = this.a.b;
         break;
      case 8:
         this.a = this.a.c;
      }

      this.e();
   }

   public final void c() {
      this.e = this.a.h && this.f == 8;
   }

   private void d() {
      this.e();
      this.h = ((this.g & 1) == 0 ? 256 : 512) << (this.d ? 1 : 0);
   }

   private void e() {
      --this.k;
   }

   public final void a(int var1, int[] var2, int[] var3, boolean var4) {
      boolean var6 = var4;
      int var7 = this.d;
      if ((var1 += this.b) >= 256) {
         if ((var1 & 256) != 0 && (this.g & 2) != 0) {
            var7 += 1024;
            if ((this.g & 1) != 0) {
               var7 += 1024;
            }
         }

         var1 &= 255;
      }

      var7 += var1 >> 3 << 5;
      var1 &= 7;
      int var5;
      if ((var5 = this.a & this.h - 1) == 0) {
         this.a(0, var1, var2, var7, var6);
      } else {
         if (var5 < 256) {
            this.a(0 - var5, var1, var2, var7, var6);
         } else {
            this.a(512 - var5, var1, var2, var7, var6);
         }

         if ((this.g & 1) != 0) {
            var7 += 1024;
         }

         this.a(256 - var5, var1, var2, var7, var6);
      }
   }

   private void a(int var1, int var2, int[] var3, int var4, boolean var5) {
      int var6 = var3.length;

      for(int var7 = 32; var7-- != 0; ++var4) {
         if (var1 >= -7) {
            if (var1 > var6) {
               break;
            }

            int var8;
            if (((var8 = this.a.a[var4 & 32767] & '\uffff') & 8192) != 0 == var5) {
               int var10 = var2;
               int var9 = var1;
               int var13 = var8 & 1023;
               if ((var13 = this.a.a(this.e, var13)) != -1) {
                  if ((var8 & '耀') != 0) {
                     var10 = 7 - var2;
                  }

                  var13 += var10 << 3;
                  byte var16;
                  if ((var8 & 16384) == 0) {
                     var16 = 1;
                  } else {
                     var13 += 7;
                     var16 = -1;
                  }

                  int var14;
                  if (var1 < 0) {
                     var14 = var1 + 8;
                     var13 -= var16 * var1;
                     var9 = 0;
                  } else if (var1 + 8 >= var3.length) {
                     var14 = var3.length - var1;
                  } else {
                     var14 = 8;
                  }

                  byte[] var15 = this.a.a;
                  int var12;
                  if (!this.e) {
                     var12 = ((var8 & 7168) >> 10) * this.i + this.j;
                     bg.a(var15, var13, var16, var3, var9, this.a.a, var12, var14);
                  } else {
                     var12 = bg.b(var8);
                     bg.a(var15, var13, var16, var3, var9, var12, this.a.m, var14);
                  }
               }
            }
         }

         var1 += 8;
      }

   }
}
