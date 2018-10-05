package jsnes;

final class aca extends afc {
   // $FF: synthetic field
   private adv a;

   private aca(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 14;
   }

   public final void a() {
      adv.e(this.a, adv.n(this.a));
   }

   // $FF: synthetic method
   aca(adv var1) {
      this(var1, (byte)0);
   }
}
