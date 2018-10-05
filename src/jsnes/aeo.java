package jsnes;

final class aeo extends afc {
   // $FF: synthetic field
   private adv a;

   private aeo(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      adv.s(this.a, 0);
   }

   // $FF: synthetic method
   aeo(adv var1) {
      this(var1, (byte)0);
   }
}
