package jsnes;

final class av extends afc {
   // $FF: synthetic field
   private adv a;

   private av(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 6;
   }

   public final void a() {
      int var1 = adv.p(this.a);
      int var2 = adv.i(this.a, var1) + 1 & 255;
      this.a.i(var2);
      this.a.g();
      adv.f(this.a, var1, var2);
   }

   // $FF: synthetic method
   av(adv var1) {
      this(var1, (byte)0);
   }
}
