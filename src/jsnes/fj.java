package jsnes;

final class fj extends afg {
   // $FF: synthetic field
   private kt a;

   private fj(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 2;
   }

   public final void a() {
      int var1 = kt.a(this.a);
      if (kt.e(this.a) || var1 > 153) {
         var1 += 96;
         kt.e(this.a, true);
      }

      if (kt.c(this.a) || (var1 & 15) > 9) {
         var1 += 6;
      }

      var1 &= 255;
      kt.a(this.a, var1);
      kt.c(this.a, var1);
      kt.a(this.a, 3);
   }

   // $FF: synthetic method
   fj(kt var1) {
      this(var1, (byte)0);
   }
}
