package jsnes;

final class aad extends afc {
   // $FF: synthetic field
   private adv a;

   private aad(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 16;
   }

   public final void a() {
      adv.C(this.a, adv.J(this.a));
   }

   // $FF: synthetic method
   aad(adv var1) {
      this(var1, (byte)0);
   }
}
