package jsnes;

final class acs extends afc {
   // $FF: synthetic field
   private adv a;

   private acs(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      adv.B(this.a, adv.D(this.a));
   }

   // $FF: synthetic method
   acs(adv var1) {
      this(var1, (byte)0);
   }
}
