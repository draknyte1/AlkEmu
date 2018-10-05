package jsnes;

final class sh extends afc {
   // $FF: synthetic field
   private adv a;

   private sh(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 12;
   }

   public final void a() {
      adv.i(this.a, adv.i(this.a));
   }

   // $FF: synthetic method
   sh(adv var1) {
      this(var1, (byte)0);
   }
}
