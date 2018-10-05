package jsnes;

final class ev extends afc {
   // $FF: synthetic field
   private adv a;

   private ev(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 20;
   }

   public final void a() {
      adv.G(this.a, adv.M(this.a));
   }

   // $FF: synthetic method
   ev(adv var1) {
      this(var1, (byte)0);
   }
}
