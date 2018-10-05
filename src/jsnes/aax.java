package jsnes;

final class aax extends afc {
   // $FF: synthetic field
   private adv a;

   private aax(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 11;
   }

   public final void a() {
      adv.a(this.a, adv.c(this.a));
   }

   // $FF: synthetic method
   aax(adv var1) {
      this(var1, (byte)0);
   }
}
