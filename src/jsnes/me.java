package jsnes;

final class me extends afg {
   // $FF: synthetic field
   private kt a;

   private me(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 15;
   }

   public final void a() {
      int var1 = kt.r(this.a);
      int var2 = kt.g(this.a, var1) - 1 & 255;
      kt.a(this.a, var1, var2);
      kt.c(this.a, var2);
      kt.a(this.a, 4);
   }

   // $FF: synthetic method
   me(kt var1) {
      this(var1, (byte)0);
   }
}
