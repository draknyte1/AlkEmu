package jsnes;

final class acd extends afc {
   // $FF: synthetic field
   private adv a;

   private acd(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 16;
   }

   public final void a() {
      adv.e(this.a, adv.h(this.a));
   }

   // $FF: synthetic method
   acd(adv var1) {
      this(var1, (byte)0);
   }
}
