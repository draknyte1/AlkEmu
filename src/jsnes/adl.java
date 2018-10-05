package jsnes;

final class adl extends afc {
   // $FF: synthetic field
   private adv a;

   private adl(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 12;
   }

   public final void a() {
      adv.a(this.a, adv.i(this.a));
   }

   // $FF: synthetic method
   adl(adv var1) {
      this(var1, (byte)0);
   }
}
