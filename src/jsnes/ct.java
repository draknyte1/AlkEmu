package jsnes;

final class ct extends qd {
   private final int d;
   // $FF: synthetic field
   private us a;

   public ct(us var1, int var2) {
      this.a = var1;
      super(var1, var2, (var2 & 127) << 16);
      if ((var2 & 127) >= 48 && (var2 & 127) <= 63) {
         this.d = ((var2 & 15) << 13) - 24576;
      } else {
         this.d = -1;
      }
   }

   protected final int a_(int var1) {
      return this.d != -1 ? this.a.c(this.d + var1) : super.a_(var1);
   }

   protected final int b_(int var1) {
      return this.d != -1 ? us.c(this.a, this.d + var1) : super.b_(var1);
   }

   protected final void a_(int var1, int var2) {
      if (this.d != -1) {
         us.b(this.a, this.d + var1, var2);
      } else {
         super.a_(var1, var2);
      }
   }
}
