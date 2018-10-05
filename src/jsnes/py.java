package jsnes;

final class py extends afg {
   // $FF: synthetic field
   private kt a;

   private py(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 9;
   }

   public final void a() {
      int var1 = kt.w(this.a);
      int var2 = kt.g(this.a, var1);
      kt.c(this.a, kt.a(this.a) - var2 & 255);
      var2 &= ~kt.a(this.a);
      kt.a(this.a, var1, var2);
      kt.a(this.a, 6);
   }

   // $FF: synthetic method
   py(kt var1) {
      this(var1, (byte)0);
   }
}
