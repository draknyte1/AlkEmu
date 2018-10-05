package jsnes;

final class vu extends afc {
   // $FF: synthetic field
   private adv a;

   private vu(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = -1;
   }

   public final void a() {
      adv.C(this.a, adv.N(this.a));
   }

   // $FF: synthetic method
   vu(adv var1) {
      this(var1, (byte)0);
   }
}
