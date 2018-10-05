package jsnes;

final class acr extends afc {
   // $FF: synthetic field
   private adv a;

   private acr(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      adv.s(this.a, this.a.e);
   }

   // $FF: synthetic method
   acr(adv var1) {
      this(var1, (byte)0);
   }
}
