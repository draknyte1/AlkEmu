package jsnes;

final class hl extends afc {
   // $FF: synthetic field
   private adv a;

   private hl(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 13;
   }

   public final void a() {
      int var1 = adv.q(this.a);
      int var2 = adv.k(this.a, var1) + 1 & 255;
      this.a.i(var2);
      this.a.g();
      adv.g(this.a, var1, var2);
   }

   // $FF: synthetic method
   hl(adv var1) {
      this(var1, (byte)0);
   }
}
