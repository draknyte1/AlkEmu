package jsnes;

final class rs extends afc {
   // $FF: synthetic field
   private adv a;

   private rs(adv var1, byte var2) {
      this.a = var1;
      super();
      this.a = 13;
   }

   public final void a() {
      int var1 = adv.q(this.a);
      int var2 = adv.c(this.a, var1);
      this.a.b((var2 & this.a.c) == 0);
      var2 = var2 & ~this.a.c & '\uffff';
      this.a.g();
      adv.b(this.a, var1, var2);
   }

   // $FF: synthetic method
   rs(adv var1) {
      this(var1, (byte)0);
   }
}
