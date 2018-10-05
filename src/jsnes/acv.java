package jsnes;

final class acv extends afc {
   // $FF: synthetic field
   private adv a;

   private acv(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 13;
   }

   public final void a() {
      adv.w(this.a, this.a.d);
   }

   // $FF: synthetic method
   acv(adv var1) {
      this(var1, (byte)0);
   }
}
