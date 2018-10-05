package jsnes;

final class afp extends afc {
   // $FF: synthetic field
   private adv a;

   private afp(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 24;
   }

   public final void a() {
      adv.A(this.a, adv.Q(this.a));
   }

   // $FF: synthetic method
   afp(adv var1) {
      this(var1, (byte)0);
   }
}
