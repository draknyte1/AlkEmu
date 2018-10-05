package jsnes;

final class adc extends afc {
   // $FF: synthetic field
   private adv a;

   private adc(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 25;
   }

   public final void a() {
      adv.E(this.a, adv.C(this.a));
   }

   // $FF: synthetic method
   adc(adv var1) {
      this(var1, (byte)0);
   }
}
