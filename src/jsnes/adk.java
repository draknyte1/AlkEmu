package jsnes;

final class adk extends afc {
   // $FF: synthetic field
   private adv a;

   private adk(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 6;
   }

   public final void a() {
      adv.D(this.a, adv.F(this.a));
   }

   // $FF: synthetic method
   adk(adv var1) {
      this(var1, (byte)0);
   }
}
