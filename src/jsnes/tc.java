package jsnes;

final class tc extends afc {
   // $FF: synthetic field
   private adv a;

   private tc(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      adv.b(this.a, adv.b(this.a));
   }

   // $FF: synthetic method
   tc(adv var1) {
      this(var1, (byte)0);
   }
}
