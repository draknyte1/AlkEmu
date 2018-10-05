package jsnes;

final class aev extends afc {
   // $FF: synthetic field
   private adv a;

   private aev(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 14;
   }

   public final void a() {
      int var1 = adv.r(this.a);
      int var2 = adv.n(this.a, adv.l(this.a, var1));
      this.a.g();
      adv.h(this.a, var1, var2);
   }

   // $FF: synthetic method
   aev(adv var1) {
      this(var1, (byte)0);
   }
}
