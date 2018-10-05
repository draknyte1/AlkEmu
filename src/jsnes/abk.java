package jsnes;

final class abk extends afc {
   // $FF: synthetic field
   private adv a;

   private abk(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 13;
   }

   public final void a() {
      adv.a(this.a, adv.m(this.a));
   }

   // $FF: synthetic method
   abk(adv var1) {
      this(var1, (byte)0);
   }
}
