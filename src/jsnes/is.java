package jsnes;

final class is extends afc {
   // $FF: synthetic field
   private adv a;

   private is(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      adv.D(this.a, adv.D(this.a));
   }

   // $FF: synthetic method
   is(adv var1) {
      this(var1, (byte)0);
   }
}
