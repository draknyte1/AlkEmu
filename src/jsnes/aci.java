package jsnes;

final class aci extends afc {
   // $FF: synthetic field
   private adv a;

   private aci(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 11;
   }

   public final void a() {
      adv.E(this.a, adv.E(this.a));
   }

   // $FF: synthetic method
   aci(adv var1) {
      this(var1, (byte)0);
   }
}
