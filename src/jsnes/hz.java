package jsnes;

final class hz extends bv {
   private final int d;
   // $FF: synthetic field
   private us a;

   public hz(us var1, int var2) {
      this.a = var1;
      super(var2, ((var2 & 127) << 15) - '耀');
      if (var2 >= 112 && var2 <= 125) {
         this.d = (var2 & 15) << 15;
      } else {
         this.d = -1;
      }
   }

   public final int a(int var1) {
      if (var1 >= 32768) {
         return this.a.b(this.a + var1);
      } else {
         return this.d != -1 ? this.a.c(this.d + var1) : -1;
      }
   }

   public final int b(int var1) {
      this.a.k += this.b;
      if (var1 >= 32768) {
         return this.a.a(this.a + var1);
      } else {
         return this.d != -1 ? us.c(this.a, this.d + var1) : 0;
      }
   }

   public final void a(int var1, int var2) {
      this.a.k += this.b;
      if (var1 <= 32767 && this.d != -1) {
         us.b(this.a, this.d + var1, var2);
      }

   }
}
