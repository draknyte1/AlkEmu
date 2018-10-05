package jsnes;

final class aaz extends afc {
   // $FF: synthetic field
   private adv a;

   private aaz(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      int var1 = adv.s(this.a);
      int var2 = adv.h(this.a, adv.e(this.a, var1));
      this.a.g();
      adv.d(this.a, var1, var2);
   }

   // $FF: synthetic method
   aaz(adv var1) {
      this(var1, (byte)0);
   }
}
