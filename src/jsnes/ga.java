package jsnes;

final class ga extends afc {
   // $FF: synthetic field
   private adv a;

   private ga(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 13;
   }

   public final void a() {
      int var1 = adv.q(this.a);
      int var2 = adv.o(this.a, adv.k(this.a, var1));
      this.a.g();
      adv.g(this.a, var1, var2);
   }

   // $FF: synthetic method
   ga(adv var1) {
      this(var1, (byte)0);
   }
}
