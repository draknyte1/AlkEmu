package jsnes;

final class adq extends afc {
   // $FF: synthetic field
   private adv a;

   private adq(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 14;
   }

   public final void a() {
      adv.r(this.a, 0);
   }

   // $FF: synthetic method
   adq(adv var1) {
      this(var1, (byte)0);
   }
}
