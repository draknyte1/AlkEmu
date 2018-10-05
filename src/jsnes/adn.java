package jsnes;

final class adn extends afc {
   // $FF: synthetic field
   private adv a;

   private adn(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 20;
   }

   public final void a() {
      adv.C(this.a, adv.M(this.a));
   }

   // $FF: synthetic method
   adn(adv var1) {
      this(var1, (byte)0);
   }
}
