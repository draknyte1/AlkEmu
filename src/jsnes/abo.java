package jsnes;

final class abo extends afc {
   // $FF: synthetic field
   private adv a;

   private abo(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 17;
   }

   public final void a() {
      adv.a(this.a, adv.e(this.a));
   }

   // $FF: synthetic method
   abo(adv var1) {
      this(var1, (byte)0);
   }
}
