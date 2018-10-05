package jsnes;

final class aem extends afc {
   // $FF: synthetic field
   private adv a;

   private aem(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 6;
   }

   public final void a() {
      adv.t(this.a, this.a.c);
   }

   // $FF: synthetic method
   aem(adv var1) {
      this(var1, (byte)0);
   }
}
