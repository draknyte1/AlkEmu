package jsnes;

final class abv extends afc {
   // $FF: synthetic field
   private adv a;

   private abv(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 11;
   }

   public final void a() {
      int var1 = adv.t(this.a);
      this.a.f(adv.u(this.a));
      this.a.g(var1);
   }

   // $FF: synthetic method
   abv(adv var1) {
      this(var1, (byte)0);
   }
}
