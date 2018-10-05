package jsnes;

import java.util.Arrays;

final class us extends adv {
   xx a;
   kt a;
   afe a;
   byte[] a;
   private int l;
   private byte[] b;
   private byte[] c;
   private int m;
   private wg[] a;
   private int n;
   private int o;
   int b;
   private boolean j;
   private int p;
   private int q;
   private int r;
   private boolean k;
   private boolean l;
   private boolean m;
   private boolean n;
   private int s;
   private int t;
   private int u;
   private int v;
   private int w;
   private boolean o;
   private int x;
   private int y;
   private int z;
   private int A;
   private int B;
   private int C;
   private int D;
   private int E;
   private int F;
   private int G;
   private int H;

   us() {
      Compiler.compileClass(this.getClass());
      this.a = new byte[131072];
      Arrays.fill(this.a, (byte)51);
      this.a = new wg[8];
   }

   public final void a(ea var1) {
      int var2;
      this.l = var1.a;
      this.b = var1.a;
      this.c = var1.b;
      this.a = new jw[256];
      this.a[126] = new sj(this);
      this.a[127] = new si(this);
      label108:
      switch(this.l) {
      case 20:
         for(var2 = 0; var2 <= 63; ++var2) {
            this.a[var2] = new rm(this, var2);
         }

         for(var2 = 64; var2 <= 125; ++var2) {
            this.a[var2] = new hz(this, var2);
         }

         for(var2 = 128; var2 <= 191; ++var2) {
            this.a[var2] = new rm(this, var2);
         }

         var2 = 192;

         while(true) {
            if (var2 > 255) {
               break label108;
            }

            this.a[var2] = new hz(this, var2);
            ++var2;
         }
      case 21:
         for(var2 = 0; var2 <= 63; ++var2) {
            this.a[var2] = new ct(this, var2);
         }

         for(var2 = 64; var2 <= 125; ++var2) {
            this.a[var2] = new dy(this, var2);
         }

         for(var2 = 128; var2 <= 191; ++var2) {
            this.a[var2] = new ct(this, var2);
         }

         var2 = 192;

         while(true) {
            if (var2 > 255) {
               break label108;
            }

            this.a[var2] = new dy(this, var2);
            ++var2;
         }
      default:
         fv.a("WARNING: Unknown memory mode %d", this.l);
      }

      for(var2 = 0; var2 <= 255; ++var2) {
         if (this.a[var2] == null) {
            this.a[var2] = new aey(this, var2);
         }
      }

      for(var2 = 0; var2 <= 255; ++var2) {
         this.a[var2].a = this.a[var2 + 1 & 255];
      }

      for(var2 = 0; var2 < this.a.length; ++var2) {
         this.a[var2] = new wg(this, var2);
      }

      this.f();
   }

   public final void f() {
      super.f();
      this.g = 511;
      this.d(false);
      this.n = 0;
      this.o = 0;
      this.b = 0;
      this.j = false;
      this.p = 0;
      this.o = false;
      this.s();
      this.k = false;
      this.l = false;
      this.m = false;
      this.q = 511;
      this.r = 511;
      this.n = false;
      this.m = 0;
      wg[] var3;
      int var1 = (var3 = this.a).length;

      for(int var2 = 0; var2 < var1; ++var2) {
         var3[var2].a();
      }

   }

   private void d(boolean var1) {
      int var3 = var1 ? 6 : 8;

      for(int var2 = 128; var2 < 255; ++var2) {
         ((bv)this.a[var2]).a(var3);
      }

   }

   final int a(int var1) {
      try {
         return this.b[var1] & 255;
      } catch (Throwable var2) {
         return 0;
      }
   }

   final int b(int var1) {
      try {
         return this.b[var1] & 255;
      } catch (Throwable var2) {
         return -1;
      }
   }

   final int c(int var1) {
      try {
         return this.c[var1] & 255;
      } catch (Throwable var2) {
         return -1;
      }
   }

