package jsnes;

final class ok extends afg {
   // $FF: synthetic field
   private kt a;

   private ok(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 20;
      this.b = 21;
   }

   public final void a() {
      int var1 = kt.p(this.a);
      int var2 = kt.q(this.a);
      var1 &= kt.g(this.a, var2);
      kt.a(this.a, var2, var1);
      kt.c(this.a, var1);
      kt.a(this.a, 5);
   }

   // $FF: synthetic method
   ok(kt var1) {
      this(var1, (byte)0);
   }
}
