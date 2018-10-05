package jsnes;

final class adi extends afc {
   // $FF: synthetic field
   private adv a;

   private adi(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 6;
   }

   public final void a() {
      adv.a(this.a, adv.d(this.a));
   }

   // $FF: synthetic method
   adi(adv var1) {
      this(var1, (byte)0);
   }
}