   protected final void g() {
      this.k += 6;
   }

   protected final void b(int var1) {
      this.k += var1 * 6;
   }

   public final void h() {
      int var2;
      if (this.k >= this.G) {
         if (this.k >= this.F) {
            this.k += 40;
            this.p();
         }

         if (this.k >= this.E) {
            this.k += 18;
            if (((var2 = this.o & ~this.b) & 1) != 0) {
               this.a[0].e();
            }

            if ((var2 & 2) != 0) {
               this.a[1].e();
            }

            if ((var2 & 4) != 0) {
               this.a[2].e();
            }

            if ((var2 & 8) != 0) {
               this.a[3].e();
            }

            if ((var2 & 16) != 0) {
               this.a[4].e();
            }

            if ((var2 & 32) != 0) {
               this.a[5].e();
            }

            if ((var2 & 64) != 0) {
               this.a[6].e();
            }

            if ((var2 & 128) != 0) {
               this.a[7].e();
            }

            if (this.a != null) {
               this.a.a("* Do HDMA");
            }

            this.l();
         }
      }

      if (this.n != 0) {
         var2 = this.n;
         if ((this.n & 1) != 0) {
            this.a[0].c();
         } else if ((var2 & 2) != 0) {
            this.a[1].c();
         } else if ((var2 & 4) != 0) {
            this.a[2].c();
         } else if ((var2 & 8) != 0) {
            this.a[3].c();
         } else if ((var2 & 16) != 0) {
            this.a[4].c();
         } else if ((var2 & 32) != 0) {
            this.a[5].c();
         } else if ((var2 & 64) != 0) {
            this.a[6].c();
         } else {
            if ((var2 & 128) != 0) {
               this.a[7].c();
            }

         }
      } else {
         if (this.k >= this.H) {
            if (this.k >= this.C) {
               this.n();
               if (this.j) {
                  this.h(this.i ? '\ufffa' : '￪');
                  if (this.a != null) {
                     this.a.a("* Do NMI");
                  }
               }

               this.j();
            }

            if (this.k >= this.B) {
               this.k = true;
               this.n();
               if (!this.d) {
                  this.h(this.i ? '\ufffe' : '￮');
                  if (this.a != null) {
                     this.a.a("* Do IRQ");
                  }
               }

               this.o();
            }

            if (this.k >= this.D) {
               us var1 = this;
               this.a.a(true);
               this.a.a(false);
               this.x = 0;
               this.y = 0;
               this.z = 0;
               this.A = 0;

               for(var2 = 16; var2-- != 0; var1.A |= 0 << var2) {
                  var1.x |= var1.a.a.a() << var2;
                  var1.y |= var1.a.b.a() << var2;
                  var1.z |= 0 << var2;
               }

               this.k();
            }
         }

         if (!this.n) {
            super.h();
         } else {
            this.g();
         }
      }
   }

   public final void c(int var1) {
      while(this.k < var1) {
         this.h();
      }

   }

   public final void d(int var1) {
      super.d(var1);
      this.b = 0;
      int var2 = this.o;
      if (this.o != 0) {
         this.k += 18;
         if ((var2 & 1) != 0) {
            this.a[0].d();
         }

         if ((var2 & 2) != 0) {
            this.a[1].d();
         }

         if ((var2 & 4) != 0) {
            this.a[2].d();
         }

         if ((var2 & 8) != 0) {
            this.a[3].d();
         }

         if ((var2 & 16) != 0) {
            this.a[4].d();
         }

         if ((var2 & 32) != 0) {
            this.a[5].d();
         }

         if ((var2 & 64) != 0) {
            this.a[6].d();
         }

         if ((var2 & 128) != 0) {
            this.a[7].d();
         }
      }

      this.l = false;
      this.m = false;
      this.s();
   }

   protected final void i() {
      this.n = true;
   }

   private void n() {
      if (this.n) {
         this.n = false;
         this.b(2);
      }

   }

