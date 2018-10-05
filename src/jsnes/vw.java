package jsnes;

final class vw extends afc {
   // $FF: synthetic field
   private adv a;

   private vw(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 12;
   }

   public final void a() {
      adv.C(this.a, adv.K(this.a));
   }

   // $FF: synthetic method
   vw(adv var1) {
      this(var1, (byte)0);
   }
}
