package jsnes;

final class lo extends afg {
   // $FF: synthetic field
   private kt a;

   private lo(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 15;
      this.b = 15;
   }

   public final void a() {
      int var1 = kt.h(this.a);
      int var2 = kt.r(this.a);
      int var3 = kt.g(this.a, var2);
      var3 = kt.a(this.a, var3, var1);
      kt.a(this.a, var2, var3);
      kt.a(this.a, 6);
   }

   // $FF: synthetic method
   lo(kt var1) {
      this(var1, (byte)0);
   }
}
