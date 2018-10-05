package jsnes;

final class bc extends afc {
   // $FF: synthetic field
   private adv a;

   private bc(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      adv.C(this.a, adv.D(this.a));
   }

   // $FF: synthetic method
   bc(adv var1) {
      this(var1, (byte)0);
   }
}
