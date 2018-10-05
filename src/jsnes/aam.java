package jsnes;

final class aam extends afc {
   // $FF: synthetic field
   private adv a;

   private aam(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 6;
   }

   public final void a() {
      adv.A(this.a, adv.F(this.a));
   }

   // $FF: synthetic method
   aam(adv var1) {
      this(var1, (byte)0);
   }
}