   private void o() {
      int var1 = Integer.MAX_VALUE;
      switch(this.p) {
      case 0:
      default:
         break;
      case 1:
         if (this.q > 339) {
            var1 = Integer.MAX_VALUE;
         } else if ((var1 = this.k - this.k % 1364 + (this.q << 2)) < this.k) {
            var1 += 1364;
         }
         break;
      case 2:
         if ((var1 = this.r * 1364) < this.k) {
            var1 = Integer.MAX_VALUE;
         }
         break;
      case 3:
         if (this.q > 339) {
            var1 = Integer.MAX_VALUE;
         } else if ((var1 = this.r * 1364 + (this.q << 2)) < this.k) {
            var1 = Integer.MAX_VALUE;
         }
      }

      if (var1 < 60) {
         fv.a("WARNING: IRQ in first 60 clocks of frame");
      }

      this.B = var1;
      this.r();
   }

   final void j() {
      int var1 = this.a.l;
      if (this.k >= var1) {
         var1 = Integer.MAX_VALUE;
      }

      this.C = var1;
      this.r();
   }

   final void k() {
      int var1 = this.a.l + 1364 + 1364;
      if (!this.o || this.k >= var1) {
         var1 = Integer.MAX_VALUE;
      }

      this.D = var1;
      this.r();
   }

   final void l() {
      int var1 = Integer.MAX_VALUE;
      if ((this.o & ~this.b) != 0) {
         int var2 = this.k;
         if (this.k < this.a.l && (var1 = var2 - var2 % 1364 + 1024) < var2) {
            var1 += 1364;
         }
      }

      this.E = var1;
      this.q();
   }

   private void p() {
      this.F = (this.c() / 1364 + 1) * 1364;
      this.q();
   }

   private void q() {
      this.G = fv.a(this.F, this.E);
   }

   private void r() {
      this.H = fv.a(fv.a(this.C, this.B), this.D);
   }

   private void s() {
      this.o();
      this.j();
      this.k();
      this.l();
      this.p();
   }

   public final String a() {
      return "65C816 (Main CPU)";
   }

   final void a(int var1, int var2) {
      switch(var1) {
      case 16406:
         this.a.a((var2 & 1) != 0);
         return;
      case 16896:
         this.j = (var2 & 128) != 0;
         this.p = (var2 & 48) >> 4;
         this.o = (var2 & 1) != 0;
         this.j();
         this.o();
         this.k();
         if (this.a != null) {
            this.a.a(String.format("Interrupts: NMI %s, IRQ %s", this.j ? "on" : "off", this.p == 0 ? "off" : (this.p == 1 ? "on H" : (this.p == 2 ? "on V" : "on H/V"))));
         }

         return;
      case 16897:
         this.s = var2;
         xx var10000 = this.a;
         boolean var10001 = (var2 & 128) != 0;
         var2 = this.c();
         boolean var4 = var10001;
         xx var3 = var10000;
         var10000.a(var2);
         if (var3.d && !var4) {
            var3.b();
         }

         var3.d = var4;
         return;
      case 16898:
         this.t = var2;
         return;
      case 16899:
         this.u = this.t * var2 & '\uffff';
         return;
      case 16900:
         this.v = this.v & '\uff00' | var2;
         return;
      case 16901:
         this.v = var2 << 8 | this.v & 255;
         return;
      case 16902:
         var1 = this.v;
         if (var2 != 0) {
            this.w = var1 / var2 & '\uffff';
            this.u = var1 % var2 & '\uffff';
            return;
         }

         this.w = 65535;
         this.u = var1;
         return;
      case 16903:
         this.q = this.q & 256 | var2;
         this.o();
         return;
      case 16904:
         this.q = (var2 & 1) << 8 | this.q & 255;
         this.o();
         return;
      case 16905:
         this.r = this.r & 256 | var2;
         this.o();
         return;
      case 16906:
         this.r = (var2 & 1) << 8 | this.r & 255;
         this.o();
         return;
      case 16907:
         if (this.a != null) {
            this.a.a("DMA enable " + fv.a(var2));
         }

         this.n = var2;
         if (var2 != 0) {
            this.k += 18;

            for(var1 = 0; var1 < 8; ++var1) {
               if ((var2 & 1 << var1) != 0) {
                  this.a[var1].b();
               }
            }
         }

         return;
      case 16908:
         if (this.a != null) {
            this.a.a("HDMA enable " + fv.a(var2));
         }

         if (this.o != var2) {
            this.o = var2;
            this.l();
         }

         return;
      case 16909:
         this.d((var2 & 1) != 0);
         return;
      case 16913:
         this.k = false;
         return;
      default:
         if ((var1 & 'ﾀ') == 17152) {
            this.a[(var1 & 112) >> 4].a(var1 & 15, var2);
         }
      }
   }

