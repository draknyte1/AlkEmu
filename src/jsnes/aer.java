package jsnes;

final class aer extends afc {
   // $FF: synthetic field
   private adv a;

   private aer(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 18;
   }

   public final void a() {
      adv.m(this.a, this.a.c);
   }

   // $FF: synthetic method
   aer(adv var1) {
      this(var1, (byte)0);
   }
}
