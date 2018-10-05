package jsnes;

final class aed extends afc {
   // $FF: synthetic field
   private adv a;

   private aed(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 16;
   }

   public final void a() {
      adv.D(this.a, adv.J(this.a));
   }

   // $FF: synthetic method
   aed(adv var1) {
      this(var1, (byte)0);
   }
}