   public final void a(int var1, vy var2, vy var3, vy var4, vy var5, vy var6, vy var7, vy var8) {
      this.f(var3.a());
      this.e(var3.a());
      int var9 = var3.b();
      this.c = (var9 & 1) != 0;
      this.b((var9 & 2) != 0);
      this.d = (var9 & 4) != 0;
      this.e = (var9 & 8) != 0;
      this.f = (var9 & 16) != 0;
      this.g = (var9 & 32) != 0;
      this.h = (var9 & 64) != 0;
      this.c((var9 & 128) != 0);
      this.i = (var9 & 256) != 0;
      this.m();
      this.c = var3.b();
      this.f = var3.b();
      this.g = var3.b();
      this.d = var3.b();
      this.e = var3.b();
      this.h = var3.b();
      var2.a(6 + (var1 < 4 ? 1 : 0));
      this.n = var2.a();
      if (this.n) {
         this.h = this.h + 1 & '\uffff';
      }

      var2.a(1);
      this.k = var2.c();
      var2.a(4);
      this.k += var2.c() * 1364;
      var8.a(571 + (var1 >= 3 ? 1 : 0) + 1408 + 1 + 2 + 1 + 2 + 2 + 2 + 2 + 2 + 1 + 1 + 1 + 12 + (var1 >= 2 ? 4 : 0) + (var1 < 2 ? 3 : 0) + 1 + 3 + 2 + 2);
      this.m = var8.c();
      int[] var18;
      int var20 = (var18 = new int[]{16896, 16898, 16899, 16900, 16901, 16902, 16903, 16904, 16905, 16906}).length;

      int var21;
      for(var21 = 0; var21 < var20; ++var21) {
         var9 = var18[var21];
         this.a(var9, var7.a(var9));
      }

      this.w = var7.a(16916) | var7.a(16917) << 8;
      this.u = var7.a(16918) | var7.a(16919) << 8;
      wg[] var19 = this.a;
      var20 = this.a.length;

      for(var21 = 0; var21 < var20; ++var21) {
         wg var22 = var19[var21];
         int[] var10 = new int[12];
         boolean var11 = var4.a();
         boolean var12 = var4.a();
         boolean var13 = var4.a();
         int var14 = var4.a();
         var10[4] = var4.a();
         var10[3] = var4.a();
         var10[2] = var4.a();
         var10[9] = var4.a();
         var10[8] = var4.a();
         var10[1] = var4.a();
         if (var1 < 2) {
            var4.a(2);
         }

         boolean var15 = var4.a();
         var10[6] = var4.a();
         var10[5] = var4.a();
         var10[7] = var4.a();
         var10[10] = (var4.a() ? 128 : 0) | var4.a() & 127;
         boolean var16 = var4.a();
         var10[11] = var1 >= 2 ? var4.a() : 255;
         boolean var17 = var1 >= 2 ? var4.a() : false;
         var10[0] = (var11 ? 128 : 0) | (var15 ? 64 : 0) | (var17 ? 32 : 0) | (var13 ? 16 : 0) | (var12 ? 8 : 0) | var14 & 7;

         for(int var23 = 0; var23 < var10.length; ++var23) {
            var22.a(var23, var10[var23]);
         }

         var22.a = var16;
      }

      this.n = 0;
      this.o = var7.a(16908);
      this.k = false;
      this.m = false;
      this.l = (var7.a(16912) & 128) != 0;
      var5.a(this.a);
      var6.a(this.c);
      this.s();
   }

