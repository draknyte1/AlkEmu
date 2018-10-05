package jsnes;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.Arrays;

final class xx extends bg {
   afi a;
   us a;
   final short[] a = new short['耀'];
   private short[] c = new short[256];
   private byte[] a = new byte[32];
   final short[] b = new short[256];
   final int[] a = new int[256];
   private int q;
   private int r;
   private boolean j;
   int a;
   int b;
   int c;
   private int s;
   int d;
   int e;
   private int t;
   private int u;
   int f;
   private int v;
   private int w;
   private int x;
   private int y;
   int g;
   int h;
   int i;
   int j;
   boolean a;
   boolean b;
   boolean c;
   boolean d;
   boolean e;
   private boolean k;
   private boolean l;
   boolean f;
   boolean g;
   int k;
   private int z;
   private int A;
   private int B;
   int l;
   private boolean m;
   int m;
   private int C;
   private final bl a = new bl();
   final qm a = new qm(this, 2);
   final qm b = new qm(this, 4);
   final qm c = new qm(this, 8);
   final bj[] a = new bj[4];
   private final bj a;
   private final bj b;
   private final bj c;
   private final bj d;
   private boolean n;
   boolean h;
   int n;
   int o;
   final xf a = new xf(this);
   int p;
   boolean i;
   BufferedImage a;
   private int[] b;
   private int[] c;

   xx() {
      this.a[0] = this.a = new bj(this, 0);
      this.a[1] = this.b = new bj(this, 1);
      this.a[2] = this.c = new bj(this, 2);
      this.a[3] = this.d = new bj(this, 3);
   }

   public final void a() {
      Arrays.fill(this.a, (short)0);
      this.g();
      Arrays.fill(this.c, (short)0);
      Arrays.fill(this.a, (byte)0);
      this.r = 1;

      int var2;
      int var3;
      for(int var1 = 0; var1 < 256; ++var1) {
         var2 = var1 % 8 << 2;
         var3 = var1 % 64 / 8 << 2;
         int var4 = var1 / 128 << 4;
         this.b[var1] = (short)(var2 << 10 | var3 << 5 | var4);
      }

      this.C = 0;
      this.m = 15;
      this.e();
      this.m = true;
      this.a = 0;
      this.b = 0;
      this.c = 1;
      this.s = 0;
      this.d = 0;
      this.e = 0;
      this.t = 0;
      this.u = 0;
      this.f = 0;
      this.v = 0;
      this.w = 0;
      this.x = 0;
      this.g = 0;
      this.h = 0;
      this.a.a();
      this.a.a();
      bj[] var5 = this.a;
      var2 = this.a.length;

      for(var3 = 0; var3 < var2; ++var3) {
         var5[var3].a();
      }

      this.d();
   }

   private int e(int var1) {
      return a(var1, this.m);
   }

   public final boolean a(int var1) {
      return var1 >= this.l;
   }

   private boolean a() {
      int var1 = this.p;
      return this.a(var1) || this.m;
   }

   private void d() {
      this.z = !this.k || this.k != 5 && this.k != 6 ? 256 : 512;
      this.A = this.l ? 239 : 224;
      this.B = this.A + 1;
      this.l = this.B * 1364;
      if (this.a == null || this.a.getWidth() != this.z || this.a.getHeight() != this.A) {
         fv.a("displayHeight %d; vBlankStart: %d;", this.A, this.l);
         this.a = new BufferedImage(this.z, this.A, 1);
         this.b = ((DataBufferInt)this.a.getRaster().getDataBuffer()).getData();
      }

      if (this.c == null || this.c.length != this.z) {
         this.c = new int[this.z];
      }

      us var1;
      (var1 = this.a).j();
      var1.k();
      var1.l();
   }

   private void e() {
      for(int var1 = 0; var1 < 256; ++var1) {
         this.a[var1] = this.e(this.b[var1]);
      }

      this.j = true;
   }

   public final int c(int var1) {
      if ((var1 & 512) == 0) {
         short var2 = this.c[var1 >> 1];
         return (var1 & 1) == 0 ? var2 & 255 : var2 >> 8 & 255;
      } else {
         return this.a[var1 & 31] & 255;
      }
   }

