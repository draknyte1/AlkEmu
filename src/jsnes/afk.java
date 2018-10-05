package jsnes;

final class afk extends afc {
   // $FF: synthetic field
   private adv a;

   private afk(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 7;
   }

   public final void a() {
      adv.E(this.a, adv.L(this.a));
   }

   // $FF: synthetic method
   afk(adv var1) {
      this(var1, (byte)0);
   }
}