   // $FF: synthetic method
   static int a(us var0, int var1) {
      int var2;
      if (var1 <= 8511) {
         xx var10000 = var0.a;
         var2 = var0.c();
         xx var3 = var10000;
         switch(var1) {
         case 8452:
         case 8453:
         case 8454:
         case 8456:
         case 8457:
         case 8458:
         case 8468:
         case 8469:
         case 8470:
         case 8472:
         case 8473:
         case 8474:
         case 8484:
         case 8485:
         case 8486:
         case 8488:
         case 8489:
         case 8490:
            return var3.g;
         case 8500:
            var1 = (short)var3.n * (byte)(var3.o >> 8);
            return var3.g = var1 & 255;
         case 8501:
            var1 = (short)var3.n * (byte)(var3.o >> 8);
            return var3.g = var1 >> 8 & 255;
         case 8502:
            var1 = (short)var3.n * (byte)(var3.o >> 8);
            return var3.g = var1 >> 16 & 255;
         case 8503:
            var3.a(var2);
            var3.b();
         case 8455:
         case 8459:
         case 8460:
         case 8461:
         case 8462:
         case 8463:
         case 8464:
         case 8465:
         case 8466:
         case 8467:
         case 8471:
         case 8475:
         case 8476:
         case 8477:
         case 8478:
         case 8479:
         case 8480:
         case 8481:
         case 8482:
         case 8483:
         case 8487:
         case 8491:
         case 8492:
         case 8493:
         case 8494:
         case 8495:
         case 8496:
         case 8497:
         case 8498:
         case 8499:
         default:
            return 0;
         case 8504:
            var1 = var3.c(var3.e);
            var3.e = (var3.e + 1) % 544;
            return var3.g = var1;
         case 8505:
            var1 = var3.d & 255;
            if (var3.b == 0) {
               var3.c();
               var3.a = var3.a + var3.c & 32767;
            }

            return var3.g = var1;
         case 8506:
            var1 = var3.d >> 8;
            if (var3.b == 1) {
               var3.c();
               var3.a = var3.a + var3.c & 32767;
            }

            return var3.g = var1;
         case 8507:
            short var4 = var3.b[var3.f >> 1];
            if ((var3.f & 1) == 0) {
               var1 = var4 & 255;
            } else {
               var1 = var4 >> 8 & 127 | var3.h & 128;
            }

            var3.f = var3.f + 1 & 511;
            return var3.h = var1;
         case 8508:
            if (var3.a.a() != null) {
               var3.a.a().a("PPU: Read HCT " + var3.i);
            }

            if (!var3.a) {
               var1 = var3.i & 255;
            } else {
               var1 = var3.i >> 8 | var3.h & 254;
            }

            var3.a = !var3.a;
            return var3.h = var1;
         case 8509:
            if (var3.a.a() != null) {
               var3.a.a().a("PPU: Read VCT " + var3.j);
            }

            if (!var3.b) {
               var1 = var3.j & 255;
            } else {
               var1 = var3.j >> 8 | var3.h & 254;
            }

            var3.b = !var3.b;
            return var3.h = var1;
         case 8510:
            var3.a(var2);
            return var3.g = (var3.a.e ? 128 : 0) | (var3.a.f ? 64 : 0) | var3.g & 16 | 1;
         case 8511:
            var1 = (var3.g ? 128 : 0) | (var3.c ? 64 : 0) | var3.h & 32 | (var3.e ? 16 : 0) | 3;
            var3.a = false;
            var3.b = false;
            if (var3.d) {
               var3.c = false;
            }

            return var3.h = var1;
         }
      } else if (var1 <= 8575) {
         return var0.a.a(var1 & 3, var0.c());
      } else if (var1 == 8576) {
         var1 = var0.m;
         var2 = var0.a[var1] & 255;
         var0.m = var1 + 1 & 131071;
         return var2;
      } else {
         return 255;
      }
   }

