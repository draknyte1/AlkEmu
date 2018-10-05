package jsnes;

final class acu extends afc {
   // $FF: synthetic field
   private adv a;

   private acu(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 19;
   }

   public final void a() {
      adv.u(this.a, this.a.c);
   }

   // $FF: synthetic method
   acu(adv var1) {
      this(var1, (byte)0);
   }
}
