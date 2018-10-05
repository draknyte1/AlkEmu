package jsnes;

final class adr extends afc {
   // $FF: synthetic field
   private adv a;

   private adr(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 25;
   }

   public final void a() {
      adv.a(this.a, adv.a(this.a));
   }

   // $FF: synthetic method
   adr(adv var1) {
      this(var1, (byte)0);
   }
}
