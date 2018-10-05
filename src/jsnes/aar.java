package jsnes;

final class aar extends afc {
   // $FF: synthetic field
   private adv a;

   private aar(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 21;
   }

   public final void a() {
      adv.a(this.a, !this.a.a());
   }

   // $FF: synthetic method
   aar(adv var1) {
      this(var1, (byte)0);
   }
}
