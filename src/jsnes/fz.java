package jsnes;

final class fz extends afg {
   // $FF: synthetic field
   private kt a;

   private fz(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 13;
      this.b = 7;
   }

   public final void a() {
      int var1 = kt.u(this.a);
      int var2 = 1 << (var1 >> 13);
      var1 &= 8191;
      var2 = kt.g(this.a, var1) & ~var2 | (kt.e(this.a) ? var2 : 0);
      kt.a(this.a, var1, var2);
      kt.a(this.a, 6);
   }

   // $FF: synthetic method
   fz(kt var1) {
      this(var1, (byte)0);
   }
}
