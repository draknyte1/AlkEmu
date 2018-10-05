package jsnes;

final class ua extends afc {
   // $FF: synthetic field
   private adv a;

   private ua(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 13;
   }

   public final void a() {
      int var1 = adv.q(this.a);
      int var2 = adv.f(this.a, adv.c(this.a, var1));
      this.a.g();
      adv.b(this.a, var1, var2);
   }

   // $FF: synthetic method
   ua(adv var1) {
      this(var1, (byte)0);
   }
}