   // $FF: synthetic method
   static int b(us var0, int var1) {
      switch(var1) {
      case 16406:
         return var0.a.a.a();
      case 16407:
         return var0.a.b.a() | 28;
      case 16912:
         if (!var0.m && var0.c() >= var0.a.l) {
            var0.l = true;
            var0.m = true;
         }

         var1 = (var0.l ? 128 : 0) | 2;
         var0.l = false;
         return var1;
      case 16913:
         var1 = var0.k ? 128 : 0;
         var0.k = false;
         return var1;
      case 16914:
         var1 = var0.c() - var0.a.l;
         return (var0.a.a(var0.c()) ? 128 : 0) | (var0.c() % 1364 >= 1024 ? 64 : 0) | (var1 >= 0 && var1 <= 4092 ? 1 : 0);
      case 16915:
         return 192 | var0.s & 63;
      case 16916:
         return var0.w & 255;
      case 16917:
         return var0.w >> 8;
      case 16918:
         return var0.u & 255;
      case 16919:
         return var0.u >> 8;
      case 16920:
         return var0.x & 255;
      case 16921:
         return var0.x >> 8;
      case 16922:
         return var0.y & 255;
      case 16923:
         return var0.y >> 8;
      case 16924:
         return var0.z & 255;
      case 16925:
         return var0.z >> 8;
      case 16926:
         return var0.A & 255;
      case 16927:
         return var0.A >> 8;
      default:
         if ((var1 & 'ﾀ') == 17152) {
            wg var10000 = var0.a[(var1 & 112) >> 4];
            var1 &= 15;
            wg var2 = var10000;
            switch(var1) {
            case 0:
               return var2.g;
            case 1:
               return var2.b;
            case 2:
               return var2.a & 255;
            case 3:
               return var2.a >> 8 & 255;
            case 4:
               return var2.a.c;
            case 5:
               return var2.c & 255;
            case 6:
               return var2.c >> 8 & 255;
            case 7:
               return var2.b.c;
            case 8:
               return var2.d & 255;
            case 9:
               return var2.d >> 8 & 255;
            case 10:
               return var2.e;
            case 11:
            case 15:
               return var2.f;
            case 12:
            case 13:
            case 14:
            default:
               return 0;
            }
         } else {
            return 0;
         }
      }
   }

   // $FF: synthetic method
   static void a(us var0, int var1, int var2) {
      if (var1 <= 8511) {
         var0.a.a(var1, var2, var0.c());
      } else if (var1 <= 8575) {
         var0.a.a(var1 & 3, var2, var0.c());
      } else {
         if (var1 <= 8579) {
            int var3 = var0.m;
            switch(var1) {
            case 8576:
               var0.a[var3] = (byte)var2;
               var3 = var3 + 1 & 131071;
               break;
            case 8577:
               var3 = var3 & 130816 | var2;
               break;
            case 8578:
               var3 = var3 & 65791 | var2 << 8;
               break;
            case 8579:
               var3 = var3 & '\uffff' | (var2 & 1) << 16;
            }

            var0.m = var3;
         }

      }
   }

   // $FF: synthetic method
   static int c(us var0, int var1) {
      return var0.c.length == 0 ? 0 : var0.c[var1 & var0.c.length - 1] & 255;
   }

   // $FF: synthetic method
   static void b(us var0, int var1, int var2) {
      if (var0.c.length != 0) {
         var0.c[var1 & var0.c.length - 1] = (byte)var2;
      }

   }

   // $FF: synthetic method
   static int d(us var0, int var1) {
      return var0.n &= var1;
   }
}
