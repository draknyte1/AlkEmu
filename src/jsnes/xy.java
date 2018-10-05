package jsnes;

final class xy extends afc {
   // $FF: synthetic field
   private adv a;

   private xy(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = -1;
   }

   public final void a() {
      adv.D(this.a, adv.N(this.a));
   }

   // $FF: synthetic method
   xy(adv var1) {
      this(var1, (byte)0);
   }
}
