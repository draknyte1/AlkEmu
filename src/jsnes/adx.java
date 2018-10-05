package jsnes;

final class adx extends afc {
   // $FF: synthetic field
   private adv a;

   private adx(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 7;
   }

   public final void a() {
      adv.a(this.a, adv.j(this.a));
   }

   // $FF: synthetic method
   adx(adv var1) {
      this(var1, (byte)0);
   }
}
