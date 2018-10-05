package jsnes;

final class im extends afg {
   // $FF: synthetic field
   private kt a;

   private im(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 7;
      this.b = 13;
   }

   public final void a() {
      int var1 = kt.u(this.a);
      int var2 = 1 << (var1 >> 13);
      var1 &= 8191;
      if ((kt.g(this.a, var1) & var2) != 0) {
         kt.e(this.a, true);
      }

      kt.a(this.a, 5);
   }

   // $FF: synthetic method
   im(kt var1) {
      this(var1, (byte)0);
   }
}
