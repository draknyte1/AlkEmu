package jsnes;

final class va extends afc {
   // $FF: synthetic field
   private adv a;

   private va(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 13;
   }

   public final void a() {
      int var1 = adv.q(this.a);
      int var2 = adv.p(this.a, adv.k(this.a, var1));
      this.a.g();
      adv.g(this.a, var1, var2);
   }

   // $FF: synthetic method
   va(adv var1) {
      this(var1, (byte)0);
   }
}
