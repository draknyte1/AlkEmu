package jsnes;

final class vx extends afc {
   // $FF: synthetic field
   private adv a;

   private vx(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 12;
   }

   public final void a() {
      adv.G(this.a, adv.K(this.a));
   }

   // $FF: synthetic method
   vx(adv var1) {
      this(var1, (byte)0);
   }
}
