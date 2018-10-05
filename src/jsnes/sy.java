package jsnes;

final class sy extends afc {
   // $FF: synthetic field
   private adv a;

   private sy(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      adv.c(this.a, adv.b(this.a));
   }

   // $FF: synthetic method
   sy(adv var1) {
      this(var1, (byte)0);
   }
}
