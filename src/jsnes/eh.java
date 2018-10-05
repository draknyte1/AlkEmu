package jsnes;

final class eh extends afg {
   // $FF: synthetic field
   private kt a;

   private eh(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 13;
   }

   public final void a() {
      int var1 = kt.u(this.a);
      int var2 = 1 << (var1 >> 13);
      var1 &= 8191;
      kt.a(this.a, var1, kt.g(this.a, var1) ^ var2);
      kt.a(this.a, 5);
   }

   // $FF: synthetic method
   eh(kt var1) {
      this(var1, (byte)0);
   }
}
