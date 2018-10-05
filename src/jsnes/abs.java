package jsnes;

final class abs extends afc {
   // $FF: synthetic field
   private adv a;

   private abs(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 12;
   }

   public final void a() {
      adv.e(this.a, adv.i(this.a));
   }

   // $FF: synthetic method
   abs(adv var1) {
      this(var1, (byte)0);
   }
}
