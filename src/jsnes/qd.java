package jsnes;

abstract class qd extends bv {
   // $FF: synthetic field
   private us a;

   public qd(us var1, int var2, int var3) {
      this.a = var1;
      super(var2, var3);
   }

   public final int a(int var1) {
      if (var1 <= 8191) {
         return this.a.a[var1] & 255;
      } else if (var1 <= 24575) {
         return -2;
      } else {
         return var1 <= 32767 ? this.a_(var1) : this.a.b(this.a + var1);
      }
   }

   public final int b(int var1) {
      if (var1 >= 32768) {
         this.a.k += this.b;
         return this.a.a(this.a + var1);
      } else if (var1 <= 8191) {
         this.a.k += 8;
         return this.a.a[var1] & 255;
      } else if (var1 <= 16383) {
         this.a.k += 6;
         return us.a(this.a, var1);
      } else if (var1 <= 16895) {
         this.a.k += 12;
         return us.b(this.a, var1);
      } else if (var1 <= 24575) {
         this.a.k += 6;
         return us.b(this.a, var1);
      } else {
         this.a.k += 8;
         return this.b_(var1);
      }
   }

   public final void a(int var1, int var2) {
      if (var1 <= 8191) {
         this.a.k += 8;
         this.a.a[var1] = (byte)var2;
      } else if (var1 <= 16383) {
         this.a.k += 6;
         us.a(this.a, var1, var2);
      } else if (var1 <= 16895) {
         this.a.k += 12;
         this.a.a(var1, var2);
      } else if (var1 <= 24575) {
         this.a.k += 6;
         this.a.a(var1, var2);
      } else if (var1 <= 32767) {
         this.a_(var1, var2);
         this.a.k += 8;
      } else {
         this.a.k += this.b;
      }
   }

   protected int b_(int var1) {
      return 0;
   }

   protected int a_(int var1) {
      return -1;
   }

   protected void a_(int var1, int var2) {
   }
}
