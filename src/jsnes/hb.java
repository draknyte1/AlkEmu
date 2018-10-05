package jsnes;

final class hb extends afg {
   // $FF: synthetic field
   private kt a;

   private hb(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 15;
      this.b = 8;
   }

   public final void a() {
      int var1 = kt.o(this.a);
      int var2 = kt.r(this.a);
      var1 |= kt.g(this.a, var2);
      kt.a(this.a, var2, var1);
      kt.c(this.a, var1);
      kt.a(this.a, 5);
   }

   // $FF: synthetic method
   hb(kt var1) {
      this(var1, (byte)0);
   }
}
