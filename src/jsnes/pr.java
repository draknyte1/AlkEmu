package jsnes;

final class pr extends afg {
   // $FF: synthetic field
   private kt a;

   private pr(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 15;
      this.b = 15;
   }

   public final void a() {
      int var1 = kt.h(this.a);
      int var2 = kt.r(this.a);
      var1 ^= kt.g(this.a, var2);
      kt.a(this.a, var2, var1);
      kt.c(this.a, var1);
      kt.a(this.a, 6);
   }

   // $FF: synthetic method
   pr(kt var1) {
      this(var1, (byte)0);
   }
}
