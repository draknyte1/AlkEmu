package jsnes;

final class tm extends afc {
   // $FF: synthetic field
   private adv a;

   private tm(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 6;
   }

   public final void a() {
      adv.G(this.a, adv.F(this.a));
   }

   // $FF: synthetic method
   tm(adv var1) {
      this(var1, (byte)0);
   }
}