   public final int d(int var1) {
      return (var1 & 1) == 0 ? this.b[var1 >> 1] & 255 : this.b[var1 >> 1] >> 8 & 255;
   }

   public final ks a(int var1) {
      if (var1 == 0) {
         return this.a.a;
      } else if (var1 == 1) {
         return this.a.b;
      } else {
         throw new IllegalArgumentException();
      }
   }

   final void b() {
      this.i = this.p % 1364 / 4;
      this.j = this.p / 1364;
      if (this.a.a() != null) {
         this.a.a().a("PPU: Latch at " + this.p + ": " + this.j + ", " + this.i);
      }

      this.c = true;
   }

   final void c() {
      this.d = this.a[this.a()] & '\uffff';
   }

   private void f() {
      this.e = this.t << 1;
   }

   private void g() {
      ++this.q;
      this.a.a.a();
      this.a.b.a();
      this.a.a();
      this.b.a();
      this.c.a();
   }

   public final void a(int var1, vy var2, vy var3, vy var4) {
      int[] var5 = new int[]{8448, 8449, 8450, 8451, 8453, 8454, 8455, 8456, 8457, 8458, 8459, 8460, 8461, 8462, 8463, 8464, 8465, 8466, 8467, 8468, 8469, 8474, 8475, 8476, 8477, 8478, 8479, 8480, 8483, 8484, 8485, 8486, 8487, 8488, 8489, 8490, 8491, 8492, 8493, 8494, 8495, 8496, 8497, 8499};
      this.p = this.l;
      int var6 = (var5 = var5).length;

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         int var8 = var5[var7];
         this.a(var8, var4.a(var8), this.l);
      }

      var2.a(3);
      var2.a(2);
      this.a = var2.b();
      var2.a(6);
      var2.a(44);
      boolean var9 = var2.a();

      for(var6 = 0; var6 < this.b.length; ++var6) {
         this.b[var6] = (short)var2.b();
      }

      this.e();
      var2.a(1);
      if (var1 >= 3) {
         var2.a(1);
      }

      var2.a(1408);
      var2.a(1);
      this.e = var2.b() << 1;
      if (var2.a()) {
         ++this.e;
      }

      var2.a(2);
      var2.a(4);
      this.j = var2.b();
      this.i = var2.b();
      this.a = var2.a();
      this.b = var2.a();
      this.c = var2.a();
      var2.a(12);
      if (var1 >= 2) {
         var2.a(4);
      }

      if (var1 < 2) {
         var2.a(3);
      }

      this.f = var2.a() << 1;
      if (var9) {
         ++this.f;
      }

      this.C = var2.a() | var2.a() << 3 | var2.a() << 6;
      this.t = var2.b() << 1;
      var2.a(6);
      var2.a(1);
      if (var1 >= 3) {
         var2.a(2);
      }

      var2.a(5);
      if (var1 >= 3) {
         var2.a(1);
      }

      var2.a(1);
      var2.a(4);
      var2.a(1);
      if (var1 >= 3) {
         var2.a(1);
      }

      var2.a(7);
      var2.a(30);
      if (var1 >= 3) {
         var2.a(6);
      }

      if (var1 >= 3) {
         var2.a(1);
      }

      var2.a(1);
      var2.a(1);
      var2.a(4);

      for(var6 = 0; var6 < 256; ++var6) {
         var7 = var2.a() | var2.a() << 8;
         this.c[var6] = (short)var7;
      }

      var2.a(this.a);
      ++this.r;
      var2.a(1);
      if (var1 < 2) {
         var2.a(2);
      }

      this.u = var2.b();
      this.w = var2.a();
      this.x = var2.a();
      this.g = var2.a();
      this.h = var2.a();

      for(var6 = 0; var6 < 32768; ++var6) {
         var7 = var3.a() | var3.a() << 8;
         this.a[var6] = (short)var7;
      }

