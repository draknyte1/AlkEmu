package jsnes;

final class abm extends afc {
   // $FF: synthetic field
   private adv a;

   private abm(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 24;
   }

   public final void a() {
      adv.a(this.a, adv.o(this.a));
   }

   // $FF: synthetic method
   abm(adv var1) {
      this(var1, (byte)0);
   }
}
