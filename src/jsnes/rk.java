package jsnes;

final class rk extends afc {
   // $FF: synthetic field
   private adv a;

   private rk(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 13;
   }

   public final void a() {
      int var1 = adv.q(this.a);
      int var2 = adv.b(this.a, adv.c(this.a, var1));
      this.a.g();
      adv.b(this.a, var1, var2);
   }

   // $FF: synthetic method
   rk(adv var1) {
      this(var1, (byte)0);
   }
}
