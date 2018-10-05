package jsnes;

final class wg {
   private final int h;
   jw a;
   jw b;
   int a;
   int b;
   private int i;
   private int j;
   int c;
   int d;
   int e;
   int f;
   int g;
   private int k;
   private boolean b;
   private boolean c;
   boolean a;
   private int l;
   // $FF: synthetic field
   private us a;

   public wg(us var1, int var2) {
      this.a = var1;
      super();
      this.h = var2;
      this.a();
   }

   public final void a() {
      for(int var1 = 0; var1 < 16; ++var1) {
         this.a(var1, 255);
      }

      this.a = false;
   }

   public final void a(int var1, int var2) {
      switch(var1) {
      case 0:
         this.b = (var2 & 128) != 0;
         this.c = (var2 & 64) != 0;
         this.i = (var2 & 8) != 0 ? 0 : ((var2 & 16) != 0 ? -1 : 1);
         this.j = var2 & 7;
         switch(this.j) {
         case 0:
            this.k = 1;
            break;
         case 1:
         case 2:
         case 6:
            this.k = 2;
            break;
         case 3:
         case 4:
         case 5:
         default:
            this.k = 4;
         }

         this.g = var2;
         return;
      case 1:
         this.b = var2;
         return;
      case 2:
         this.a = this.a & '\uff00' | var2;
         return;
      case 3:
         this.a = var2 << 8 | this.a & 255;
         return;
      case 4:
         this.a = this.a.a[var2];
         return;
      case 5:
         this.c = this.c & '\uff00' | var2;
         return;
      case 6:
         this.c = var2 << 8 | this.c & 255;
         return;
      case 7:
         this.b = this.a.a[var2];
         return;
      case 8:
         this.d = this.d & '\uff00' | var2;
         return;
      case 9:
         this.d = var2 << 8 | this.d & 255;
         return;
      case 10:
         this.e = var2;
         return;
      case 11:
      case 15:
         this.f = var2;
      case 12:
      case 13:
      case 14:
      default:
      }
   }

   public final void b() {
      this.a.k += 8;
   }

   public final void c() {
      int var1 = this.a.k;
      this.l = 0;
      int var2 = this.k;

      while(var2-- != 0) {
         int var3 = this.a();
         int var4;
         if (!this.b) {
            var4 = this.a.b(this.a);
            us.a(this.a, var3, var4);
         } else {
            var4 = us.a(this.a, var3);
            this.a.a(this.a, var4);
         }

         this.a = this.a + this.i & '\uffff';
         var1 += 8;
         this.c = this.c - 1 & '\uffff';
         if (this.c == 0) {
            us.d(this.a, ~(1 << this.h));
            break;
         }
      }

      this.a.k = var1;
   }

   public final void d() {
      this.d = this.a;
      this.f();
   }

   private void f() {
      int var1 = this.d;
      int var2 = this.a.k;
      this.e = this.a.b(var1);
      var1 = var1 + 1 & '\uffff';
      var2 += 8;
      if (this.c) {
         this.c = this.a.d(var1);
         var1 = var1 + 2 & '\uffff';
         var2 += 16;
      }

      this.d = var1;
      this.a.k = var2;
      if (this.e == 0) {
         var2 = 1 << this.h;
         this.a.b |= var2;
      }

      this.a = true;
   }

   public final void e() {
      int var1 = this.a.k;
      us.d(this.a, ~(1 << this.h));
      if (this.a) {
         jw var2;
         int var3;
         if (!this.c) {
            var2 = this.a;
            var3 = this.d;
         } else {
            var2 = this.b;
            var3 = this.c;
         }

         this.l = 0;

         for(int var4 = this.k; var4-- != 0; var1 += 8) {
            int var5 = this.a();
            int var6;
            if (!this.b) {
               var6 = var2.b(var3);
               us.a(this.a, var5, var6);
            } else {
               var6 = us.a(this.a, var5);
               var2.a(var3, var6);
            }

            var3 = var3 + 1 & '\uffff';
         }

         if (!this.c) {
            this.d = var3;
         } else {
            this.c = var3;
         }
      }

      this.e = this.e - 1 & 255;
      this.a = (this.e & 128) != 0;
      if ((this.e & 127) == 0) {
         this.a.k = var1;
         this.f();
      } else {
         var1 += 8;
         this.a.k = var1;
      }
   }

   private int a() {
      int var10001 = this.b;
      int var10002;
      switch(this.j) {
      case 0:
         var10002 = 0;
         break;
      case 1:
      case 5:
         var10002 = this.l++ & 1;
         break;
      case 2:
      case 6:
      default:
         var10002 = 0;
         break;
      case 3:
      case 7:
         var10002 = this.l++ >> 1 & 1;
         break;
      case 4:
         var10002 = this.l++ & 3;
      }

      return 8448 | var10001 + var10002 & 255;
   }

   public final String toString() {
      return String.format("DMA channel %d: %02X:%04X %s 21%02X; count %d; inc %d; transfer mode %d; addressing %s;", this.h, this.a.c, this.a, this.b ? "from" : "to", this.b, this.c, this.i, this.j, this.c ? "indirect" : "absolute");
   }
}
