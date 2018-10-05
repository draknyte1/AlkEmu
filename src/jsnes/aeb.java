package jsnes;

final class aeb extends afc {
   // $FF: synthetic field
   private adv a;

   private aeb(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 18;
   }

   public final void a() {
      adv.a(this.a, adv.f(this.a));
   }

   // $FF: synthetic method
   aeb(adv var1) {
      this(var1, (byte)0);
   }
}
