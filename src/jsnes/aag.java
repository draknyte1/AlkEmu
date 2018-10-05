package jsnes;

final class aag extends afc {
   // $FF: synthetic field
   private adv a;

   private aag(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 5;
   }

   public final void a() {
      int var1 = adv.s(this.a);
      int var2 = adv.e(this.a, var1) - 1 & '\uffff';
      this.a.j(var2);
      this.a.g();
      adv.d(this.a, var1, var2);
   }

   // $FF: synthetic method
   aag(adv var1) {
      this(var1, (byte)0);
   }
}
