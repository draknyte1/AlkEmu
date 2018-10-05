package jsnes;

final class pn extends afc {
   // $FF: synthetic field
   private adv a;

   private pn(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 7;
   }

   public final void a() {
      adv.D(this.a, adv.L(this.a));
   }

   // $FF: synthetic method
   pn(adv var1) {
      this(var1, (byte)0);
   }
}