      this.g();
      this.p = this.a.c();
   }

   public final void a(int var1, int var2, int var3) {
      this.a(var3);
      xf var8;
      switch(var1) {
      case 8448:
         if (this.m && ((var2 & 128) == 0 || var3 / 1364 == this.B)) {
            this.f();
         }

         this.m = (var2 & 128) != 0;
         if (this.m != (var2 & 15)) {
            this.m = var2 & 15;
            this.j = false;
            return;
         }
         break;
      case 8449:
         var8 = this.a;
         this.a.a.a((var2 & 3) << 13);
         var8.b.a(((var2 & 3) << 13) + (((var2 & 24) >> 3) + 1 << 12) & 32767);
         byte var6;
         byte var7;
         byte var9;
         byte var11;
         switch(var2 >> 5) {
         case 0:
            var7 = 1;
            var6 = 1;
            var11 = 2;
            var9 = 2;
            break;
         case 1:
            var7 = 1;
            var6 = 1;
            var11 = 4;
            var9 = 4;
            break;
         case 2:
            var7 = 1;
            var6 = 1;
            var11 = 8;
            var9 = 8;
            break;
         case 3:
            var7 = 2;
            var6 = 2;
            var11 = 4;
            var9 = 4;
            break;
         case 4:
            var7 = 2;
            var6 = 2;
            var11 = 8;
            var9 = 8;
            break;
         case 5:
            var7 = 4;
            var6 = 4;
            var11 = 8;
            var9 = 8;
            break;
         case 6:
            var6 = 2;
            var7 = 4;
            var9 = 4;
            var11 = 8;
            break;
         case 7:
            var6 = 2;
            var7 = 4;
            var9 = 4;
            var11 = 4;
            break;
         default:
            var11 = 1;
            var9 = 1;
            var7 = 1;
            var6 = 1;
         }

         var8.a = var6;
         var8.b = var7;
         var8.c = var9;
         var8.d = var11;
         ++var8.a.r;
         return;
      case 8450:
         this.t = this.t & '\uff00' | var2;
         this.f();
         return;
      case 8451:
         this.t = var2 << 8 & 256 | this.t & 255;
         this.f();
         this.a.a = (var2 & 128) != 0;
         return;
      case 8452:
         if (!this.a()) {
            this.e = 1072;
         }

         if ((this.e & 512) == 0) {
            if ((this.e & 1) == 0) {
               this.u = this.u & '\uff00' | var2;
            } else {
               this.u = var2 << 8 | this.u & 255;
               if (this.c[this.e >> 1] != (short)this.u) {
                  this.c[this.e >> 1] = (short)this.u;
                  ++this.r;
               }
            }
         } else if (this.a[this.e & 31] != (byte)var2) {
            this.a[this.e & 31] = (byte)var2;
            ++this.r;
         }

         this.e = (this.e + 1) % 544;
         return;
      case 8453:
         if (this.k != (var2 & 7)) {
            this.k = var2 & 7;
            this.d();
            this.a.b();
            this.b.b();
            this.c.b();
            this.d.b();
         }

         this.n = (var2 & 8) != 0;
         this.a.a((var2 & 16) != 0);
         this.b.a((var2 & 32) != 0);
         this.c.a((var2 & 64) != 0);
         this.d.a((var2 & 128) != 0);
         return;
      case 8454:
         return;
      case 8455:
         this.a.b(var2);
         return;
      case 8456:
         this.b.b(var2);
         return;
      case 8457:
         this.c.b(var2);
         return;
      case 8458:
         this.d.b(var2);
         return;
      case 8459:
         this.a.a((var2 & 7) << 12);
         this.b.a((var2 & 112) << 8);
         return;
      case 8460:
         this.c.a((var2 & 7) << 12);
         this.d.a((var2 & 112) << 8);
         return;
      case 8461:
         this.a.a = (var2 << 8 | this.w) & 1023;
         this.w = var2;
         return;
      case 8462:
         this.a.b = (var2 << 8 | this.w) & 1023;
         this.w = var2;
         return;
      case 8463:
         this.b.a = (var2 << 8 | this.w) & 1023;
         this.w = var2;
         return;
      case 8464:
         this.b.b = (var2 << 8 | this.w) & 1023;
         this.w = var2;
         return;
      case 8465:
         this.c.a = (var2 << 8 | this.w) & 1023;
         this.w = var2;
         return;
      case 8466:
         this.c.b = (var2 << 8 | this.w) & 1023;
         this.w = var2;
         return;
      case 8467:
         this.d.a = (var2 << 8 | this.w) & 1023;
         this.w = var2;
         return;
      case 8468:
         this.d.b = (var2 << 8 | this.w) & 1023;
         this.w = var2;
         return;
      case 8469:
         this.b = var2 >> 7;
         switch(var2 & 3) {
         case 0:
            this.c = 1;
            break;
         case 1:
            this.c = 32;
            break;
         default:
            this.c = 128;
         }

         this.s = (var2 & 12) >> 2;
         return;
      case 8470:
         this.a = this.a & '\uff00' | var2;
         this.c();
         return;
      case 8471:
         this.a = (var2 & 127) << 8 | this.a & 255;
         this.c();
         return;
      case 8472:
      case 8473:
         if (this.a()) {
            var3 = this.a();
            short var4;
            short var5 = var4 = this.a[var3];
            int var10;
            if ((var1 & 1) == 0) {
               var10 = var4 & '\uff00' | var2;
            } else {
               var10 = var2 << 8 | var4 & 255;
            }

            if (var10 != var5) {
               this.a[var3] = (short)var10;
               var8 = this.a;
               this.a.a.b(var3);
               var8.b.b(var3);
               this.a.a(var3);
               this.b.a(var3);
               this.c.a(var3);
               ++this.q;
            }

            if (this.b == (var1 & 1)) {
               this.a = this.a + this.c & 32767;
               return;
            }
         }
      case 8474:
      case 8479:
      case 8480:
      case 8494:
      case 8495:
      default:
         break;
      case 8475:
         this.n = var2 << 8 | this.x;
         this.x = var2;
         return;
      case 8476:
         this.o = var2 << 8 | this.x;
         this.x = var2;
         return;
      case 8477:
         this.x = var2;
         return;
      case 8478:
         this.x = var2;
         return;
      case 8481:
         this.f = var2 << 1;
         return;
      case 8482:
         if ((this.f & 1) == 0) {
            this.v = var2;
         } else {
            this.b[this.f >> 1] = (short)((var2 & 127) << 8 | this.v);
            this.a[this.f >> 1] = this.e(this.b[this.f >> 1]);
         }

         this.f = this.f + 1 & 511;
         return;
      case 8483:
         return;
      case 8484:
         return;
      case 8485:
         return;
      case 8486:
         return;
      case 8487:
         return;
      case 8488:
         return;
      case 8489:
         return;
      case 8490:
         return;
      case 8491:
         return;
      case 8492:
         this.a.b = (var2 & 1) != 0;
         this.b.b = (var2 & 2) != 0;
         this.c.b = (var2 & 4) != 0;
         this.d.b = (var2 & 8) != 0;
         this.a.c = (var2 & 16) != 0;
         return;
      case 8493:
         this.a.c = (var2 & 1) != 0;
         this.b.c = (var2 & 2) != 0;
         this.c.c = (var2 & 4) != 0;
         this.d.c = (var2 & 8) != 0;
         this.a.d = (var2 & 16) != 0;
         return;
      case 8496:
         this.h = (var2 & 1) != 0;
         this.a.c();
         this.b.c();
         this.c.c();
         this.d.c();
         return;
      case 8497:
         return;
      case 8498:
         if ((var2 & 128) != 0) {
            this.C = this.C & -31745 | (var2 & 31) << 10;
         }

         if ((var2 & 64) != 0) {
            this.C = this.C & -993 | (var2 & 31) << 5;
         }

         if ((var2 & 32) != 0) {
            this.C = this.C & -32 | var2 & 31;
         }

         return;
      case 8499:
         if (this.y != var2) {
            this.y = var2;
            this.k = (var2 & 8) != 0;
            this.l = (var2 & 4) != 0;
            this.f = (var2 & 1) != 0;
            this.d();
         }
      }

   }

   private int a() {
      int var1 = this.a;
      switch(this.s) {
      case 0:
         return var1;
      case 1:
         return var1 & 32512 | (var1 & 224) >> 5 | (var1 & 31) << 3;
      case 2:
         return var1 & 32256 | (var1 & 448) >> 6 | (var1 & 63) << 3;
      case 3:
         return var1 & 31744 | (var1 & 896) >> 7 | (var1 & 127) << 3;
      default:
         return var1;
      }
   }

   public final void a(int var1) {
      int var2 = this.p;
      int var3 = this.p / 1364;
      int var4;
      if ((var4 = var2 % 1364) >= 1024) {
         var2 += 1364;
      }

      var2 -= var4;

      for(var2 += 1024; var2 < var1; var2 += 1364) {
         int var5 = var3++;
         if (var5 >= 1 && var5 <= this.A) {
            int var7 = var5 - 1;
            xf var6 = this.a;
            xf var13 = this.a;
            int var10;
            int var15;
            int var16;
            if (this.a.f != var13.a.r) {
               kq[] var14 = var13.a;
               var15 = var13.a.length;

               for(var16 = 0; var16 < var15; ++var16) {
                  kq var8;
                  var10 = (var8 = var14[var16]).a.c[var8.a << 1] & '\uffff';
                  var8.b = var10 & 255;
                  var8.c = var10 >> 8;
                  var10 = var8.a.c[(var8.a << 1) + 1] & '\uffff';
                  var8.d = var10 & 255;
                  if ((var10 & 256) == 0) {
                     var8.a = var8.a.a.a;
                  } else {
                     var8.a = var8.a.a.b;
                  }

                  var8.e = 128 + ((var10 & 3584) >> 5);
                  var8.f = (var10 & 768) >> 8;
                  var8.a = (var10 & 16384) != 0;
                  var8.b = (var10 & '耀') != 0;
                  if (((var10 = (var8.a.a[var8.a / 4] & 255) >>> (var8.a % 4 << 1)) & 1) != 0) {
                     var8.b -= 256;
                  }

                  if ((var10 & 2) == 0) {
                     var8.g = var8.a.a.a;
                     var8.h = var8.a.a.b;
                  } else {
                     var8.g = var8.a.a.c;
                     var8.h = var8.a.a.d;
                  }

                  var8.i = var8.g << 3;
                  var8.j = var8.h << 3;
                  var8.c = var8.b < 256 && var8.b > -var8.i;
               }

               var13.f = var13.a.r;
            }

            int var22;
            if (!var6.a) {
               var22 = 0;
            } else {
               var22 = (var6.a.e >> 1 & 254) >> 1;
            }

            int var9 = 0;
            var10 = 0;

            int var11;
            for(var11 = 0; var11 < 128; ++var11) {
               kq var12;
               boolean var10000;
               kq var29;
               if (!(var29 = var12 = var6.a[var22 + var11 & 127]).c) {
                  var10000 = false;
               } else {
                  var15 = var29.c;
                  var16 = var29.c + var29.j - 1;
                  var10000 = var7 >= var15 && var7 <= var16 || var16 > 256 && var7 <= var16 % 256;
               }

               if (var10000) {
                  if (var9 >= 32) {
                     var6.f = true;
                     break;
                  }

                  var6.b[var9++] = var12;
                  int var32 = var12.b;
                  var15 = 0;

                  for(var16 = var12.g; var16-- != 0; var32 += 8) {
                     if (var32 > -8 && var32 < 256) {
                        ++var15;
                     }
                  }

                  var10 += var15;
               }
            }

            if (var10 > 34) {
               var6.e = true;
            }

            var6.e = var9;
            if (!this.i) {
               if (!this.j) {
                  this.e();
               }

               int[] var23 = this.b;
               int[] var24 = this.c;
               int var31;
               if (!this.m) {
                  xf var25;
                  boolean var26;
                  boolean var30;
                  boolean var33;
                  boolean var35;
                  int var38;
                  label281: {
                     var26 = this.a.a && this.a.a();
                     var30 = this.b.a && this.b.a();
                     var33 = this.c.a && this.c.a();
                     var35 = this.d.a && this.d.a();
                     if (this.a.b) {
                        var25 = this.a;
                        if (this.a.c || var25.d) {
                           var25 = this.a;
                           if (this.a.e != 0) {
                              var38 = var25.b[0].f;
                              break label281;
                           }
                        }
                     }

                     var38 = -1;
                  }

                  var16 = var38;
                  switch(this.k) {
                  case 0:
                     if (var35) {
                        this.d.a(var5, var24, (int[])null, false);
                     }

                     if (var33) {
                        this.c.a(var5, var24, (int[])null, false);
                     }

                     if (var35) {
                        this.d.a(var5, var24, (int[])null, true);
                     }

                     if (var33) {
                        this.c.a(var5, var24, (int[])null, true);
                     }

                     if (var30) {
                        this.b.a(var5, var24, (int[])null, false);
                     }

                     if (var26) {
                        this.a.a(var5, var24, (int[])null, false);
                     }

                     if (var30) {
                        this.b.a(var5, var24, (int[])null, true);
                     }

                     if (var26) {
                        this.a.a(var5, var24, (int[])null, true);
                     }
                     break;
                  case 1:
                     if (var33) {
                        this.c.a(var5, var24, (int[])null, false);
                     }

                     if (var33 && !this.n) {
                        this.c.a(var5, var24, (int[])null, true);
                     }

                     if (var30) {
                        this.b.a(var5, var24, (int[])null, false);
                     }

                     if (var26) {
                        this.a.a(var5, var24, (int[])null, false);
                     }

                     if (var30) {
                        this.b.a(var5, var24, (int[])null, true);
                     }

                     if (var26) {
                        this.a.a(var5, var24, (int[])null, true);
                     }

                     if (var33 && this.n) {
                        this.c.a(var5, var24, (int[])null, true);
                     }
                     break;
                  case 2:
                  case 3:
                  case 4:
                  case 5:
                     if (var30) {
                        this.b.a(var5, var24, (int[])null, false);
                     }

                     if (var26) {
                        this.a.a(var5, var24, (int[])null, false);
                     }

                     if (var30) {
                        this.b.a(var5, var24, (int[])null, true);
                     }

                     if (var26) {
                        this.a.a(var5, var24, (int[])null, true);
                     }
                     break;
                  case 6:
                     if (var26) {
                        this.a.a(var5, var24, (int[])null, false);
                     }

                     if (var26) {
                        this.a.a(var5, var24, (int[])null, true);
                     }
                     break;
                  case 7:
                     if (var30) {
                        this.a.a(var5, var24, (int[])null, false);
                     }

                     if (var26) {
                        this.a.a(var5, var24, (int[])null, false);
                     }

                     if (var30) {
                        this.a.a(var5, var24, (int[])null, true);
                     }

                     if (var26) {
                        this.a.a(var5, var24, (int[])null, true);
                     }
                  }

                  if (var16 != -1) {
                     int[] var27 = var24;
                     var11 = var5;
                     var25 = this.a;
                     var31 = this.a.e;

                     while(var31-- != 0) {
                        kq var39 = var25.b[var31];
                        int[] var36 = var27;
                        kq var34 = var39;
                        var15 = var11 - 1 - var34.c;
                        if (var34.b) {
                           var15 = var34.j - 1 - var15;
                        }

                        var15 = var15 + (var34.d >> 4 << 3) & 127;
                        byte[] var37 = var34.a.a(var15);
                        int var17 = var34.b;
                        int var18 = var34.b + var34.i;
                        int var19 = (var34.d & 15) << 3;
                        byte var20;
                        if (!var34.a) {
                           var20 = 1;
                        } else {
                           var19 += var34.i - 1;
                           var20 = -1;
                        }

                        if (var17 < 0) {
                           var19 -= var20 * var34.b;
                           var17 = 0;
                        } else if (var18 > var27.length) {
                           var18 = var27.length;
                        }

                        while(var17 < var18) {
                           int var21;
                           if ((var21 = var37[var19 & 127] & 15) != 0) {
                              var36[var17] = var34.a.a[var21 + var34.e];
                           }

                           var19 += var20;
                           ++var17;
                        }
                     }
                  }

                  var10 = this.a[0];
               } else {
                  var10 = 0;
               }

               int var28 = var5 - 1 << 8;
               var31 = 0;

               do {
                  var23[var28] = var24[var31];
                  var24[var31] = var10;
                  ++var28;
                  ++var31;
               } while(var31 < 256);
            }
         }

         if (var5 == this.B - 1 && !this.m) {
            this.f();
         }
      }

      this.p = var1;
   }
}
