package jsnes;

final class adf extends afc {
   // $FF: synthetic field
   private adv a;

   private adf(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 17;
   }

   public final void a() {
      adv.l(this.a, this.a.c);
   }

   // $FF: synthetic method
   adf(adv var1) {
      this(var1, (byte)0);
   }
}
