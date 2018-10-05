package jsnes;

final class adt extends afc {
   // $FF: synthetic field
   private adv a;

   private adt(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 14;
   }

   public final void a() {
      adv.a(this.a, adv.n(this.a));
   }

   // $FF: synthetic method
   adt(adv var1) {
      this(var1, (byte)0);
   }
}
