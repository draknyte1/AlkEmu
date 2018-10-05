package jsnes;

final class wn extends afc {
   // $FF: synthetic field
   private adv a;

   private wn(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 17;
   }

   public final void a() {
      adv.G(this.a, adv.G(this.a));
   }

   // $FF: synthetic method
   wn(adv var1) {
      this(var1, (byte)0);
   }
}
